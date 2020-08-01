package algo.practice;

public class BinarySearchTree {
	public static void main(String[] args) {
		int array[] = {1,16,17,93,99};
		int target = 99;
		
		
		
		findOne(array,target);
	}

	private static void findOne(int[] array, int target) {
		int start =0;
		int end= array.length-1;
		int mid;
		
		while(start <=end) {
			mid = (start+end)/2;
			
			if(target == array[mid]) {
				System.out.println(target+"은 array의"+(mid+1)+"번째 자리에 위치합니다. 인덱스 번호로는 "+mid);
				break;
			}else if(target<array[mid]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
			
		}
		
	}

}
