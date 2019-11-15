import java.util.*;

class Multiplicationtable{
	public static void main(String...k){
		int i;
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("The Multiplication Table of " + x +" :");
		for(i = 0; i < 10;i++){
			System.out.println(""+x+"	"+(i+1)+"	"+(i+1)*x);
		}
	}

}
