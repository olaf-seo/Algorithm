package AplusB;

import java.util.*;
public class AplusB10951{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A, B;
        while (sc.hasNextInt()) {
            A = sc.nextInt();
            B = sc.nextInt();
            System.out.println(A + B);
        }
        sc.close();
    }
}

