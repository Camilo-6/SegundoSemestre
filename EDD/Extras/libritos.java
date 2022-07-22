import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class libritos {

    public static int numerito(BufferedReader in) throws IOException {
        return Integer.parseInt(in.readLine());
    }

    public static void guardar(String[] datos, BufferedReader in, int cantidad) throws IOException {
        for (int i = 0; i < cantidad; i++) {
            datos[i] = in.readLine();
        }
    }

    private static int checar(String[] datos, String buscar) {
        for (int i = 0; i < datos.length; i++) {
            if (datos[i].equals(buscar)) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
        InputStreamReader isIn = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isIn);

        try {
            int numero = numerito(in);
            int cantidad = numero*2;
            String[] datos = new String[cantidad];
            guardar(datos, in, cantidad);
            String buscar = in.readLine();
            int mostrar = checar(datos, buscar);
            System.out.println(datos[mostrar+1]);
        } catch (IOException e) {
            System.out.println("Algo salio mal :(");
            System.exit(0);
        }

    }
    
}
