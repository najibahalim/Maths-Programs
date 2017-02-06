//Cofactors of a 3 Dimensional Array
package sem4.AM;
public class CoFactors3 {
    
    int temp[][]=new int[2][2];
    final int N=3;
  
    void getCofactor(int A[][],int p,int q){
        int i=0,j=0;
        for(int r=0;r<N;r++){
            for(int c=0;c<N;c++){
                if(r!=p && c!=q){
                    temp[i][j++]=A[r][c];
                    if(j==N-1){
                        j=0;
                        i++;
                    }
                }
            }
        }
    }
    
    int calc_minor(int A[][],int p,int q){
        getCofactor(A,p,q);
        return temp[0][0]*temp[1][1]-temp[0][1]*temp[1][0];
    }
    
    int calc_determinant(int A[][]){
        //return A[0][0]*calc_minor(A,0,0)-A[0][1]*calc_minor(A,0,1)+A[0][2]*calc_minor(A,0,2);
        int sign=1;
        int s=0;
        for(int i=0;i<N;i++){
            s+=(sign*A[0][i]*calc_minor(A,0,i));
            sign*=-1;
        }
        System.out.println(s);
        return s;
    }
    
    
    
}

