package algo.practice;

public class Fibonacci {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int c;
		System.out.println("피보나찌");
		System.out.print(a +" ");
		System.out.print(b +" ");
		for (int i=0; i<8; i++) {
			c = a+b;
			System.out.print(c +" ");
			a = b;
			b = c;
		}
		System.out.println();
		System.out.println(" 재귀함수 방법------ ");
		// 재귀함수
		int input = 10;
		for(int i =0; i<input; i++) {
			System.out.print(fibo(i) + " ");
		}
		
		

	}

	private static int fibo(int n) {
		if(n<=1) {
			return 1;
		}
		return fibo(n-1)+ fibo(n-2);
	}

}
