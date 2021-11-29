public class Concat {
    public static String concatenador(String str1, String str2) {
        String concatenado = str1.concat(str2);
        return concatenado;
    }

    public static void main(String[] args) {
        char data[] = {'a', 'b', 'c'};
        String str = new String(data);
        String str2 = "abc", str3 = "ab", str4="abcd", str5="acd", str6= "ABC";
    
        System.out.println(concatenador(str, str2));
        System.out.println(concatenador(str, str3));
        System.out.println(concatenador(str, str4));
        System.out.println(concatenador(str, str5));
        System.out.println(concatenador(str, str6));
    }    
}

