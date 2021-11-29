public class IndexOf {
    public static int encontrarposicion(String enelinterior, String de) {
        int posicion = de.indexOf(enelinterior);
        return posicion;
    }
    
    public static void main(String[] args) {
        char data[] = {'a', 'b', 'c'};
        String str = new String(data);
        String str2 = "abc", str3 = "ab", str4="abcd", str5="acd", str6= "ABC", str7= "cabc";

        System.out.println(encontrarposicion(str, str2));
        System.out.println(encontrarposicion(str, str3));
        System.out.println(encontrarposicion(str, str4));
        System.out.println(encontrarposicion(str, str5));
        System.out.println(encontrarposicion(str, str6));
        System.out.println(encontrarposicion(str, str7));
    }
}
