import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class banquito {

    public static int numerito(BufferedReader in) throws IOException {
        return Integer.parseInt(in.readLine());
    }
    
    public static void main(String[] args) {
        
        InputStreamReader isIn = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isIn);

        try {
            int numero = numerito(in);
            List<String> fila = new ArrayList<>();
            for (int i = 0; i < numero; i++) {
                String accion = in.readLine();
                switch (accion) {
                    case "E":
                        fila.add(accion);
                        break;
                    case "N":
                        if (fila.size() <= 4) {
                            fila.add(accion);
                            System.out.println("espera");
                        } else {
                            System.out.println("no espera");
                        }
                        break;
                    case "F":
                        fila.remove(0);
                        break;
                    default:
                        System.out.println("Algo haces mal :(");
                        System.exit(0);
                }
            }
        } catch (IOException e) {
            System.out.println("Algo salio mal :(");
            System.exit(0);
        }

    }
    
}
