import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if (s.trim().length()==0) {
            System.out.println(0);
            return;
        }
        String[] strArr = s.trim().split("[!,?._'@\\s]+");
        System.out.println(strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
        scan.close();
    }
}
