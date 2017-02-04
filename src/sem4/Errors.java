package sem4;
import java.util.Scanner;
public class Errors {
    double calcAbsError(double x,double y){
        return Math.abs(x-y);
    }
    
    double calcRelativeError(double x,double y){
        double a=calcAbsError(x,y);
        return a/x;
    }
    
    double calcPercentageError(double x,double y){
        double r=calcRelativeError(x,y);
        return r*100;    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double approx_value,abs_error,relative_error,percentage_error,true_value;
        System.out.println("Enter the Approximate Value");
        approx_value=sc.nextDouble();
        System.out.println("Enter the True Value");
        true_value=sc.nextDouble();
        Errors e1=new Errors();
        int ch;
        do{
            System.out.println("Enter 1 for Absolute Error,2 for Relative Error,3 For Percentage Error, 4 to Exit");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    double x=e1.calcAbsError(true_value, approx_value);
                    System.out.println("Absolute error= "+x);
                    break;
                case 2:
                    x=e1.calcRelativeError(true_value, approx_value);
                    System.out.println("Relative Error= "+x);
                    break;
                case 3:
                    x=e1.calcPercentageError(true_value, approx_value);
                    System.out.println("Percentage Error= "+x+"%");
                    break;
            }
        }while(ch<=3);
        
        
    }
    
}
