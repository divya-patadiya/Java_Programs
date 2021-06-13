import java.util.*;
class FibonacciSeries{
	public static void main(String[] args){
		int sum=0,next=1,prev=0,no;
		System.out.println("Enter Ending number of Fibonnaci Series: ");
		Scanner s=new Scanner(System.in);
		no=s.nextInt();
		System.out.println("Fibonnaci Series is : ");
		System.out.print(prev+" "+next);
		for(int i=2;i<no;i++){
			sum=prev+next;
			System.out.print(" "+sum);
			prev=next;
			next=sum;
		}

	}
}