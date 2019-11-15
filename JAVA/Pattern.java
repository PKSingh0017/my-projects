class Pattern{
	public static void main(String...k){
		int i;
		int j;
		for (i=0;i<10;i++){
			for (j = 10 - i;j>0;j--)
				System.out.print(" ");
			for (j = 0; j < i ;j++)
				System.out.print("* ");
			System.out.println("");
		}
	}
}
