package Java;


//https://www.codewars.com/kata/51e056fe544cf36c410000fb/train/java

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TopWords_MostUsedWordsInAText {
    public static List<String> top3(String textToUse) {
        if (textToUse == null){ return null;}

        HashMap<String, Integer> topThreeWords = new HashMap<String, Integer>();
        Pattern wordToSearch;
        //TODO: confirmar que es esta expresión regular 
        Matcher wordFinder = Pattern.compile("[\\w']+").matcher(textToUse);

        String wordToAnalyse;
        Integer usesOfAWord;
        while(wordFinder.find()){
            wordToAnalyse = wordFinder.group();
            String regex = "[\\W&&[^']]"+wordToAnalyse +"[\\W&&[^']]"+
                            "|^"+wordToAnalyse +"[\\W&&[^']]" +
                            "|[\\W&&[^']]"+wordToAnalyse +"$";
            wordToSearch = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            usesOfAWord = 0;
            
            Matcher matcher = wordToSearch.matcher(textToUse);
            while(matcher.find()){
               usesOfAWord++;
            }

            topThreeWords.put(wordToAnalyse.toLowerCase(), usesOfAWord);


            //Ver si hay más de 3 elementos y quitar el de menos repeticiones
            if (topThreeWords.size()>3){
                removeTheLeastUsedWord(topThreeWords);
            }

        }

        ArrayList<String> finalTop = sortingAMap(topThreeWords);

        return finalTop;
    }

    private static void removeTheLeastUsedWord(HashMap<String, Integer> topThreeWords) {
        String stringToRemove = null;

        Entry<String, Integer> candidateToBeRemoved;
        Iterator<Entry<String, Integer>> iterator = topThreeWords.entrySet().iterator();
        while(iterator.hasNext()){
            candidateToBeRemoved = iterator.next();
            if (stringToRemove == null || candidateToBeRemoved.getValue() < topThreeWords.get(stringToRemove) ){
                stringToRemove = candidateToBeRemoved.getKey();
            }
        }

        topThreeWords.remove(stringToRemove);
    }

    private static ArrayList<String> sortingAMap(HashMap<String, Integer> topThreeWords) {
        Iterator<String> iterator = topThreeWords.keySet().iterator();
        ArrayList<String> finalTop = new ArrayList<String>();
        while(iterator.hasNext()){
            String stringToAdd = iterator.next();
            int posicion = 0;

            for (String stringAdded : finalTop) {
                //TODO: asegurarse que debo usar el "<" y no el "<="
                if (topThreeWords.get(stringToAdd) < topThreeWords.get(stringAdded)){
                    posicion++;
                }
            }

            finalTop.add(posicion, stringToAdd);
        }
        return finalTop;
    }

    private static void testing(List<String> actual, String expected){
        System.out.print("Expected: " + expected + "\nActual: [");
        Iterator<String> iterator = actual.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + ", ");
        }
        System.out.println("]\n\n\n");
    }

    private static String concatenarUnArrayDeString(String[] array){
        StringBuilder result = new StringBuilder();

        int i = 0;
        for (String string : array) {
            result.append(i++ + string + "\n");
        }

        return result.toString();
    }
    public static void main(String[] args) {
        /*
        String stringActual1 = "In a village of La Mancha, the name of which I have no desire to call to mind, there lived not long since one of those gentlemen that keep a lance in the lance-rack, an old buckler, a lean hack, and a greyhound for coursing. An olla of rather more beef than mutton, a salad on most nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra on Sundays, made away with three-quarters of his income.";
        String stringExpected1 = "[a, of, on]";

        testing(top3(stringActual1), stringExpected1);
    */
    
    //    /*
        String stringActual2 = "e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e";
        String stringExpected2 = "[e, ddd, aa]";
        testing(top3(stringActual2), stringExpected2);


        String stringActual3 = "  //wont won't won't";
        String stringExpected3 = "[\"won't\", \"wont\"]";
        testing(top3(stringActual3), stringExpected3);
        

        /*
        String StringActual4 = "  , e   .. ";
        String stringExpected4 = "e";
        testing(top3(StringActual4), stringExpected4);

    //    */
    }
}
