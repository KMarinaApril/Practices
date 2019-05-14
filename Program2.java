import java.util.*;

public class Program2 {

	 
    public static void main(String[] args) {
       
    	Scanner in = new Scanner (System.in); 
        System.out.print("Input a number of day of week: ");
        int num = in.nextInt();
        in.close();
    	try {
    		switch(num){
    	   	             
    	    case 1: 
    	        System.out.println("Monday");
    	        break;
    	    case 2: 
    	        System.out.println("Tuesday");
    	        break;
    	    case 3: 
    	        System.out.println("Wednesday");
    	        break;
    	    case 4: 
    	        System.out.println("Thursday");
    	        break;
    	    case 5: 
    	        System.out.println("Friday");
    	        break;
    	    case 6: 
    	        System.out.println("Saturday");
    	        break;
    	    case 7: 
    	        System.out.println("Sunday");
    	        break;
    	    default:
    	        System.out.println("No matches. Input is wrong.");
    	        }
    		}
    	catch (Exception ex) {
    		System.out.println(ex.getMessage());
    	}
    	}
    }
