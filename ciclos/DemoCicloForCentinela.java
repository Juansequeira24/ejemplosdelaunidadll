package ciclos;

import java.util.Scanner;

public class DemoCicloForCentinela {



   public static void main(String[] args) {
     System.out.println("Tercer ciclo For, ciclo centinela");
     Scanner SC = new Scanner(System.in);
     String SioNo="si";
     int num1 =0;
     int sum =0;
     int contador = 100;
     System.out.println("num1=" + num1);
     //Cuando no hay sentencias, es un ciclo infinito o centinela
     for(;;) {
        num1 = num1 + 50;
        System.out.println("num1 = +num1);
        sum = sum + num1;
        contador =contador-10;
        System.out.println("Ingrese Si para continuar o No para salir");
        sioNo=sc.next();
        if(SioNo.equalsIgnoreCase("No")) {
           break;
        }

     } 
     System.out.println("Fin tercer ciclo for,ciclo centinela");
     System.out.println("num1 = +num1);
   }
}