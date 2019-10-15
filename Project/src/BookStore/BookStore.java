package BookStore;

import java.util.Scanner;

public class BookStore {
	
	static Scanner sc = new Scanner(System.in);
	static String books[]= {"Java","C","Python"};
	final static double studentDiscount=0.3;
	final static double teacherDiscount=0.4;
	final static double alienDiscount=0.1;
	
	
    public static void main(String[] args) {
		
    	pr("========Welcome to our Book Shop========");
    	pr("Which Book do you want ??");
    	
    	String myName = sc.nextLine();
    	
    	if (books[0].toLowerCase().equals(myName.toLowerCase())) {
    		
    		prln("You opted "+books[0] + " book");
    		
    		calculatePrice(books[0]);
    		
    	}else if (books[1].toLowerCase().equals(myName.toLowerCase())) {
    		
    		prln("You opted "+books[1] + " book");
    		
    		calculatePrice(books[1]);
    		
    	}else if (books[2].toLowerCase().equals(myName.toLowerCase())) {
    		
    		prln("You opted "+books[2] + " book");
    		
    		calculatePrice(books[2]);
    			
    	}else {
    		
    		pr("Sorry , we don't have this book..");
    	}
    	
	}
    static void calculatePrice(String myname) {
    	 
    	pr("Are you Student ,Teacher ,Alien??\nAns ??");
    	
    	String answer=sc.nextLine();
    	
    	double price=200;
    	
        if (answer.toLowerCase().equals("student")) {
        	 pr("Book price is :"+price);
        	 pr("Your Book Discount is :"+studentDiscount+"%");
    		price=price-(price*studentDiscount);
    		
    		showPrice(price);
    		
    	}else if (answer.toLowerCase().equals("teacher")) {
    		pr("Book price is :"+price);
    		pr("Your Book Discount is :"+teacherDiscount+"%");
    		price=price-(price*teacherDiscount);
    		showPrice(price);
    		
    	}else if (answer.toLowerCase().equals("alien")) {
    		pr("Book price is :"+price);
    		pr("Your Book Discount is :"+alienDiscount+"%");
    		price=price-(price*alienDiscount);
    		showPrice(price);
    			
    	}else {
    		
    		pr("Sorry , we can't serve for this book..");
    	}
    	
    	
    }
   static void showPrice(double price) {
	  
    	pr("Your total paybale amount (tk) : "+ price);
    	pr("Thank you for shopping from our shop");
    }
    
    
    static void pr(Object myObject) {
  	  System.out.println(myObject);
    }
    
    static void prln(Object myObject) {
  	  System.out.println(myObject);
    }
    
}
