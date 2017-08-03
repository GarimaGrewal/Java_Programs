import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int n,remainder,sum,pow;
        n=sc.nextInt();
        sum=0;pow=1;
        while(n!=0)
        {   
            pow*=5;
            remainder=n%2;
            if(remainder==1)
            sum+=pow;
            n/=2;
        }
        System.out.println(sum);
    }
}
