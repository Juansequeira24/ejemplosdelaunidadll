package introjava1;

public class DemoSentenciasSwith__05 {


   public static void main(String[] args) {
     int dia = 6; 
     System.out.println("Día número: " + dia);

    switch (dia) {
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
         System.out.println("Dia de semana!");
         break;
      case 6:
      case 7:
         System.out.println("Fin de semana!");
         break;
    }
   }
}