import java.security.*;
import java.util.*;
public class Sha {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the message:");
        String textToHash = sc.nextLine();
        try{
            MessageDigest msg=MessageDigest.getInstance("SHA-1");
            msg.update(textToHash.getBytes());
            byte[] a=msg.digest();
            StringBuilder d=new StringBuilder();
            for(byte b : a){
                String hex=Integer.toHexString(0xff & b);
                if(hex.length()==1){
                    d.append("0");
                }
                d.append(hex);
            }
            System.out.println(d.toString());
        }
        catch(NoSuchAlgorithmException e){
            System.out.println(e);
        }
    }
}
