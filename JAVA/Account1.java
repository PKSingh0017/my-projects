import java.util.*;
import java.lang.*;

class Account{
        public String name;
        public int accno;
}

class CurrentAcc extends Account {
        public float rate;
    CurrentAcc(String n,int i,float r){
        super.name = n;
        super.accno = i;
        rate = r;
    }
    void display(){
        System.out.println("Name : "+super.name+"Acc no. : "+super.accno+"Rate : "+rate);
    }
}


class SavingAcc extends Account {
        public float rate;
    SavingAcc(String n,int i,float r){
        super.name = n;
        super.accno = i;
        rate = r;
    }
    void display(){
        System.out.println("Name : "+super.name+"Acc no. : "+super.accno+"Rate  : "+rate);
    }
}

class Test
{  
    public static void main(String args[])
    {
        CurrentAcc ca = new CurrentAcc("Balgopal",007,8);
        ca.display();
        SavingAcc sa = new SavingAcc("Raghu",51571377,10);
        sa.display();
    }
}
