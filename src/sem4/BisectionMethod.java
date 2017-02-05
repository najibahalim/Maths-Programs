package sem4;
import java.util.Scanner;
public class BisectionMethod {
    
    static double f1(double x){
        //return (Math.pow(x, 10)-1);
        //return (Math.pow(x, 3)+Math.pow(x, 2)+3*x);
        //return (Math.pow(x, 3)-5*x-7);
        //return (Math.cos(x)-x*Math.pow(Math.E, x));
        //return ((Math.pow(Math.E,-1*x))-x);
        //return (x-Math.cos(x));
        return (x*Math.log10(x)-1.2);
    }
    
    static double squeeze(double a,double b){
        assert f1(a)<f1(b);
        final double inc=a/b;
        while(f1(a+inc)<0){
            a+=inc;
        }
        return a;
    }
    
    static double find_root(double a,double b){
       // a=squeeze(a,b);
       int c=1;
        double ansprev=0,ans;
        ans=(a+b)/2;
        if(f1(ans)>0)
            b=ans;
        else
            a=ans;
        
        
        while(ansprev!=ans && c<=30){
            ansprev=ans;
            ans=(a+b)/2;
            if(f1(ans)>0)
            b=ans;
        else
            a=ans;
        }
        return ans;
    }
    
    
    public static void main(String[] args) {
        //System.out.println(find_root(2,3));
        //System.out.println(find_root(1,0));
        //To decide the values of a and b
        double x=0,y=0;
        if(f1(x)<0){
        while(f1(x)<0){
            x++;
        }
        y=x;
        x--;
        }
        else{
            while(f1(y)>0){
            y++;
        }
        x=y;
        y--;
        }
            
        //System.out.println(x+" "+y);
        //System.out.println(find_root(1,0));
        System.out.println(find_root(2,3));
    }
}
