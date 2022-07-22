package tacos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class taquitosLista {

    public static int numerito(BufferedReader in) throws IOException {
        return Integer.parseInt(in.readLine());
    }
    
    public static void main(String[] args) {
        
        InputStreamReader isIn = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isIn);
        //String resultado = "";
        int vendidos = 0;

        try {
            int numero = numerito(in);
            List<Integer> ordenes = new ArrayList<>();
            for (int i = 0; i < numero; i++) {
                String accion = in.readLine();
                switch (accion.charAt(0)) {
                    case '1':
                        String[] datos = accion.split(" ");
                        int numTacos = Integer.parseInt(datos[1]);
                        ordenes.add(numTacos);
                        break;
                    case '2':
                        if (ordenes.size() == 0) {
                            System.out.println("Algo haces mal :(");
                            System.exit(0);
                        }
                        vendidos = vendidos + ordenes.get(0);
                        ordenes.remove(0);
                        break;
                    case '3':
                        //resultado = resultado + ordenes.size() + "\n";
                        System.out.println(ordenes.size());
                        break;
                    case '4':
                        //resultado = resultado + vendidos + "\n";
                        System.out.println(vendidos);
                        break;
                    default:
                        System.out.println("Algo haces mal :(");
                        System.exit(0);
                }
            }
            //System.out.println(resultado.strip());
        } catch (IOException e) {
            System.out.println("Algo salio mal :(");
            System.exit(0);
        }

    }
    
}
