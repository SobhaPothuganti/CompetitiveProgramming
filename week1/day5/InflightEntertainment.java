public class InflightEntertainment {

    public static boolean canTwoMoviesFillFlight(int[] movieLengths, int flightLength) {

        // determine if two movies add up to the flight length
        int n=movieLengths.length;
        HashMap<Integer,Integer> hm=new HashMap();
        //int i=0,j=n-1;
        if(n<=1)return false;
        /*Arrays.sort(movieLengths);
        while(i<j){
            if(movieLengths[i]+movieLengths[j]==flightLength) return true;
            else if(movieLengths[i]+movieLengths[j]>flightLength) j--;
            else i++;
        }*/
        for(int i=0;i<n;i++){
            int k=flightLength-movieLengths[i];
            if(hm.containsKey(k)) return true;
            else hm.put(movieLengths[i],1);
        }
        return false;
    }

