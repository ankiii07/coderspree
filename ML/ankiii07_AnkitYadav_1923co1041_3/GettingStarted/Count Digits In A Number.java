import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int count=0;
			for(int j=num;j>0;j=j/10)
			{
				count++;
			}
			System.out.println(count);
    }
  }