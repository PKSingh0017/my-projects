package mybook;

import java.util.Scanner;

class Book{

    String name;
    String publication;
    float price;

    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the Book : ");
        name = sc.nextLine();
        System.out.println("Enter the Publication : ");
        publication = sc.nextLine();
        System.out.println("Enter the Price of the book : ");
        price = sc.nextFloat();
    }

    public void printData(){
        System.out.println("Name : "+name);
        System.out.println("Publication : "+publication);
        System.out.println("Price : "+price);
    }

    public static void main(String...k) {
        Book b1 = new Book();
        b1.getData();
        b1.printData();
//	System.out.println("Balgopal");
    }
}
