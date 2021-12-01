public class SumarBinario {
    public static String sumaBin(String x, String y) {
        String resultado = "", z;
        boolean carrito = false;
        int suma = 0, posicionY;

        if (x.length()<y.length()){
            z = y;
            x = y;
            y = z;
        }


        for (int i = x.length()-1; i >= 0; i--) {
            posicionY = y.length() - 1 - (x.length()-i);
            suma = 0;


            if (x.charAt(i) == '1'){
                ++suma;
            }
            if (posicionY>=0){
                if (y.charAt(posicionY) == '1'){
                    ++suma;
                }
            }
            if (carrito){
                ++suma;
            }

            switch (suma){
                case 2:
                    carrito = true;
                case 0:
                    resultado+= '0';
                    break;

                case 3:
                    carrito = true;
                case 1:
                    resultado+= '1';
                    break;
            }
        }

        char[] aInvertir = new char[resultado.length()];
        for (int i = 0; i < aInvertir.length; i++) {
            aInvertir[i] = resultado.charAt(i);
        }

        resultado = "";

        for (int i = aInvertir.length-1; i >= 0; i--) {
            resultado+= aInvertir[i];
        }

        return resultado;
    }    

    public static void main(String[] args) {
        System.out.println(sumaBin("100", "111"));
    }
}