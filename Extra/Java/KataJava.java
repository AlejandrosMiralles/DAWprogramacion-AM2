import java.util.ArrayList;

public class KataJava {

    public static int[] arrayDiff(int[] a, int[] b) {
        if (a.length == 0){ return a;}
        
        
        Integer[] claseEntero = new Integer[a.length],bClase = new Integer[b.length],
             resultEntero;
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int[] resultado;

        for (int i = 0; i < a.length; i++) {
            claseEntero[i] = Integer.valueOf(a[i]);
            lista.add(claseEntero[i]);
        }

        if (lista.size()<1){ lista.add(-1);}

        for (int i = 0; i < bClase.length; i++) {
            bClase[i] = Integer.valueOf(b[i]);
        }

        for (Integer eliminar : bClase) {
            while (lista.contains(eliminar)){ 
                lista.remove(eliminar);
            }
        }
        
        resultEntero = new Integer[lista.size()];
        for (int i = 0; i < lista.size(); ++i) {
            resultEntero[i] = lista.get(i);
        }

        resultado = new int[resultEntero.length];
        for (int j = 0; j < resultado.length; j++) {
            resultado[j] = resultEntero[j];
        }

        return resultado;
    }

    public static void main(String[] args) {
    //    System.out.println(arrayDiff(new int[] {34,56,1}, new int[] {34}));
    //    System.out.println(arrayDiff(new int[] {34,345,345,35,35,35, 345, 456,35,346}, new int[] {34,35}));
        System.out.println(arrayDiff(new int[] {34,56,1}, new int[] {}));
        System.out.println(arrayDiff(new int[] {}, new int[] {}));
        System.out.println(arrayDiff(new int[] {}, new int[] {34}));
    
    }
  
}