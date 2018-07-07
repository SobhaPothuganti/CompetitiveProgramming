import java.util.*;

class anagram{

	public static boolean func(String s,String sa){
		String sc ="";
		String sac = "";

		s=s.toLowerCase();
		sa=sa.toLowerCase();

		String si[] = s.split(" ");
		String sai[] = sa.split(" ");

		
		for (int i=0;i<si.length ; i++) {
			sc+=si[i];
		}
		char c[] = sc.toCharArray();
		Arrays.sort(c);

		for (int i=0;i<sai.length ; i++) {
			sac+=sai[i];
		}
		char ca[] = sac.toCharArray();
		Arrays.sort(ca);
		

		if (Arrays.equals(c,ca)) {
			// System.out.println("true");
			return true;
		}
		else{
			// System.out.println("false");
			return false;

		}
	}



	public static void main(String[] args) {
		String s1 = "anagram";
		String sa1 = "nagaram";
		System.out.println("1. "+func(s1,sa1));
		String s2 = "Keep";
		String sa2 = "Peek";
		System.out.println("2. "+func(s2,sa2));
		String s3 = "Mother In Law";
		String sa3 = "Hitler Woman";
		System.out.println("3. "+func(s3,sa3));
		String s4 = "School Master";
		String sa4 = "The Classroom";
		System.out.println("4. "+func(s4,sa4));
		String s5 = "ASTRONOMERS";
		String sa5 = "NO MORE STARS";
		System.out.println("5. "+func(s5,sa5));
				String s6 = "Toss";
		String sa6 = "Shot";
		System.out.println("6. "+func(s6,sa6));
				String s7 = "joy";
		String sa7 = "enjoy";
		System.out.println("7. "+func(s7,sa7));
				String s8 = "Debit Card";
		String sa8 = "Bad Credit";
		System.out.println("8. "+func(s8,sa8));
				String s9 = "LisTen AcT";
		String sa9 = "SiLeNt CAT";
		System.out.println("9. "+func(s9,sa9));
				String s10 = "Dormitory";
		String sa10 = "Dirty Room";
		System.out.println("10. "+func(s10,sa10));
		// func(s,sa);
	}
}
