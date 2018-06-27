import java.util.*;

class other{
	public static void main(String[] args) {
		int a[] = new int[]{1,2,3};
		int b[] = new int[a.length];
	if (a.length < 2) {
	        throw new IllegalArgumentException("Should have 2 numbers to find the product");
	    }
		int pro=1 ;
// 		for (int i=0;i<a.length ;i++ ) {
// 			// pro = 1;
// 			for (int j=0;j<a.length ;j++ ) {
// 				if(j!=i){
// 					// System.out.println("SSSSSS");
// 					// System.out.println(j);
// 					pro = pro*a[j];
					
// 					// System.out.println(pro+"  product");
// 				}
// 			}
// 			// System.out.println("-------");
// 			// a[i]=pro;
// 			// System.out.println(pro);
// 			// System.out.println(Arrays.toString(a));
// 			pro=1;

// 			b[i]=pro;
// 			// System.out.println(a[i]+"  a[i");
// 		}
// 		System.out.println(Arrays.toString(b));
	    pro = 1;
	    for (int i = 0; i < a.length; i++) {
	        b[i] = pro;
	        pro *= a[i];
	    }
	     pro = 1;
    	for (int i = a.length - 1; i >= 0; i--) {
        	b[i] *= pro;
        	pro *= a[i];
    	}
    			System.out.println(Arrays.toString(b));
	}
}
