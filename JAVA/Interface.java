interface I
{
	void X();
}

class B implements I{
	public void X(){
		System.out.println("Some Functionality");
	}
}

class InterfaceExample{
	public static void main(String...k){
		I i =new B();
		i.X();
	}
}
