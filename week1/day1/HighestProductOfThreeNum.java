import java.util.*;
class highest{
	public static int max1 = Integer.MIN_VALUE;
	public static int max2 = Integer.MIN_VALUE;
	public static int max3 = Integer.MIN_VALUE;
	public static int min2 = Integer.MAX_VALUE;
	public static int min3 = Integer.MAX_VALUE;
	public static void main(String[] args) {
		int a[]=new int[]{9,27,1,6};
		// int pro1=1;
		// int pro2=1;

		// Arrays.sort(a);
		// System.out.println(Arrays.toString(a));

		// pro1 = a[0]*a[1]*a[a.length-1];
		// pro2 = a[a.length-1]*a[a.length-2]*a[a.length-3];

		// if(pro1>pro2){
		// 	System.out.println(pro1);
		// }
		// else {
		// 	System.out.println(pro2);
		// }
		for(int i=0; i<a.length; i++)
		{
			if(max1<a[i])
			{
				max3=max2;
				max2=max1;
				max1=a[i];
			}
			else if (max2<a[i])
			{
				max3=max2;
				max2=a[i];	
			}
			else if(max3<a[i])
			{
				max3=a[i];
			}
			if(min3>a[i])
			{
				min2=min3;
				min3=a[i];
			}
			else if(min2>a[i])
			{
				min2=a[i];
			}
		}
		
		int pro1=max1*max2*max3;
		int pro2=min2*min3*max1;
		if(pro1>pro2)
		{
			System.out.println(pro1);
		}
		else
		{
			System.out.println(pro2);
		}
	}
}
