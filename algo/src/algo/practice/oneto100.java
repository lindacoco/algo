package algo.practice;

public class oneto100 {
	public static void main(String[] args) {
		int sum =0;
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1에서 100까지의 합은 " + sum);
	// 1~100까지 5의 배수의 합계 & 5의 배수의 개수
	int sum2 = 0;
	int cnt = 0;
	for(int i =1; i<=100; i++) {
		if(i%5 ==0) { //5의 배수라면
			System.out.print(i +" ");
			cnt ++;
			sum2 += i;
		}
    }
	System.out.println();
	System.out.println("5의 배수의 합은 " + sum2 );
	System.out.println("5의 배수의 개수는" +cnt);
 }
}