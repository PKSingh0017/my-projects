class Tv{
	String cname;
	int size;
}

class ColourTv extends Tv{

	String type;

	ColourTv(String name,int n,String t){
		super.cname = name;
		super.size = n;
	       	type = t;
	}

	public void Display(){
	       System.out.println("Comapny name : "+cname+"\nSize :"+size+"\nType : "+type);
	}	       
}


class BwTv extends Tv{

	boolean working ;
	BwTv(String name,int n,boolean t){
                super.cname = name;
                super.size = n;
                working = t;
        }

        public void Display(){
               System.out.println("Comapny name : "+cname+"\nSize :"+size+"\nWorking Condition : "+working);
        }
}

class Test{
	public static void main(String...k){
		ColourTv ctv = new ColourTv("LG",13,"LCD");
		ctv.Display();
		BwTv btv = new BwTv("Bajaj",12,true);
		btv.Display();
	}
}



