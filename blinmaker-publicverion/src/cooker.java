import java.util.Scanner;

public class cooker {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int eggsAmount;
		int eggsMin = 1;
		int milkAmount;
	    int milkMin = 200; //milkiliter
 	    int flourAmount;
	    int flourMin =100; //grams
	    
	    System.out.println("Hello User");
	    System.out.println("Blinmaker is starting up");
	    System.out.println("How many eggs do you have?");
	    
	    Scanner userInput;
	    userInput = new Scanner(System.in);
	    eggsAmount = userInput.nextInt();
	    System.out.println("you have" +  eggsAmount +  " eggs");
	    //eggs done
	    
	    System.out.print("How much milk do you have?");
	    userInput = new Scanner(System.in);
	    milkAmount = userInput.nextInt();
	    System.out.println("you have" +  milkAmount +  "ml milk");
	    
	    System.out.print("How much flour do you have?");
	    userInput = new Scanner(System.in);
	    flourAmount = userInput.nextInt();
	    System.out.println("you have" +  flourAmount +  "grams");
	    
	    //main code here
	    if (eggsAmount < eggsMin ||  milkAmount < milkMin || flourAmount < flourMin ){
	    	System.out.println("no blin today  : (");
	    } else {
	    flourAmount = flourAmount / flourMin;
	    System.out.println("you have"  + flourAmount +  "portions of flour");
	    
	    milkAmount = milkAmount / milkMin;
	    System.out.println("you have"  + milkAmount +  "portions  of milk");
	    
	    //find smallest number of all
	    int smallest = 0;
	    if (eggsAmount <= milkAmount && milkAmount <= eggsAmount) {
	    } else if (milkAmount <= flourAmount && milkAmount <= eggsAmount) {
	    	 smallest = milkAmount;
	    } else {
	    smallest = flourAmount;
	    }
	    System.out.println(" "); //every portion is 4 blins
	    System.out.println("you can make  " + smallest*4 + " blins" );
	    System.out.println(" ");
	    System.out.println("you will need   " + smallest*eggsMin + "eggs");
	    System.out.println("you will need   " + smallest*flourMin + "flour");
	    System.out.println("you will need   " + smallest*milkMin + "milk");
	    System.out.println(" ");
	    System.out.println("blinmaker shutting down.. ");
	    
	    }
	    
	}

}
