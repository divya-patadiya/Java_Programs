import java.util.*;
class WordsinString{
	public static void main(String[] args){
		String str="";
		System.out.println("Enter Any String: ");
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		String[] words=str.trim().split(" ");
		System.out.println("Number of Words in String: "+words.length);
		for(int i=0;i<words.length;i++){
			System.out.println("Words are: "+ words[i]);
		}
	}
}