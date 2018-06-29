class tempTracker
{
    static int[] temp = new int[111];
    static Integer min;
    static Integer max;
    static Integer mode;
    static Double mean;
    static int count = 0;
    static double sum = 0.0;
    static int max_temp=0;
    public static void push(int t) 
    {
        temp[t]++;
        if (temp[t] > max_temp) 
        {
            mode = t;
            max_temp = temp[t];
        }
        count++;
        sum += t;
        mean = sum / count;
        if (max == null || t > max) 
        {
            max = t;
        }
        if (min == null || t < min) 
        {
            min = t;
        }
    }

    public static Integer getMax() 
    {
        return max;
    }

    public static Integer getMin() 
    {
        return min;
    }

    public static Double getMean() 
    {
        return mean;
    }

    public static Integer getMode() 
    {
        return mode;
    }

    public static void main(String[] args) 
    {
        push(50);
        System.out.println("MAX   MIN  MEAN   MODE");
        push(20);
        push(30);
        push(40);
        System.out.println(getMax()+"     "+getMin()+"  "+getMean()+"    "+getMode());
    }
}

