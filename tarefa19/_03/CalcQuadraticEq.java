package org.example._03;

public class CalcQuadraticEq {
    
    public void calculaRaizesEquacaoQuadratica(double a, double b, double c) {
        
        double delta = b * b - 4 * a * c;
        double x1, x2;
        
        if (delta > 0) {
            
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
            
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        else if (delta == 0) {
            
            x1 = -b / (2 * a);

            System.out.println("x = " + x1);
        }
        else {
        
            System.out.println("Equation has no roots");
        }
    }
}
