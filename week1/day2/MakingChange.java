import java.util.*;
class makingchange
{
    public static void main(String[] args) 
    {
        int n=100;
        int[] coins=new int[]{1,5,10,25,50};
        int finalC[] = new int[n+1];
        finalC[0] = 1;
        for(int c: coins)
            for(int i= c;i < finalC.length; i++ )
                finalC[i] = finalC[i]+finalC[i-c];

        System.out.println(finalC[n]);
    }
}
