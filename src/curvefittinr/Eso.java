/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curvefittinr;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jet_m
 */
public class Eso {
    int n = 9;
    int adver [] = new int [] {23,26,30,34,43,48,52,57,58};
    int sumX = Arrays.stream(adver).sum();
    int sales [] = new int [] {651,762,856,1063,1190,1298,1421,1440,1518};
    int sumY = Arrays.stream(sales).sum();
    int XY [] = {0,0,0,0,0,0,0,0,0};
    int sqrX [] = {0,0,0,0,0,0,0,0,0};
    int sqrY [] = {0,0,0,0,0,0,0,0,0};
    int sumXY;
    int sumSqrX;
    int sumSqrY;
    int a1;
    int b1;
    double div;
    double B0;
    double B1;
    DecimalFormat decimalFormat = new DecimalFormat("#.#####");
    float B0F;
    float B1F;
    
    void sumXY(){
        for (int i = 0; i < adver.length; i++) {
            XY[i] = (adver[i] * sales[i]);
        }
    sumXY = Arrays.stream(XY).sum();
    }
    void sumSqrX(){
        for (int i = 0; i < adver.length; i++) {
            sqrX[i] = (int) Math.pow(adver[i], 2);
        }
    sumSqrX = Arrays.stream(sqrX).sum();
    }
    void sumSqrY(){
        for (int i = 0; i < adver.length; i++) {
            sqrY[i] = (int) Math.pow(sales[i], 2);
        }
    sumSqrY = Arrays.stream(sqrY).sum();
    }
    
    void Execute(){
        sumXY();
        sumSqrX();
        sumSqrY();
        
        a1 = (sumY*sumSqrX) - (sumX*sumXY);
    //System.out.println(a1);
        b1 = (n*sumXY) - (sumX*sumY);
    //System.out.println(b1);
         div = (double) ((n*sumSqrX) - (Math.pow(sumX, 2)));
    //System.out.println(div);
        B0 = a1/div;
        B1 = b1/div;
        B0F = Float.valueOf(decimalFormat.format(B0));
        B1F = Float.valueOf(decimalFormat.format(B1));
        System.out.println("Regression equation ");
        System.out.println("Y = " + B0F + " + " + B1F + "x");
        System.out.print("Select a new value for advertising (X) to make a prediction on sales: ");
        Scanner scanInput = new Scanner(System.in);
        int inputnumer = scanInput.nextInt();
        double result = (B1F*inputnumer)+B0F;
        float resultF = Float.valueOf(decimalFormat.format(result));
        System.out.println("");
        System.out.println("The result when advertising is: " + inputnumer + " ,the sales are: " + resultF);
    }
    
}
