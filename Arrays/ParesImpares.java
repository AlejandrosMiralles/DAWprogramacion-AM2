import javax.swing.text.html.FormView;

public class ParesImpares {
    public static void main(String[] args) {   
        int[] numeros = {3,155,18,15640,1668,65461,461,641,65451};

        int pares=0, impares=0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2==0){
                ++pares;
            }else{
                ++impares;
            }
        }
        System.out.println("Pares: "+pares+"\nImpares: "+impares);
    }
}