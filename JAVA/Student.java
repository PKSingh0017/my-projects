package student;

import java.util.Scanner;

class Student{
    String name;
    String fname;
    float mark;

    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the Student : ");
        name = sc.nextLine();
        System.out.println("Enter Your Father's Name : ");
        fname = sc.nextLine();
        System.out.println("Enter Your mark : ");
        mark = sc.nextInt();
	
    }

    public void printData(){
        System.out.println("Name : "+name);
        System.out.println("S/O : "+fname);
        System.out.println("Mark : "+mark);
    }

    public static void main(String...k) {
        Student s1 = new Student();
        s1.getData();
        s1.printData();
    }
}
