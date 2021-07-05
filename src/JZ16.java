package src;

public class JZ16 {
    public double myPow(double x, int n) {
        long ln=n;
        if(n>=0)
            return PowerWithUnsignedExponent(x,ln);
        else{
            return 1/PowerWithUnsignedExponent(x,-ln);
        }
    }
    public double PowerWithUnsignedExponent(double base, long exponent){
        if(exponent==0)
                return 1;
        if(exponent==1)
                return base;
        double ret=PowerWithUnsignedExponent(base,exponent/2);
        ret*=ret;
            if(exponent%2==1)
                ret*=base;
            return ret; 
    }
}
