import java.util.*;
class OddEven{
	public static void main(String[] args){
		int no;
		System.out.println("Enter Any Number:");
		Scanner s=new Scanner(System.in);
		no=s.nextInt();
		if(no%2==0)
			System.out.println(no+" Number is Even");
		else
			System.out.println(no+" Number is Odd");
	}
}