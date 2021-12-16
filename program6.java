import java.util.Scanner;
class program6{
public static void main(String args[]){
int i,n,p,q;
int arr[]=new int[100];
Scanner sc=new Scanner(System.in);
System.out.print("enter the size of the array:");
n=sc.nextInt();
System.out.print("enter array elements:");
for(i=0;i<n;i++){
arr[i]=sc.nextInt();
}
System.out.print("the prime number are");
for(i=0;i<n;i++){
p=2;
q=1;
while(p<arr[i]){
if(arr[i]%p==0){
q=0;
break;
}
p++;
}
if(q==1){
System.out.println(" "+arr[i]);
}
}
}
}
