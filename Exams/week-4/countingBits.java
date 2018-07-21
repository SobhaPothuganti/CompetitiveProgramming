import java.util.*;
class counting{
	static int[] num(int n){
		int a[] = new int[n+1];
		for (int i=0;i<=n ;i++ ) {
			a[i]= a[i>>1]+(i&1);
		}
		return a;

	}

	public static void main(String[] args) {
		int a = 15;
		System.out.println(Arrays.toString(num(a)));
		
		int b = 16;
		System.out.println(Arrays.toString(num(b)));
		// num(b);
		int c = 1;
		System.out.println(Arrays.toString(num(c)));
		// num(c);
		int d = 25;
		System.out.println(Arrays.toString(num(d)));
		// num(d);
		int e = 5;
		System.out.println(Arrays.toString(num(e)));
		// num(e);
		int f = 6;
		System.out.println(Arrays.toString(num(f)));
		// num(f);
	}
}