package algo.practice;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
           int[] a= {6, 18,55,7};
           int temp;
           for(int i=0; i<a.length; i++) {
        	   for(int j=0; j<a.length-i -1; j++) {
        		   if(a[j]> a[j+1]) {
        			   temp = a[j];
        			   a[j] = a[j+1];
        			   a[j+1] = temp;
        		   }
        	   }
           }
           for(int i= 0; i<a.length; i++) {
        	   System.out.print(a[i]+" ");
           }
           
       System.out.printf("\n"+"Arrays.sort이용\n");
       Arrays.parallelSort(a);
       for(int i= 0; i<a.length; i++) {
    	   System.out.print(a[i]+" ");
       }
           
	}
	

}
