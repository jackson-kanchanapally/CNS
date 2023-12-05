import java.util.*;

public class Cieser {
    public static void main(String args[]) {
        String pt = "", ct = "", decryp = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        pt = sc.nextLine();
        System.out.println("enter key");
        int key = sc.nextInt();
        for (int i = 0; i < pt.length(); i++) {
            char ch = pt.charAt(i);
            if (ch == ' ') {
                ct += ch;
            } else {
                if (Character.isUpperCase(ch)) {
                    int p = ch;
                    p = p - 65;
                    p = (p + key) % 26;
                    p = p + 65;
                    char c = (char) (p);
                    ct += c;
                } else {
                    int p = ch;
                    p = p - 97;
                    p = (p + key) % 26;
                    p = p + 97;
                    char c = (char) (p);
                    ct += c;
                }
            }
        }
        for (int i = 0; i < ct.length(); i++) {
            char ch = ct.charAt(i);
            if (ch == ' ') {
                decryp += ch;
            } else {
                if (Character.isUpperCase(ch)) {
                    int p = ch;
                    p = p - 65;
                    p = (p - key) % 26;
                    p = p + 65;
                    char c = (char) (p);
                    decryp += c;
                } else {
                    int p = ch;
                    p = p - 97;
                    p = (p - key) % 26;
                    p = p + 97;
                    char c = (char) (p);
                    decryp += c;
                }
            }

        }
        System.out.println("Plain Text : " + pt + "\nCypher Text : " + ct + "\nDecrypt : " + decryp);

    }
}
