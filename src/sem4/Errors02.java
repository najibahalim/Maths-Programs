package sem4;
import java.util.Scanner;
public class Errors02 {
    static double roundOff(double no,double figure){
        double notemp=no;
        int ex;
        int x=0,y=0;
        double y2;
        int count=0;
        while(notemp>1){
            count++;
            notemp/=10;
        }
        while(count>figure){
            count--;
            no/=10;
            x++;
        }
        y=(int)no;
        while(x>0){
            y*=10;
            x--;
        }
        
            no-=y;
         
       while(count<figure){
            no*=10;
            y*=10;
            int t=(int) no;
            y+=t%10;
            count++;
            x++;
        }
       y2=y;
       while(x>0){
           y2=y2*(1/10.0);
           x--;
       }
        
        return y2;
       
    }
    public double sum(double arr[],int r){
        int len=arr.length;
        double sum=0.0;
        for(int i=0;i<len;i++){
            Errors02.roundOff(arr[i], r);
            sum+=arr[i];
        }
        return sum;
    }
    
    public static double product(double arr[],int r){
        int len=arr.length;
        double prod=1;
        for(int i=0;i<len;i++){
            Errors02.roundOff(arr[i], r);
            prod*=arr[i];
        }
        return prod;
    }
     public static double error(int n){
        double e1=Math.pow(10,n);
        double e2=0.5*1.0/e1;
        return e2;
        
    }
    
    public static double relative_error(double x,int n){
        double e1=Math.pow(10,n);
        double e2=0.5*1.0/e1;
        return e2/x;
        
    }
    
    public static double abssquarerootssum(double arr[]){
        double sum=0,e=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=Math.sqrt(arr[i]);
            roundOff(arr[i],4);
            sum+=arr[i];
            e+=Errors02.error(4);
        }
        
        return sum;
    }
    
    
    
    public static double relsquarerootssum(double arr[]){
        double sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=Math.sqrt(arr[i]);
            roundOff(arr[i],4);
            sum+=arr[i];
        }
        sum=Errors02.relative_error(sum, 3);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         /*Rounding off nos and Calculating Relative,percentage and Absolute errors
        double round;
        System.out.println("Enter the no ");
        double no=sc.nextDouble();
        System.out.println("Enter the round off figure ");
        double figure=sc.nextDouble();
        round=roundOff(no,figure);
        Errors e1=new Errors();
        System.out.println("Rounded no is" + round);
        System.out.println(e1.calcAbsError(no, round));
        System.out.println(e1.calcRelativeError(no, round));
        System.out.println(e1.calcPercentageError(no, round)+"%");*/
         
        /*Calculating the best approximation
        double a1,a2,a3,true_val;
        Errors e2=new Errors();
        System.out.println("Enter true value");
        true_val=sc.nextDouble();
        System.out.println("Enter approximation 1");
        a1=sc.nextDouble();
        System.out.println("Enter approximation 2");
        a2=sc.nextDouble();
        System.out.println("Enter approximation 3");
        a3=sc.nextDouble();
        double best;
        if(e2.calcAbsError(true_val, a1)< e2.calcAbsError(true_val, a2)){
            if(  e2.calcAbsError(true_val, a1)<e2.calcAbsError(true_val, a3))
                best=a1;
            else
                best=a3;
        }
        else
            if( e2.calcAbsError(true_val, a2)< e2.calcAbsError(true_val, a3))
                best=a2;
            else
                best=a3;
        System.out.println("Best Approximation "+best);*/
            
        
        /*To Find Truncation Error
        double x=1.0/4.0;
        double true_val=Math.pow(Math.E, x);
        double approx_val=1+x+(Math.pow(x,2)/2);
        Errors e3=new Errors();
        
        System.out.println(e3.calcAbsError(true_val, approx_val));*/
        
        /*Finding Sum using 3 digit Rounding
        double x[]=new double[6];
        double approx_val=0.0;
        x[0]=1/3.0;
        x[1]=1/9.0;
        x[2]=1/27.0;
        x[3]=1/81.0;
        x[4]=1/243.0;
        x[5]=1/729.0;
        for(int i=0;i<6;i++){
            x[i]=Errors02.roundOff(x[i], 3);
            approx_val+=x[i];
        }
        System.out.println("Sum= "+approx_val);*/
        
        /*EX_6:Calculating Sum
        double nos[]={0.1563,21.34,0.000346,102.3,7.15,156.4,0.0312};
        Errors02 e6=new Errors02();
        System.out.printf( "%.2f",e6.sum(nos, 2));*/
        
        /*EX-7 FINDING PRODUCT8
       double nos[]={3.6,27.368};
        double x=(Errors02.product(nos, 1));
        System.out.printf("%.1f",x);*/
        
        /*EX-8 RELATIVE ERROR
        double x=0.51;
        System.out.println(Errors02.relative_error(x, 2));*/
        
        /* EX-9,10 RELATIVE ERROR
       double x;
       int r;
       //x=4.32;
       //r=2;
       x=3.1416;
       r=4;
       
        System.out.println(Errors02.relative_error(x, r));*/
       
        /*Ex-10 abs n relative errors of Sum of aquareroots
        double s[]={3,5,7};
        System.out.println(Errors02.abssquarerootssum(s));
        System.out.println(Errors02.relsquarerootssum(s));*/
        
    }
    
}
