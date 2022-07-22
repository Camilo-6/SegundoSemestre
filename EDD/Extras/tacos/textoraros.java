package tacos;
import java.util.Random;

public class textoraros {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        int numerito = 1+random.nextInt(10000);
        String resultado = numerito+"\n";
        for (int i = 0; i < numerito; i++) {
        	int numero2 = 1+random.nextInt(3);
          if (numero2 == 1) {
          	int numero3 = 1+random.nextInt(1000);
            resultado = resultado + numero2 + " " + numero3 + "\n"; 
          } else {
          	resultado = resultado + numero2 + "\n";
          }
        }
        System.out.println(resultado);
    }
    
}