import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class BlowFish {

    public static void main(String[] args) {
        try {
            String plainText = "Hello, this is a message to encrypt using Blowfish!";
            String keyString = "MySecretKey"; 

            byte[] keyData = keyString.getBytes(StandardCharsets.UTF_8);
            SecretKey secretKey = new SecretKeySpec(keyData, "Blowfish");

            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encrypted = cipher.doFinal(plainText.getBytes());

            String encryptedString = Base64.getEncoder().encodeToString(encrypted);
            System.out.println("Encrypted: " + encryptedString);

            // Decryption
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(encryptedString));
            String decryptedString = new String(decrypted);
            System.out.println("Decrypted: " + decryptedString);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
