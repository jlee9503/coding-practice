import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usFormat.format(payment);
        
        NumberFormat indiaformatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = indiaformatter.format(payment);
        
        NumberFormat cformatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = cformatter.format(payment);
        
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = formatter.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
