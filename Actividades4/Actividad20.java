
public class Actividad20 {
    public static void main(String[] args) {

        int numero;
        boolean capicua = false;
        
        System.out.print("Introduce un número entero: ");
        numero = Integer.parseInt(System.console().readLine());
        
        
        if (numero < 10) {
          capicua = true;
        }
        
        if ((numero >= 10) && (numero < 100)) {
          if ((numero / 10) == (numero % 10)) {
            capicua = true;
          }
        }
    
        if ((numero >= 100) && (numero < 1000)) {
          if ((numero / 100) == (numero % 10)) {
            capicua = true;
          }
        }
    
        if ((numero >= 1000) && (numero < 10000)) {
          if (((numero / 1000) == (numero % 10)) && ((( numero / 100 ) % 10)== (( numero / 10) % 10))) {
            capicua = true;
          }
        }
        
        if (numero >= 10000) {
          if (((numero / 10000) == (numero % 10) ) && ((((numero / 1000) % 10)) == ((numero / 10) % 10))) {
            capicua = true;
          }
        }
        
        if (capicua) {
          System.out.println("Es capicúa.");
        } else {
          System.out.println("No es capicúa.");


     }
      }
    }