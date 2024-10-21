import java.io.*;
import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str1=sc.next();
int k=sc.nextInt();
k=k%str1.length();
 char ch[] = new char[str1.length()];
 int ind=0;
 for (int i=k;i<str1.length(); i++)
 ch[ind++] = str1.charAt(i);
 for (int i=0;i<k;i++)
 ch[ind++]=str1.charAt(i);
String res="";
 for (int i=0;i<ch.length;i++)
 res+=ch[i];
 System.out.print(res);
}
}