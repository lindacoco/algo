package algo.practice;

public class Factorial {
	
	public static void main(String[] args) {
	    int num = 5;
		System.out.println(num+"! = "); 
		
		
		int result =1;
		for(int i= num; i>0; i--) {
			result *=i;
			System.out.print(i);
			System.out.print(i==1?"=":"*");
		  }
		  System.out.println(result);
	
	   }
	
}
