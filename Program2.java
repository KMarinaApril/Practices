import java.util.*;


public class Program2 {

	 
    public static void main(String[] args) {
       
    	Scanner in = new Scanner (System.in); 
        System.out.print("Input 1-7 as a day of week: ");
        
        
        if (in.hasNextInt())
        {        	       	
        	int num = in.nextInt();
        	Inputs (num);  
             in.close();
        }else {
        	
        	System.out.println("Input is not a number. ");
        	}
    }  

static void Inputs (int number) {
	
	if (number>0 && number<8) {
		switch(number){   
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
    }
	}
	else { 	
        	System.out.println("Input is not valid. ");     
        	}
}
}

    	
        