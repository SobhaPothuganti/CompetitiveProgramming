import java.util.*;

class distance{
	public static void hamm(int x,int y){
		String a ="";
		String b ="";
		int count =0;
		

		a+=Integer.toBinaryString(x);
		// System.out.println(a);
		b+=Integer.toBinaryString(y);
		// System.out.println(b);

		int n = b.length()-1;
		int i =0;
		if(a.length()==b.length()){
			while(i<a.length()){
				if(a.charAt(i)!=b.charAt(i)){
					count++;
				}
				i++;
			}	
			System.out.println("Hamming distance "+"between "+x+" and "+y+" is "+count);
			
		}
		else if (a.charAt(0)==b.charAt(0) && a.length()<b.length()) {
		 	System.out.println("Hamming distance "+"between "+x+" and "+y+" is "+n);	
		 	
		 } 

		 else{
		 	System.out.println("Hamming distance "+"between "+x+" and "+y+" is "+b.length());
		 	
		 }

			

	}

	public static void main(String[] args) {
		int x1 =1;
		int y1 = 4;
		hamm(x1,y1);
		int x2 =25;
		int y2 = 30;
		hamm(x2,y2);
		int x3 =100;
		int y3 = 250;
		hamm(x3,y3);
		int x4 =1;
		int y4 = 30;
		hamm(x4,y4);
		int x5 =0;
		int y5 = 255;
		hamm(x5,y5);


	}
}
