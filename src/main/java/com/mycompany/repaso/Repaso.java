/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.repaso;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Repaso {

    public static void main(String[] args) {
        /*
        
        System.out.println("Calculando volumen solido...");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite radio: ");
        double r = Double.parseDouble(sc.nextLine());
        
        System.out.println("Digite altura: ");
        double h = Double.parseDouble(sc.nextLine());
        
        System.out.println("Digite radio 2: ");
        double r2 = Double.parseDouble(sc.nextLine());
        
        double volumen = calcularVolumenSolido(r,h,r2);
        System.out.println("El volumen es: " + volumen);
       
        
        System.out.println("Calculando volumen solido...");        
        Scanner sc = new Scanner(System.in);
        
         System.out.println("Digite cuantos panes: ");
         int panes = Integer.parseInt(sc.nextLine());
         
         System.out.println("Digite cuantos litros de leche: ");
         int litrosL = Integer.parseInt(sc.nextLine());
         
         System.out.println("Digite cuantos huevos: ");
         int huevos = Integer.parseInt(sc.nextLine());
        
         System.out.println("Billete?? ");
         int billete = Integer.parseInt(sc.nextLine());
         
         int vueltas = calcularVueltas(panes,litrosL, huevos, billete);
         
         if(vueltas < 0 )
         {
             int faltante = vueltas * -1;
             System.out.println("No alcanza con ese billete, faltante: " + faltante);
         }
         else
         {
             System.out.println("El vuelto es: " + vueltas);
         }
         */
         // Condicionales
         
         //retornarCuadrante(2, -5);
         
         //mostrarImparesYPares();
         
         //verAnio();
         
         Scanner sc = new Scanner(System.in);
         System.out.println("Digite cadena ");
         String x = sc.nextLine();
         validarAsuntoFacturaElectronica(x);
    }
    
    public static double calcularVolumenSolido(double r, double h, double r2)
    {
        double volumen = Math.round(((4/3) * Math.PI * Math.pow(r,3)) + ((1/3) * Math.PI * h* Math.pow(r2, 2)));
        return volumen;
    }
    
    public static double calcularArea(double a, double b, double r)
    {
        double area = (a*b) + 2 * (Math.PI * Math.pow(r, 2));
        return area;
    }
    
    public static int calcularVueltas(int p, int m, int h , int b)
    {
        int totalEnPan = p * 300;
        int totalEnLeche = m * 3300;
        int totalHuevo = h * 350;
        
        int totalFactura = totalEnPan + totalEnLeche + totalHuevo;
        
        int vueltas = b - totalFactura;
        
        return vueltas;
    }
    
    public static String validarNumero(double x)
    {
        String resultado ;
        if(x>0)
        {
            resultado = "El número "+x+" es positivo";
        }
        else if (x<0)
        {
             resultado ="El número "+x+" es negativo";            
        }
        else
        {
             resultado ="El número "+x+" es el neutro para la suma.";            
        }
        
        return resultado;
    }
    
    public static void retornarCuadrante(double x, double y)
    {
        if(x==0 || y==0)
        {
            System.out.println("Ejes");
        }
        else if (x>0 && y>0)
        {
            System.out.println("I");
        }
        else if (x<0 && y > 0)
        {
            System.out.println("II");
        }
        else if (x<0 && y<0)
        {
            System.out.println("III");
        }
        else
        {
            System.out.println("IV");
        }
            
    }
    
    public static void mostrarImparesYPares()
    {
        String impares = "";
        String pares = "";
        for(int i = 1; i < 1000 ; ++i)
        {
            if(i % 2 != 0)
            {
                impares = impares + i +",";
            }
            else
            {
                pares = pares + i + ",";
            }
        }
        
        System.out.println(impares);
        System.out.println(pares);
    }
    
    public static void verAnio()
    {
        long a = 25000000;
        long b = 18900000;        
        int anio = 0;
        
        while(a>=b)
        {
            a = a + Math.round(a*0.02);
            b = b + Math.round(b*0.03);
            anio = anio + 1;
        }
        
        System.out.println("Han pasado.." + anio +" años, estamos en el año: " + (2022 + anio));
        
    }
    
    public static int validarExistencia(String cadena, char a)
    {
        int contador = 0;        
        char[] cadenaV = cadena.toCharArray();
        
        for(int i=0; i< cadenaV.length; i++)
        {
            if(a == cadenaV[i])
            {
                contador = contador + 1;
            }
        }
        
        return contador;
        
    }
    
   
    public static void validarAsuntoFacturaElectronica(String asunto)
    {
        String[] datos = asunto.split(";");
        
        System.out.println("El nit es: " + datos[0]);
        System.out.println("El nombre de la empresa es: " + datos[1]);
        System.out.println("El número del documento es: " + datos[2]);
        
    }
}
