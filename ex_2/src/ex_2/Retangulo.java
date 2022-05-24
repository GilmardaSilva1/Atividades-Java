/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_2;

/**
 *
 * @author aluno
 */
public class Retangulo implements AreaCalculavel{
     private double base;
     private double h;
     private double area;
     
    
        public void calcularArea (){
       
         if (base < 1){
         throw new IllegalArgumentException("Era esperado um valor maior que 0");   
        }
         if (h < 1){
             throw new IllegalArgumentException("Era esperado um valor maior que 0");
         }
        else{
        area = base * h;
        }
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
