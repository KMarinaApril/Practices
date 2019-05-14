import java.util.Scanner;


public class Program5 {

	public static void main(String[] args) {
		
			 int i, j, N;
			 System.out.print("Input side of size: ");
			 Scanner side = new Scanner (System.in);
			 			 			 
			 N = (side.nextInt()*2 - 1);
			 side.close();

			 			 		 			 
			 for(i = 0; i < N; i++)
			 {
			   for(j = 0; j < N; j++)
			   {
			     if (j==N/2 - i || j==N/2+i || j == i - N/2||j==N - i +N/2-1)
			     {
			    	 System.out.print("*");
			     } else
			    	   System.out.print(" ");
			   }
			   System.out.println();

			}
	}
}
