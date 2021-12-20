public class ValidarParéntesis {
    public static boolean validParentheses(String parens){
        //Put code below
        char letter;
        int parensOpen = 0;

        for (int i = 0; i < parens.length(); i++) {
            letter = parens.charAt(i);

            if (parensOpen<0){
                return false;
            }

            if (letter == '('){ ++parensOpen; }
            else if ( letter == ')'){ --parensOpen;}
        }

        if (parensOpen == 0){ return true; }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(validParentheses(""));
        System.out.println(validParentheses("()()()"));
        System.out.println(validParentheses("(()())"));
        System.out.println(validParentheses(")()("));
        System.out.println(validParentheses(")(()()"));

    }
}