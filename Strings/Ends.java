public class Ends {
    public static boolean terminacion(String acaba, String en) {
        boolean fin = acaba.endsWith(en);
        return fin;
    }

    public static void main(String[] args) {
        char data[] = {'a', 'b', 'c'};
        String str = new String(data);
        String str2 = "abc", str3 = "ab", str4="abcd", str5="acd", str6= "ABC", str7= "cabc";

        System.out.println(terminacion(str, str2));
        System.out.println(terminacion(str, str3));
        System.out.println(terminacion(str, str4));
        System.out.println(terminacion(str, str5));
        System.out.println(terminacion(str, str6));
        System.out.println(terminacion(str, str7));
    }
}
