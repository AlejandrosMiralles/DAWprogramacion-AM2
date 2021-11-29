public class Contains {
    public static boolean contiene(String en, String esta) {
        boolean contiene= en.contains(esta);
        return contiene;
    }

    public static void main(String[] args) {
        char data[] = {'a', 'b', 'c'};
        String str = new String(data);
        String str2 = "abc", str3 = "ab", str4="abcd", str5="acd", str6= "ABC";

        System.out.println(contiene(str, str2));
        System.out.println(contiene(str, str3));
        System.out.println(contiene(str, str4));
        System.out.println(contiene(str, str5));
        System.err.println(contiene(str, str6));
    }
}
