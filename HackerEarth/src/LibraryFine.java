import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LibraryFine {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        if(y1!=y2){
            System.out.println(10000);
        }else if(m1!=m2){
             System.out.println(500*(m2-m1));
        }else if(d1!=d2){
             System.out.println(15*(d2-d1));
        }else{
             System.out.println(0);
        }
        
    }
}



