public class Comparar {
    public static void comparador(String string1, String string2) {
        int comparacion = string1.compareTo(string2);

        if(comparacion>0){
            System.out.println("La primera string ("+string1+") es mayor que la segunda ("+string2+").");
        }else if(comparacion<0){
            System.out.println("La primera string ("+string1+") es menor que la segunda ("+string2+").");
        }else{
            System.out.println("Las dos strings son iguales.");
        }
    }
    public static void main(String[] args) {
        char data[] = {'a', 'b', 'c'};
        String str = new String(data);
        String str2 = "abc", str3 = "ab", str4="abcd", str5="acd", str6= "ABC";

        comparador(str, str2);
        comparador(str, str3);
        comparador(str, str4);
        comparador(str, str5);
        comparador(str, str6);
    }
}
