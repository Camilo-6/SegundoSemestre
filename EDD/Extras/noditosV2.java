import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class noditosV2 {

    public static int numerito(BufferedReader in) throws IOException {
        return Integer.parseInt(in.readLine());
    }
    
    public static void main(String[] args) {
        
        InputStreamReader isIn = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isIn);

        try {
            int n = numerito(in);
            int m = numerito(in);
            int[][] noditos = new int[m][2];
            int nodoAct = 0;

            for (int i = 0; i < m; i++) {
                String[] datos = in.readLine().split(" ");
                noditos[i][0] = Integer.parseInt(datos[0]);
                noditos[i][1] = Integer.parseInt(datos[1]);
            }

            while (nodoAct < (n-1)) {
                for (int i = 0; i < m; i++) {
                    if (noditos[i][0] == nodoAct) {
                        nodoAct = noditos[i][1];
                        noditos[i][0] = -1;
                        break;
                    } else if (i == (m-1)) {
                        System.out.println(0);
                        System.exit(0);
                    }
                }
            }

            System.out.println(1);

        } catch (IOException e) {
            System.out.println("Algo salio mal :(");
            System.exit(0);
        }

    }

}
