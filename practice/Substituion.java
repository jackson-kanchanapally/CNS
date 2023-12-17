import java.util.*;

public class Substituion {
    public static void main(String args[]) {
        String ct = "", de = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter plain text");
        String pt = sc.nextLine();
        String str1 = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder rev = new StringBuilder(str1);
        rev.reverse();
        for(int i=0;i<pt.length();i++){
            char ch=pt.charAt(i);
            if(ch==' ')
            {
                ct+=ch;
            }
            else{
                for(int j=0;j<str1.length();j++){
                    char c=str1.charAt(j);
                    if(ch==c){
                        char es=rev.charAt(j);
                        ct+=es;
                    }
                }
            }

        }
        for(int i=0;i<ct.length();i++){
            char ch=ct.charAt(i);
            if(ch==' '){
                de+=ch;
            }
            else{
                for(int j=0;j<rev.length();j++){
                    char c=rev.charAt(j);
                    if(ch==c){
                        char es=str1.charAt(j);
                        de+=es;
                    }
                }
            }
        }
        System.out.println("Enceypted : "+ct);
    System.out.println("decrypted : "+de);
    }
}
