import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] arr = A.toCharArray();
        String strCheck = "";
        
        for (int i = arr.length-1; i >= 0; i--) {
            strCheck += arr[i];
        }
        if (A.equals(strCheck)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
