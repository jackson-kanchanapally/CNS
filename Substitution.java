import java.util.*;

public class Substitution {
    public static void main(String args[]) {
        String pt = "", ct = "", decrypt = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the plain text:");
        pt = sc.nextLine();
        String str1 = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder rev = new StringBuilder(str1);
        rev.reverse();
        for (int i = 0; i < pt.length(); i++) {
            char l = pt.charAt(i);
            if (l == ' ') {
                ct += l;
            } else {
                for (int j = 0; j < str1.length(); j++) {
                    char s = str1.charAt(j);
                    if (l == s) {
                        char es = rev.charAt(j);
                        ct += (es);
                    }
                }
            }
        }
        for (int i = 0; i < ct.length(); i++) {
            char l = pt.charAt(i);
            if (l == ' ') {
                decrypt += l;
            } else {
                for (int j = 0; j < str1.length(); j++) {
                    char s = rev.charAt(j);
                    if (l == s) {
                        char es = str1.charAt(j);
                        decrypt += (es);
                    }
                }
            }
        }
        System.out.println("Plain Text : " + pt + "\nCypher Text : " + ct + "\nDecrypt : " + decrypt);
    }
}
