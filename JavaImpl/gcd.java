import java.util.Scanner;

class gcd{
    public static long getGCD(long p, long q){
        if(q==0) return p;
        else {
            long r = p%q;
            return getGCD(q,r);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long x1= input.nextLong();
        long x2= input.nextLong();
        System.out.println("GCD of "+x1+" and "+x2+" is "+getGCD(x1, x2));
        input.close();
    }
}