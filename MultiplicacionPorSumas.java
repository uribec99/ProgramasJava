/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacionporsumas;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MultiplicacionPorSumas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int a,b,i,x,n=0,contador=1;
        
        n=lector.nextInt();
        
        while(contador<=n){
        a=lector.nextInt();

        b=lector.nextInt();
        
        x=a*b;
        
        System.out.print("("+a+")*("+b+")=");
        
        if(a<0 && b<0 ){
            int a1=Math.abs(a);
            int b1=Math.abs(b);
            for(i=0;i<a1;i++){
            System.out.print("+"+b1);
        }
            System.out.print("="+x);
            System.out.println("");
        }else if(a>0 && b>0 ) {
            for(i=0;i<a;i++){
            System.out.print(b+"+");
        }
            System.out.print("="+x);
            System.out.println(""); 
        }else if(a<0) {
            int a1=Math.abs(a);
            for(i=0;i<a1;i++){
            System.out.print("-"+b);
            }
            System.out.print("="+x);
            System.out.println("");
        } else if(b<0) {
            int b1=Math.abs(b);
            for(i=0;i<b1;i++){
            System.out.print("-"+a);
            }
            System.out.print("="+x);
            System.out.println("");
        }
      contador=contador+1;  
    }
    

