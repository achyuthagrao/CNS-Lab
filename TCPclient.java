import java.net.*;
import java.io.*;
class TCPclient{
  public static void main(String args[])throws Exception{
     Socket S=new Socket("192.168.8.31",4000);
     System.out.println("connection successful");
     PrintWriter pr=new PrintWriter(S.getOutputStream());
     pr.println("hello server");
     pr.flush();
       InputStreamReader in=new InputStreamReader(S.getInputStream());
       BufferedReader b=new BufferedReader(in);
 String str=b.readLine();
 System.out.print("server:"+str);
 FileReader fr=new FileReader("abc.txt");
int i;
while((i=fr.read())!=-1)
System.out.println((char)i);
     }
     }
    
