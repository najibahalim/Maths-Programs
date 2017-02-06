package sem4.AM;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        CubicEqnRoots c1=new CubicEqnRoots(1,-18,45,0);
        c1.calcRoots();
        System.out.println(c1.root1());
        System.out.println(c1.root2());
        System.out.println(c1.root3());
    }
    
}
