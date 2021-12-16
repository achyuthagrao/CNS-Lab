import java.net.*;
import java.io.*;
class TCPserver{
 public static void main(String args[])throws Exception{
 ServerSocket Sc=new ServerSocket(4000);
       Socket S=Sc.accept();
        PrintWriter pr=new PrintWriter(S.getOutputStream());
     pr.println("abc.txt");
     FileReader fr=new FileReader("abc.txt");
int i;
while((i=fr.read())!=-1)
System.out.println((char)i);
     pr.flush();
       //System.out.print("connection succefully");
       //InputStreamReader in=new InputStreamReader(S.getInputStream());
       //BufferedReader b=new BufferedReader(in);
 //String str=b.readLine();
 //System.out.print("client:"+str);
       }
       }
