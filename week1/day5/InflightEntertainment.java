public class InflightEntertainment {

    public static boolean canTwoMoviesFillFlight(int[] movieLengths, int flightLength) {
        int n=movieLengths.length;
        HashMap<Integer,Integer> hm=new HashMap();
        //int i=0,j=n-1;
        if(n<=1)return false;
        for(int i=0;i<n;i++){
            int k=flightLength-movieLengths[i];
            if(hm.containsKey(k)) return true;
            else hm.put(movieLengths[i],1);
        }
        return false;
    }

