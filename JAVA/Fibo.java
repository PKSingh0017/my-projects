import java.util.*;
class Fibo{
	public static void main(String...args){
		int i = 0,j = 1,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of digits : ");
		int x = sc.nextInt();
		System.out.print(""+i+"  "+j+"  ");
		x = x-2;
		while(x > 0){
			k = j;
			j = i + j;
			i = k;
			System.out.print(""+j+"  ");
			x--;
		}
		System.out.println("");
	}
}
