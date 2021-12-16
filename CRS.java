import java.net.*;
import java.io.*;
import java.util.*;

class CRS{
public static void main(string[] args){
Scanner sc=new Scanner(system.in);
System.out.println("enter the messange");
String msg,crr,encode=" ";
msg=sc.next();
System.out.println("enter the crs");
crs=sc.next();
int m=msg.length();
int n=msg.length();
encoded=encoded+msg;
char[] gpa=crc.toCharArray();
for(int i=1;i<=n-1;i++)
encoded+='0';
system.out.println("encoded message: "+encoded);
Char[] ea=encoded.toCharArray();
for(int i=1;i<=ea.length-n;)
{
 for(int i=1;i<n;i++)
 ea[i+j]=((ea[i+j]==gpa[j]?'0':'1'));
 for(i=0;i<encoded.length() && ea[i]!='i';i++);
 }
 String fm=new String(ea);
 System.out.println(+msg+fm.substring(fm.length()-n+1));
 System.out.println("1.to test for CRC\n2.to introduce error and test\n3.enter the choice:");
 int i=sc.nextInt();
 char[] tta=new message.toCharArray();
 if(i==1)
 {
 for(int k=0;i<tta.length()-n;i++)
 {
     for(int z=0;z<n;z++)
        tta[k+z]=(tta[k+z]==gpa[z]?'0':'1');
     for(int i=0;i<tta.length() && tta[k]!='1';i++)
 }
 String output=new String(tta);
 if(output.equals("000000"))
 System.out.println("no error");
 else
 System.out.println("error");
 }
 else 
 {
   System.out.println("codeword is:" +new String(tta));
   System.out.println("enter the position you want to alter");
   int pos=sc.nextInt();
   System.out.println("enter the bit you want to change");
   int value=sc.nextInt();
   tta(pos)=(char)value;    
 for(int p=0;p<=tta.length-n;p++)
 {
 for(int q=0;q<n;q++)
 tta[p+q]=((tta[p+q]==gpa[q])?'0':'1');
 for(int r=0;r<encoded.length() && tta[pos]!='1';i++);
 }
 String out=new String(tta);
 if(out.equals("000000"))
 System.out.println("no error");
 else
 System.out.println("error");
 }
 }
 }

