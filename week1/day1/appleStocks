# CompetitiveProgramming
import java.util.*;
import java.lang.*;

class apple{
	public static void main(String[] args) {
		// // int i=0;
		// // int j=0;
		// int diff =0;
		// int diff1=0;
		// int stock[] = new int[]{10,7,5,8,11,9,15};
		// for (int i=0;i<stock.length ;i++ ) {
		// 	for (int j=i+1;j<stock.length ;j++ ) {
		// 		if(stock[i]<stock[j]){
		// 			diff = stock[j]-stock[i];
		// 			// System.out.println(diff+"difference");
		// 			// diff1=diff;
		// 			if(diff>diff1){diff1=diff;}
		// 		}
		// 	}
		// }

		// System.out.println(diff1);
		// int stock[] = new int[]{10,7,5,8,11,9,15};
		int stock[] = new int[]{10,9,8,7,6};
		int min = stock[0];
		int max =0;

		for (int i =0;i<stock.length ;i++ ) {
		
			min = Math.min(min,stock[i]);
			int temp = stock[i]-min;
			max = Math.max(max,temp);
		}
		System.out.println(max);

	}
}
