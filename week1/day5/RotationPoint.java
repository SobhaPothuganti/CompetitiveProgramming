public class FindRotationPoint {
    public static int findRotationPoint(String[] words) {
        int n=words.length-1;
        int i,l=0,h=n,mid;
        while(l<h){
            mid=l+(h-l)/2;
            if(words[mid].compareTo(words[mid+1]) >1) return mid+1;
            else if(words[mid-1].compareTo(words[mid]) >1) return mid;
            else if(words[l].compareTo(words[mid])>1) h=mid-1;
            else l=mid+1;
        }
        return 0;
    }

