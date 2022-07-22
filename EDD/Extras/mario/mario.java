package mario;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class mario {

    public static int numerito(BufferedReader in) throws IOException {
        return Integer.parseInt(in.readLine());
    }

    public static <T> List<Collection<T>> product(Collection<T> a, int r) {
        List<Collection<T>> result = Collections.nCopies(1, Collections.emptyList());
        for (Collection<T> pool : Collections.nCopies(r, new LinkedHashSet<>(a))) {
            List<Collection<T>> temp = new ArrayList<>();
            for (Collection<T> x : result) {
                for (T y : pool) {
                    Collection<T> z = new ArrayList<>(x);
                    z.add(y);
                    temp.add(z);
                }
            }
            result = temp;
        }
        return result;
    }

    public static void limpiar(List<Collection<Integer>> a, int n) {
        for (Collection<Integer> wowi : a) {
            int suma = 0;
            for (Integer i : wowi) {
                suma += i.intValue();
            }
            if (suma != n-1) {
                wowi.clear();
            }
        }
    }
    
    public static List<Integer> vidas(List<Collection<Integer>> a, int[][] tablero) {
        List<Integer> total = new ArrayList<>();
        return total;
    }
    
    public static void main(String[] args) {
    
        InputStreamReader isIn = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isIn);
        
        try {
            int n = numerito(in);
            int[][] tablero = new int[n][n];
            for (int i = 0; i < n; i++) {
               String [] aux = in.readLine().split(" ");
               for (int j = 0; j < n; j++) {
                   tablero[i][j]=Integer.parseInt(aux[j]);
               }
            }
            for (int k = 0; k < n; k++) {
               String [] aux2 = in.readLine().split("");
               for (int m = 0; m < n; m++) {
                   switch(aux2[m]){
                        case "b":
                            tablero[k][m]=tablero[k][m]*-1; 
                            break; 
                        case "l":
                            break;
                        case "x":
                            break; 
                        default:
                            throw new IOException();
                   }
               }
            }
            List<Collection<Integer>> caminos = product(List.of(0, 1), (n-1+n-1));
            limpiar(caminos, n);
            List<Integer> vidasPosibles = vidas(caminos,tablero);
            
        } catch (IOException e) {
            System.out.println();
            System.exit(0);
        }

    }

}