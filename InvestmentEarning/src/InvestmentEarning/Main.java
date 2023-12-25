package InvestmentEarning;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yyour buying price per share");
        double buyingPrice = sc.nextDouble();
        int day = 1;
        double closingPrice = 0.1;
        DecimalFormat df = new DecimalFormat("0.00");
        while(true) {
            System.out.println("Enter the closing price  for day "
                                + day + "(any negative value to leave: ");
            closingPrice = sc.nextDouble();
            double earnings = closingPrice - buyingPrice;
            if(earnings >0){
                System.out.println("after day " + day + ",you earned "
                            + df.format(earnings) + "per share. ");
            } else if (earnings<0.0) {
                System.out.println("after day " + day + ",you lost "
                        + df.format(earnings) + " per share. ");

            }else {
                System.out.println("after day " + day + ",you have "
                        +  "no earning per share. ");
            }
            day+=1;
        }
    }
}