import java.util.Scanner;
import java.util.regex.Pattern;
public class Program {
 
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in); 
       System.out.print("Input a sentence: ");
       String sentence = in.nextLine();
       in.close();
       StringBuffer strBuf = new StringBuffer (sentence);
       
       RevOrder (strBuf);
       System.out.println("==========");
       Words (sentence);
       System.out.println("==========");
       ReplaceSent (sentence);
       System.out.println("==========");
       GettingSent (sentence);
       System.out.println("==========");
       
      
    }
    
    //Reverse Order
    static void RevOrder (StringBuffer Order) {
    	Order.reverse();
    	System.out.print("Reverse order: ");
    	System.out.println(Order.toString());
    }
    
    //Split by Words
    static void Words (String sentence) {
    	String[] words = sentence.split("\\s*(\\s|,|!|\\.)\\s*");
    	System.out.println("Sentence by words from a new line:");
    	for (String word:words) {
    		System.out.println(word);
    	}
    }
    //Replaced by "*"
    static void ReplaceSent (String sentence) {
    	String newStr = sentence.replaceAll(" ", "*");
    	System.out.println("Replaced sentence:");
    	System.out.println(newStr);
    }
    
    //Register
    static void RegisterSent (String sentence) {
    	System.out.println("Sentence with UpperCase:");
    	System.out.println(sentence.toUpperCase());
    }
    
    //Getting Char
    static void GettingSent (String sentence) {
    	int start = 4;
    	int end = 10;
    	char [] dst = new char [end - start];
    	sentence.getChars(start, end, dst, 0);
    	System.out.println("Sentence from symbols 5-10:");
    	System.out.println(dst);
    	
    }
}