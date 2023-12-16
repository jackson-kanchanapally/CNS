import java.security.*;
import java.util.*;
public class Sha {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the message:");
        String textToHash = sc.nextLine();

        try {
            // Create a MessageDigest instance for SHA-1
            MessageDigest sha1Digest = MessageDigest.getInstance("SHA-1");

            // Update the digest with the specified byte array (in this case, the string converted to bytes)
            sha1Digest.update(textToHash.getBytes());

            // Generate the hash
            byte[] hashedBytes = sha1Digest.digest();

            // Convert the byte array to a hexadecimal string representation
            StringBuilder hexString = new StringBuilder();
            for (byte hashedByte : hashedBytes) {
                String hex = Integer.toHexString(0xff & hashedByte);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            System.out.println("SHA-1 hash of '" + textToHash + "' is: " + hexString.toString());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}

