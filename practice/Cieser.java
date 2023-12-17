import java.util.*;
public class Cieser{
public static void main(String args[]){
    String ct="",de="";
    Scanner sc=new Scanner(System.in);
    System.out.println("enter plain text");
    String pt=sc.nextLine();
    System.out.println("enter key");
    int key=sc.nextInt();
    for(int i=0;i<pt.length();i++){
        char ch=pt.charAt(i);
        if(ch==' '){
            ct+=ch;
        }
        else{
            if(Character.isUpperCase(ch)){
                int p=ch;
                p=p-65;
                p=(p+key)%26;
                p=p+65;
                char es=(char)(p);
                ct+=es;
            }
            else{
                int p=ch;
                p=p-97;
                p=(p+key)%26;
                p=p+97;
                char es=(char)(p);
                ct+=es;
            }
        }
    }
    for(int i=0;i<ct.length();i++){
        char ch=ct.charAt(i);
        if(ch==' '){
            de+=ch;
        }
        else{
            if(Character.isUpperCase(ch))
            {
                int p=ch;
                p=p-65;
                p=(p-key)%26;
                p=p+65;
                char es=(char)(p);
                de+=es;
            }
            else{
                int p=ch;
                p=p-97;
                p=(p-key)%26;
                p=p+97;
                char es=(char)(p);
                de+=es;
            }
        }
    }
    System.out.println("Enceypted : "+ct);
    System.out.println("decrypted : "+de);
}
}