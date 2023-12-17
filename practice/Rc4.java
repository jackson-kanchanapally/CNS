import javax.crypto.spec.SecretKeySpec;
import javax.crypto.*;
import java.util.*;

public class Rc4 {
    public static String encrypt(String pt, String key) throws Exception {
        SecretKeySpec sk = new SecretKeySpec(key.getBytes(), "Blowfish");
        Cipher ci = Cipher.getInstance("Blowfish");
        ci.init(Cipher.ENCRYPT_MODE, sk);
        byte[] enc = ci.doFinal(pt.getBytes());
        return Base64.getEncoder().encodeToString(enc);
    }

    public static String decrypt(String ct, String key) throws Exception {
        SecretKeySpec sk = new SecretKeySpec(key.getBytes(), "Blowfish");
        Cipher ci = Cipher.getInstance("Blowfish");
        ci.init(Cipher.DECRYPT_MODE, sk);
        byte[] dec = ci.doFinal(Base64.getDecoder().decode(ct));
        return new String(dec);
    }

    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter plain text");
            String pt = sc.nextLine();
            System.out.println("enter key");
            String key = sc.nextLine();
            String cc = encrypt(pt, key);
            System.out.println(cc);
            String cd= decrypt(cc, key);
            System.out.println(cd);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
