import javax.crypto.*;
import java.util.*;

public class AES {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String plainText = sc.nextLine();
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        SecretKey secretKey = keyGen.generateKey();
        System.out.println("Generated Key: " + secretKey);
        Cipher aesCipher = Cipher.getInstance("AES");
        aesCipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = aesCipher.doFinal(plainText.getBytes());
        System.out.println("Encrypted: " + encryptedBytes);
        aesCipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedBytes = aesCipher.doFinal(encryptedBytes);
        String decryptedText = new String(decryptedBytes);
        System.out.println("Decrypted: " + decryptedText);
    }
}
