import java.lang.* ;
class Leapyear{
	public static void main(String...k){
		//int y = 2014;
		Integer y = new Integer(k[0]); 
		if(y%4 == 0){
			if(y%100 == 0 && y%400 != 0  ){
				System.out.println("Not a Leap Year");
			}
			else{
				System.out.println("Leap Year");
			}
		}
		else{
			System.out.println("Not a Leap Year");
		}
	}
}
