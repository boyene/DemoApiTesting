package kkk;

import StringHandling.Question1;

public class Question1Task {
    int BookId;
    String Title;
    String Author;
    double Price;
    double discountPrice;
    double discountAmount;
    double finalPrice;
    static void main() {

        Question1Task q1 = new Question1Task();
        q1.BookId = 101;
        q1.Title = "Java";
        q1.Author = "James Cameron";
        q1.Price = 2000.0;
        q1.discountPrice = 1.99;

        q1.discountAmount= (q1.Price*q1.discountPrice)/100;
        q1.finalPrice=(q1.Price-q1.discountAmount);
        q1.displayDetails();


    }
    void displayDetails(){
        System.out.println("Book Id : "+BookId);
        System.out.println("Book Title : "+Title);
        System.out.println("Book Author : "+Author);
        System.out.println("Book Price : "+Price);
        System.out.println("Book Discount Price : "+discountPrice);
        System.out.println("Discount Amount : "+discountAmount);
        System.out.println("Final Price : "+finalPrice);
    }
}
