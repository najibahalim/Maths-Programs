//Calculating roots by Newton-Raphson Method

package sem4.AM;
public class CubicRoots {
    int a,b,c,d;
    
    CubicRoots(int a,int b,int c,int d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    double fx(double x){
        return a*Math.pow(x, 3)+b*Math.pow(x, 2)+c*x+d;
    }
    
    double fdx(double x){
        return a*3*Math.pow(x, 2)+b*2*x+c;
    }
    
    double find_root(){
        int counter=1;
        
        double x=0,xp=-1;
        while(x!=xp && counter<=30){
            xp=x;
            x=xp-(fx(x)/fdx(x));
            counter++;
        }
        return x;
        
    }
    
}
