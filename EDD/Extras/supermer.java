import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class supermer {
    
    public static class producto {

        private String nombre;
        private double precio;

        DecimalFormat df = new DecimalFormat("0.############");

        public producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

        @Override public String toString() {
            return " | "+nombre+" | "+df.format(precio);
        }

    }

    public static void main(String[] args) throws IOException {
        
        InputStreamReader isIn = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isIn);
        int cont = 0;
        int n = Integer.parseInt(in.readLine());
        double total = 0;
        List<producto> carrito = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("0.############");

        if (n>100) {
            System.exit(0);
        }
        for (int i = 0; i < n; i++) {
            String datos = in.readLine();
            String[] datitos = datos.split(" ");
            double preci = Double.parseDouble(datitos[1]);
            producto nuevo = new producto(datitos[0], preci);
            carrito.add(nuevo);
            total += preci;
        }
        carrito.sort(
            (prod1, prod2) -> (Double.compare(prod1.precio, prod2.precio))
        );
        Collections.reverse(carrito);
        for (producto p : carrito) {
            cont++;
            System.out.println(cont+p.toString());
        }
        System.out.println(df.format(total));

    }

}
