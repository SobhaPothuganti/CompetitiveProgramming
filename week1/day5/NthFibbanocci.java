public class Fibonacci {
    static int a[];

    public static int fib(int n) {

    if(n<0) throw new IllegalArgumentException("hello");
        // compute the nth Fibonacci number
        a=new int[n+1];
        int p=fibonacci(n);
        return p;
    }
    public static int fibonacci(int n){
        if(n==0 || n==1) return n;
        else if(a[n]!=0) return a[n];
        else return a[n]=fib(n-1)+fib(n-2);
    }

