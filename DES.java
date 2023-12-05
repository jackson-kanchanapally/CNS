import javax.crypto.*;
// import javax.crypto.KeyGenerator;
// import javax.crypto.SecretKey;
import java.util.*;

public class DES {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String plainText = sc.nextLine();
        KeyGenerator keyGen = KeyGenerator.getInstance("DES");
        SecretKey secretKey = keyGen.generateKey();
        System.out.println("Generated Key: " + secretKey);
        // Cipher desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        Cipher desCipher = Cipher.getInstance("DES");
        desCipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = desCipher.doFinal(plainText.getBytes());
        System.out.println("Encrypted: " + encryptedBytes);
        desCipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedBytes = desCipher.doFinal(encryptedBytes);
        String decryptedText = new String(decryptedBytes);
        System.out.println("Decrypted: " + decryptedText);
    }
}
