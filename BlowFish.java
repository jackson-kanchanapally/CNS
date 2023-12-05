import javax.crypto.*;
import java.util.*;

public class BlowFish {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String plainText = sc.nextLine();
        KeyGenerator keyGen = KeyGenerator.getInstance("Blowfish");
        keyGen.init(128); // Set the key size to 128 bits (can be up to 448 bits)
        // Generate a random Blowfish key
        SecretKey secretKey = keyGen.generateKey();
        System.out.println("Generated Key: " + secretKey);

        // Create a Blowfish cipher instance
        Cipher blowfishCipher = Cipher.getInstance("Blowfish");

        blowfishCipher.init(Cipher.ENCRYPT_MODE, secretKey);

        byte[] encryptedBytes = blowfishCipher.doFinal(plainText.getBytes());

        System.out.println("Encrypted: " + encryptedBytes);

        // Initialize the cipher for decryption using the same key
        blowfishCipher.init(Cipher.DECRYPT_MODE, secretKey);

        // Decrypt the encrypted text
        byte[] decryptedBytes = blowfishCipher.doFinal(encryptedBytes);
        String decryptedText = new String(decryptedBytes);
        System.out.println("Decrypted: " + decryptedText);
    }
}
