public class Sonpositivos {
    public static void positivos(int[] list){ 
        int cantidad = 0;
        for (int i=0; i<list.length; ++i){
            if (list[i]>=0){
                ++cantidad ;
            }
        }
        System.out.println(cantidad);
    }

    public static void main(String[] args) {
        int[] lista = {3,56, 0, -2, 1} ;
        positivos(lista) ;
    }
}
