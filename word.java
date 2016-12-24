import java.util.Scanner;
public class word {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("ENTER THE WORD:");
String word=in.next();
String word1=word.toLowerCase();
String word2="";
for(int i=0;i<word1.length();i++)
{
if(word1.charAt(i)=='a'||word1.charAt(i)=='e'||word1.charAt(i)=='i'||word1.charAt(i)=='o'||word1.charAt(i)=='u')
{
word2+=(char)(word1.charAt(i)+1);
}
else
word2+=word1.charAt(i);
}
System.out.println(word2);
}
}