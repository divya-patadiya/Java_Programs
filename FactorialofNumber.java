import java.util.*;
class FactorialofNumber{
	public static void main(String[] args){
		int no;
		System.out.println("Enter Any No:");
		Scanner s=new Scanner(System.in);
		no=s.nextInt();
		int f=1;
		for(int i=no;i>0;i--){
			f=f*i;
		}
		System.out.println("Factorial of "+no+" is "+f);
	}
}