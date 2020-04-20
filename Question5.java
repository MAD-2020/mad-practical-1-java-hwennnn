import java.util.Scanner;


public class Question5
{
	
	public static int mode(int a[]) {
	    int maxValue, maxCount;

	    for (int i = 0; i < a.length; ++i) {
	        int count = 0;
	        for (int j = 0; j < a.length; ++j) {
	            if (a[j] == a[i]) ++count;
	        }
	        if (count > maxCount) {
	            maxCount = count;
	            maxValue = a[i];
	        }
	    }

	    return maxValue;
	}
	
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    
    int[] lst = new int[n];
    
    for (int i = 0; i < n; i++) {
    	lst[i] = in.nextInt();
    }
    System.out.println(mode(lst));
    
    
  }
}
