package com.example;
import org.apache.commons.codec.binary.Base64;
import java.util.Arrays;
/**
* 範例主程式
*/
public class CheckTriangle {
    public String getTriangleType(double a, double b, double c) {
        double[] side = new double[3];
        side[0] = a;
        side[1] = b;
        side[2] = c;
        Arrays.sort(side);
        a = side[0];
        b = side[1];
        c = side[2];
        if ((a + b > c)) {
           if (a * a + b * b < c * c) {
               if (a == b) {
                   return "等腰三角形";
               } else {
                   return "鈍角三角形";
               }
           } else if (a * a + b * b == c * c) {
               if (a == b) {
                   return "等腰直角三角形";
               } else {
                   return "直角三角形";
               }
           } else {
               if (a == b) {
                   if (b == c) {
                       return "正三角形";
                   } else {
                       return "等腰三角形";
                   }
               } else {
                   return "銳角三角形";
               }
           }
       } else {
           return "不能構成三角形";
       }
   }
}
