public class StringSplit {
    public static String[] solution(String s) {
        //Write your code here
        String[] parejas;

        if (s.length()%2 != 0){
            s = s.concat(" ");
        }

        parejas = new String[s.length()/2];

        for (int i = 0; i < s.length(); i+=2) {
            //Java thinks that "s.char(i) + s.char(i+1)" is a integer,
                //so I added a "" to make think that it's a String.
            parejas[i/2] = s.charAt(i)+ "" + s.charAt(i+1);
        }

        return parejas;

    }

    public static void main(String[] args) {
        for (String parejas : solution("Hola mundo!!!")) {
            System.out.print(parejas + " ");
        }
        System.out.println("");

        for (String parejas : solution("abc")) {
            System.out.print(parejas + " ");
        }
        System.out.println("");
        for (String parejas : solution("abcdef")) {
            System.out.print(parejas + " ");
        }
    }

}