import javax.crypto.*;
import java.util.*;

public class Des {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter plain text");
        String pt = sc.nextLine();
        KeyGenerator keygen = KeyGenerator.getInstance("DES");
        SecretKey sk = keygen.generateKey();
        System.out.println(sk);
        Cipher ci = Cipher.getInstance("DES");
        ci.init(Cipher.ENCRYPT_MODE, sk);
        byte[] encryptedBytes = ci.doFinal(pt.getBytes());
        System.out.println("Encryption : " + encryptedBytes);
        ci.init(Cipher.DECRYPT_MODE, sk);
        byte[] decBytes = ci.doFinal(encryptedBytes);
        String des = new String(decBytes);
        System.out.println("Decryption : " + des);
    }
}
