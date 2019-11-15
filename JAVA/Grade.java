import java.lang.*;

class Grade{
	public static void main(String...k){
		int i = new Integer(k[0]);
		System.out.println("Your Marks Is "+i);
		if(i >= 90)
			i = 100;
		else if(i >= 80)
			i = 90 ;
		else if(i >= 70 )
			i = 80;
		else if(i >= 60)
			i = 70;
		else if (i >= 50)
			i = 60;
		switch(i){
			case 100:
				System.out.println("Your Grade is O..!");
				break;
			case 90:
                                System.out.println("Your Grade is A+..!");
                                break;
			case 80:
                                System.out.println("Your Grade is A..!");
                                break;
			case 70:
                                System.out.println("Your Grade is B..!");
                                break;
			case 60:
                                System.out.println("Your Grade is C..!");
                                break;
			default:
				System.out.println("Your Grade is F..!");
			}	
	}
}
