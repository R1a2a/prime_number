//import java.util.*;
public class prime {

public static void main(String[] args) {
	//Scanner sc = new Scanner(System.in);
	//System.out.println("Enter the number");
	//int n= sc.nextInt();
	int n=20;
	boolean temp=false;
	
	for(int i=2;i<=n/2;++i){
		
		if(n%i==0)
		{
			temp=true;
			break;
			
			
		}
	}
		if(!temp){
			System.out.println("its a prime number");
		}
		else {
			System.out.println("its a not  prime number ");
		}
	
	
	//sc.close();
}

}