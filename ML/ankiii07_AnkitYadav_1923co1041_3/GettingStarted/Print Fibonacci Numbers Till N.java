import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int f1 = 0;
			int f2 = 1;
			int fib = 0;
			System.out.println(f1);
			System.out.println(f2);
			for(int j=1;j<N-1;j++)
			{
				fib = f1 + f2;
				System.out.println(fib);
				f1 = f2;
				f2 = fib;
			}
   }
  }