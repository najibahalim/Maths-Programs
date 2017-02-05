package sem4;
public class NewtonRaphsonMethod {
    static double f1(double x){
        //return (2*Math.pow(x, 3)-3*x+4);
        //return (x*Math.log10(x)-1.2);
        //return (Math.pow(x, 3)-20);//to find squareroots 
        //return (1/x)-7;
        //return (Math.pow(x, 4)-9*Math.pow(x, 2)-18);
        //return (Math.pow(x, 3)+x-5);
        return (3*x-Math.cos(x)-1);
        //return (x*Math.pow(Math.E,x)-2);
        //return (x-2*Math.sin(x));
    }
    
    static double f1d(double x){
        //return (0.4343+Math.log10(x));
        //return (3*Math.pow(x,2)+1);
        //return (Math.pow(Math.E,x)*(Math.sin(x)+Math.cos(x)));
        //return (3*Math.pow(x,2));//to find square roots
        //return -1/Math.pow(x, 2);
        return 3+Math.sin(x);
        //return 3*Math.pow(x,2)+1;
        //return Math.pow(Math.E,x)+x*Math.pow(Math.E,x);
    }
    
    
    static double find_root(double a,double b){
        int c=1;
        
        double x=a,xp=0;
        while(x!=xp && c<=30){
            xp=x;
            x=xp-(f1(x)/f1d(x));
            c++;
        }
        return x;
       
        
    }
    
    public static void main(String[] args) {
        double a=2;
        double b=3;
        
        //a and b are the 2 points around which the root is assumed to lie
        System.out.println(find_root(1, 3));
    }
    
}
