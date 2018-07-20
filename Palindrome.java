import java.util.*;
public class Palindrome {
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int temp=n;
int a,sum=0;
while(n!=0){
	a=n%10;
	sum=sum*10+a;
	n=n/10;
}
	if(temp==sum){
		System.out.println("p");
		
	}
	else{
		System.out.println("np");
		
	}
}
}
