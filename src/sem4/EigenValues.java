/**Eigen Values of a 3*3 matrix**/
package sem4;
import java.util.Scanner;
public class EigenValues {
    int A[][]=new int[3][3];
    final int N=3;
    int s1=0,s2=0,s3=0;
    void calcs1(){
        s1=0;
        for(int i=0;i<N;i++){
        s1+=A[i][i];    
        }
    }
    
    void calcs2(){
        s2=0;
        int x=1,y=2;
        for(int i=0;i<N;i++){
            s2+=A[x][x]*A[y][y]-A[x][y]*A[y][x];
            if(i==0)
                x=0;
            else if(i==1)
                y=1;
        }
    }
    
    
   
    
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        EigenValues e1=new EigenValues();
        for(int i=0;i<e1.N;i++)
            for(int j=0;j<e1.N;j++)
                e1.A[i][j]=sc.nextInt();
            e1.calcs2();
        
    }
    
}
