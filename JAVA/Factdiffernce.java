package balgopal;

class Factorial{
    public long fact;
    
     public static void main(String[] args){
     	System.out.println("Hello");
     }

    public void getfact(int n)
    {
        fact = 1;
        for(int i=1 ;i <= n ; i++ )
            fact *= i ;
    }
}

public class Factdiffernce{

    public static void main(String[] args) {
        Factorial f1 = new Factorial();
        Factorial f2 = new Factorial();
        f1.getfact(5);
        f2.getfact(2);
        System.out.println("The difference in the factorial is : "+ (f1.fact - f2.fact) );
    }
}
