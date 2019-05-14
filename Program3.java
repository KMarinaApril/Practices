import java.util.Scanner;
import java.util.Arrays;

public class Program3 {
	 public static void main(String[] args) {
		 String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex","Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" }; 
		 int[] time = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };
	    
		 boolean isSorted = false;
	        int buf;
	        String name;
	        while(!isSorted) {
	            isSorted = true;
	            for (int i = 0; i < time.length-1; i++) {
	                if(time[i] > time[i+1]){
	                    isSorted = false;
	 
	                    buf = time[i];
	                    time[i] = time[i+1];
	                    time[i+1] = buf;
	                    
	                    name = names[i];
	                    names[i]=names[i+1];
	                    names[i+1]=name;
	                }
	            }
	        }
	       int n=1;
	        for (int j = 0; j < time.length; j++) {
		        System.out.print(n+". ");
		        System.out.print(time[j]);
		        System.out.print(" - ");
		        System.out.println(names[j]); 
		        n++;
		        }
	        }
	 } 