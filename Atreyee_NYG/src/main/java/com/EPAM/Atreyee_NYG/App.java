package com.EPAM.Atreyee_NYG;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App {
	    public static void main( String[] args )
	    {
	        //System.out.println( "Hello World!" );
	    	Scanner sc = new Scanner(System.in);
	    	String carr[]= {"Candies","Lollipops","Wafers","FiveStar","Cadbury"}; //chocolate names
	    	int cprice[]= {20,15,35,40,120}; //chocolate prices
	    	double cweight[]={100,135.6,100,175.3,200}; //chocolate weights
	    	String sarr[]= {"SonPapdri","Sondesh","Rashgulla","RashMalai","Laddu"}; //sweet names
	    	int sprice[]= {20,15,22,12,10}; //sweet prices
	    	double sweight[]= {4,5,2,7,3}; //sweet quantity
	    	Chocolate c=new Chocolate();
	    	Sweet s=new Sweet();
	    	c.bsort(carr, cprice, cweight);
	    	s.bsort(sarr, sprice, sweight);
	    	while(true)
	    	{
	    		System.out.println("Choose New Year Gifts.");
	    		System.out.println("Enter 1 for Chocolates list:");
	    		System.out.println("Enter 2 for Sweets list:");
	    		System.out.println("Enter 3 for both Chocolates and Sweets list:");
	    		System.out.println("Enter 4 to Exit");
	    		System.out.print("Enter your choice: ");
	    		//Scanner sc = new Scanner(System.in);
	    		int choice = sc.nextInt();
	    		switch(choice)
	    		{
	    			case 1: System.out.println("\nAvailable Chocolate Products: ");
	    					c.show(carr, cprice, cweight);
	    					System.out.println("\nEnter your price range: ");
	    					int range=sc.nextInt();
	    					c.rshow(carr, cprice, cweight, range);
	    					break;
	    			case 2: System.out.println("\nAvailable Sweet Products: ");
							s.show(sarr, sprice, sweight);
							System.out.println("\nEnter your price range: ");
							int rrange1=sc.nextInt();
							s.rshow(sarr, sprice, sweight, rrange1);
							break;
					case 3: System.out.println("\nAvailable Chocolate Products: ");
	    					c.show(carr, cprice, cweight);
	    					System.out.println("\nEnter your price range: ");
	    					int rrange2=sc.nextInt();
	    					c.rshow(carr, cprice, cweight, rrange2);
	    					System.out.println("\nAvailable Sweet Products: ");
							s.show(sarr, sprice, sweight);
							System.out.println("\nEnter your price range: ");
							int rrange3=sc.nextInt();
							s.rshow(sarr, sprice, sweight, rrange3);
							break;
	    			case 4: System.exit(0);
	    			default: System.out.println("\nInvalid Choice");
	    		}
	    	}
	    }
	}


