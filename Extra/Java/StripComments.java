//     https://www.codewars.com/kata/51c8e37cee245da6b40000bd/train/java

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.*;

public class StripComments {

	public static String stripComments(String text, String[] commentSymbols) {
        
        if(text == null){ return null;}

        String[] textToModify = text.split("\n");
        StringBuffer result = new StringBuffer("");

        for (int i = 0; i < textToModify.length; i++) {
            for (String symbol : commentSymbols) {
                symbol = checkSymbol(symbol);
                
                if (textToModify[i].startsWith(symbol)){  //De lo contrario, el split devolverá un array de 0 de longitud
                    textToModify[i] = "";
                    continue;
                } 
                
                textToModify[i] = textToModify[i].split(symbol)[0].stripTrailing();
            }
        }

        arrayStringtoStringBuilder(textToModify, result);

        return result.toString();
	}

    private static String checkSymbol(String symbol) {
        switch(symbol){
            case("$"): 
            case("^"):
            case("."):
            //            symbol = "\\"+symbol;
        }

        return "\\"+symbol;
    }

    private static void arrayStringtoStringBuilder(String[] textToModify, StringBuffer result) {
        for (int i = 0; i < textToModify.length - 1; i++) {
            result.append(textToModify[i]+"\n");
        }
        if (textToModify.length>0){
            result.append(textToModify[textToModify.length-1]);
        }
    }

    public static void main(String[] args) {
        assertEquals(null, stripComments(null, new String[] {"%", "!"}));
        assertEquals("", stripComments("%%", new String[] {"%", "!"}));
        assertEquals(
				"apples, pears\ngrapes\nbananas",
				StripComments.stripComments( "apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" } )
		);
        assertEquals(
				"a\nc\nd",
				StripComments.stripComments( "a #b\nc\nd $e f g", new String[] { "#", "$" } )
		);
    }
}
