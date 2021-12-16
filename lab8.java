import java.io.*;
import java.util.*;
public class lab8{
        public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the bucket size");
        int n=Sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the no of packets: ");
        int p=Sc.nextInt();
        System.out.println("enter the data rate: ");
        for(int i=0;i<p;i++){
                a[i]=Sc.nextInt();
         if(a[i]==0)
         System.out.println(a[i]+" is invalid packet");
  }     
         System.out.println("enter the output rate: ");
         int out=Sc.nextInt();
         for(int i=0;i<p;i++)
         {
                if(a[i]>n)
                System.out.println(a[i]+"bucket overflow");
                else if(a[i]==out)
                System.out.println("data trasmitted is " +a[i]);
                else if(a[i]>out)
                {
                        while(a[i]!=0 && a[i]>out)
                        {
                             System.out.println("packet transmitted is "+out);
                             a[i]=a[i]-out;
                         }
                         System.out.println("packet transmitted is "+a[i]);
                } 
         }               
     }              
   }
