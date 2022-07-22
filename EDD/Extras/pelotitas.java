import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pelotitas {
 
    public static void main(String[] args) {
        
        InputStreamReader isIn = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isIn);

        try {
            String[] datos = in.readLine().split(" ");
            //int totalPel = Integer.parseInt(datos[0]);
            int mayorNum = Integer.parseInt(datos[1]);
            String[] info = in.readLine().split(" ");
            int[] cuenta = new int[mayorNum];
            for (String cad : info) {
                int numero = Integer.parseInt(cad);
                cuenta[numero-1] = cuenta[numero-1]+1;
            }
            for (int i = 0; i < cuenta.length; i++) {
                int algo = i+1;
                System.out.printf("%d: %d\n", algo, cuenta[i]);
            }
        } catch (IOException e) {
            System.out.println("Algo salio mal :(");
            System.exit(0);
        }

    }
    
}
