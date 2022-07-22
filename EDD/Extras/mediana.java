import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mediana {

    public static int numerito(BufferedReader in) throws IOException {
        return Integer.parseInt(in.readLine());
    }

    public static void copiar(int[] datos, String[] numeritosListos) {
        for (int i = 0; i < numeritosListos.length; i++) {
            datos[i] = Integer.parseInt(numeritosListos[i]);
        }
    }

    private static void cambia(int[] arreglo, int i, int m) {
        int pequeña = arreglo[m];
        arreglo[m] = arreglo[i];
        arreglo[i] = pequeña;
    }

    public static void quickSort(int[] arreglo) {
        quickSortAu(arreglo, 0, arreglo.length-1);

    }

    private static void quickSortAu(int[] arreglo, int a, int b) {
        if (b <= a) {
            return;
        }
        int i = a+1;
        int j = b;
        while (i < j) {
            if (arreglo[i] > arreglo[a] && arreglo[j] <= arreglo[a]) {
                cambia(arreglo, i, j);
                i = i+1;
                j = j-1;
            } else if (arreglo[i] <= arreglo[a]) {
                i = i+1;
            } else {
                j = j-1;
            }
        }
        if (arreglo[i] > arreglo[a]) {
            i = i-1;
        }
        cambia(arreglo, a, i);
        quickSortAu(arreglo, a, i-1);
        quickSortAu(arreglo, i+1, b);
    }

    private static int checar(int[] datos, int buscar) {
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == buscar) {
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
            String numeritos = in.readLine();
            String[] numeritosListos = numeritos.split(" ");
            int[] datos = new int[numero];
            copiar(datos, numeritosListos);
            int[] ordenado = datos.clone();
            quickSort(ordenado);
            int mediana = ordenado[numero/2];
            int ubicacion = checar(datos, mediana);
            System.out.println(mediana+" "+ubicacion);
        } catch (IOException e) {
            System.out.println("Algo salio mal :(");
            System.exit(0);
        }

    }
    
}
