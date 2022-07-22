package tacos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class taquitosArreglo {

    public static int numerito(BufferedReader in) throws IOException {
        return Integer.parseInt(in.readLine());
    }
    
    public static void main(String[] args) {
        
        InputStreamReader isIn = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isIn);
        int taquitos = 0;
        int fila = 0;
        int atendidios = 0;
        int orden = 0;
        int[] cantidades = new int[10000];
        String textito = "";

        try {
            int numero = numerito(in);
            for (int i = 0; i < numero; i++) {
                String accion = in.readLine();
                switch (accion.charAt(0)) {
                    case '1':
                        String[] datos = accion.split(" ");
                        int tacos = Integer.parseInt(datos[1]);
                        cantidades[orden] = tacos;
                        orden += 1;
                        fila += 1;
                        break;
                    case '2':
                        fila -= 1;
                        taquitos += cantidades[atendidios];
                        atendidios += 1;
                        break;
                    case '3':
                        textito = textito+fila+"\n";
                        break;
                    case '4':
                        textito = textito+taquitos+"\n";
                        break;
                    default:
                        System.out.println("Algo haces mal :(");
                        System.exit(0);
                }
            }
            System.out.println(textito.substring(0, textito.length() - 1));
        } catch (IOException e) {
            System.out.println("Algo salio mal :(");
            System.exit(0);
        }

    }
    
}
