import java.lang.*;
import java.util.*;


class StringOrder{
	public static void main(String...k){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Words...");
		int n = sc.nextInt();
		//System.out.println("");
		String[] a = new String[n+1];
		for(int i = 0;i <= n;i++){
			a[i] = sc.nextLine();
		}
		for(int i = 1;i < n+1 ; i++){
			for(int j = i;j < n ;j++){
				if((int)a[j].charAt(i) > (int)a[j+1].charAt(i)){
					String temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}

		for(int i = 0;i<n+1;i++){
			System.out.println(a[i]+"");
		}
	
	}

}
