package sem4.AM;
public class CubicEqnRoots {
    double a,b,c,d;
    double x1=-999,x2=-999,x3=-999;
    
    CubicEqnRoots(int a,int b,int c,int d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    
    double calcf(){
        return ((3*c/a)-(Math.pow(b, 2)/Math.pow(a, 2)))/3;
    }
    
    double calcg(){
        return ((2*Math.pow(b, 3)/Math.pow(a, 3))-(9*b*c/Math.pow(a,2))+(27*d/a))/27;
    }
    
    double calch(){
        return ((Math.pow(calcg(), 2))/4)+((Math.pow(calcf(), 3))/27);
    }
    
    void calcRoots(){
        double f=calcf();
        //System.out.println(f);
        double g=calcg();
        //System.out.println(g);
        double h=calch();
        //System.out.println(h);
        
        //case 1 : All 3 roots are real
        double i=Math.sqrt((g*g/4)-h);
        //System.out.println(i);
        double j=Math.cbrt(i);
        //System.out.println(j);
        double k=Math.acos(-1*(g/(2*i)));
        //System.out.println(k);
        double l=j*-1;
        //System.out.println(l);
        double m=Math.cos(k/3);
        //System.out.println(m);
        double n=Math.sqrt(3)*Math.sin(k/3);
        //System.out.println(n);
        double p=-1*(b/(3*a));
        //System.out.println(p);
        x1=2*j*Math.cos(k/3)-(b/(3*a));
        x2=l*(m+n)+p;
        x3=l*(m-n)+p;
    }
    
    int root1(){
        int x=(int)Math.round(x1);
        return x;
    }
    
    int root2(){
        int x=(int)Math.round(x2);
        return x;
    }
    
    int root3(){
        int x=(int)Math.round(x3);
        return x;
    }
    
}
