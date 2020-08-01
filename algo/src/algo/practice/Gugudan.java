package algo.practice;

public class Gugudan {

	public static void main(String[] args) {
		
		
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i+"*"+j+"= " + i*j);
			}
		}

		System.out.println("===============반대로 9단부터");
		
		for(int i=9; i>0; i--) {
			for(int j=1; j<10; j++) {
				
				System.out.println(i+"*"+j+"= "+i*j);
			}
		}
		
		System.out.println("특정 구구단만.. 3단!");
		int numm =3;
		for(int i=1; i<10; i++) {
			System.out.println(numm+"*"+i+"= "+ numm*i);
		}
		
	}

}
