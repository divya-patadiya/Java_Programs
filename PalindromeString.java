import java.util.*;
class PalindromeString{
	public static void main(String[] args){
		String str;
		String rev="";
		System.out.println("Enter Any String[Eiterh in Uppercase or Lowercase]: ");
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		for(int i=str.length()-1;i>=0;i--){
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
			System.out.println(str+" String is Palindrome");
		else
			System.out.println(str+" String is not Palindrome");
	}
}