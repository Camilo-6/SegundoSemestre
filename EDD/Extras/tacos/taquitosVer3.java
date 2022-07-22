package tacos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

public class taquitosVer3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int vendidos=0;
        List<Integer> fila = new ArrayList<>();
        int operaciones = sc.nextInt(); 
      	
        for (int i = 0; i < operaciones; i++) {
          int actual=sc.nextInt();
          switch(actual){
              case 1:
              int pedido = sc.nextInt(); 
              fila.add(pedido);
            break; 
            case 2:
              if (fila.size() > 0) {
                vendidos += fila.get(0);   
                fila.remove(0);
              }
            break; 
            case 3:
              System.out.println(fila.size());
            break; 
            case 4: 
              System.out.println(vendidos);
            break; 
          }
        }
    }
    
}
