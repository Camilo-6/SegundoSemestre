import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class noditos {

    public static class nodo {

        private int x;
        private int y;

        public nodo(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override public boolean equals(Object objeto) {
            if (!(objeto instanceof nodo))
                return false;
            nodo nodo = (nodo)objeto;
            if ((nodo.getX() == this.getX()) && (nodo.getY() == this.getY())) {
                return true;
            } else {
                return false;
            }
        }

        @Override public String toString() {
            return x+" "+y;
        }

    }

    public static boolean contiene(List<nodo> lista, nodo buscar) {
        for (nodo n : lista) {
            if (n.equals(buscar)) {
                return true;
            }
        }
        return false;
    }

    public static List<nodo> listaConX(List<nodo> base, int X) {
        List<nodo> listita = new ArrayList<>();
        for (nodo n : base) {
            if (n.getX() == X) {
                listita.add(n);
            }
        }
        return listita;
    }

    public static void copiar(List<nodo> prim, List<nodo> fina) {
        fina.clear();;
        for (nodo n : prim) {
            fina.add(n);
        }
    }

    public static void magia(List<nodo> base, List<nodo> aux, List<nodo> resultado) {
        List<nodo> aux2 = new ArrayList<>();
        for (nodo n : aux) {
            int x = n.getY();
            List<nodo> primera = listaConX(base, x);
            for (nodo no : primera) {
                resultado.add(no);
                aux2.add(no);
            }
        }
        copiar(aux2, aux);
    }
 
    public static void main(String[] args) {
    
        InputStreamReader isIn = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isIn);

        try {
            int N = Integer.parseInt(in.readLine());
            int M = Integer.parseInt(in.readLine());
            List<nodo> totalNodos = new ArrayList<>();
            for (int i = 0; i < M; i++) {
                String[] datos = in.readLine().split(" ");
                nodo nodo = new nodo(Integer.parseInt(datos[0]), Integer.parseInt(datos[1]));
                totalNodos.add(nodo);
            }
            List<nodo> aux0 = listaConX(totalNodos, 0);
            List<nodo> ultima = listaConX(totalNodos, 0);
            for (int i = 0; i < N-1; i++) {
                magia(totalNodos, aux0, ultima);
            }
            for (nodo n : ultima) {
                if (n.getY() == N-1) {
                    System.out.println(1);
                    System.exit(0);
                }
            }
            System.out.println(0);
        } catch (IOException e) {
            System.out.println("Algo salio mal :(");
            System.exit(0);
        }

    }
    
}
