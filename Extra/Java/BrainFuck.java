//     https://www.codewars.com/kata/526156943dfe7ce06200063e/train/java

public class BrainFuck {

    private int[] comma;

    private static int move(int i, String instructions) {
        int count = 0;

        if (instructions.charAt(i) == '['){
            --i;
            do {
                ++i;
                if (instructions.charAt(i) == '['){ ++count;}
                else if (instructions.charAt(i) == ']'){--count;}
            } while (count != 0);
        }else{
            ++i;
            do {
                --i;
                if (instructions.charAt(i) == '['){ ++count;}
                else if (instructions.charAt(i) == ']'){--count;}
            } while (count != 0);
        }

        return i;
    }


    public void BrainLuck(String code) {  
        String result = "";
        int[] bytes = new int[5000];
        int pointer = 0;
        char instruction;
        for (int i = 0; i < code.length(); i++) {
            instruction = code.charAt(i);
            if (instruction == '+'){
                if (bytes[pointer] == 255){ bytes[pointer] = 0;}
                else{ ++bytes[pointer];}
            }else if (instruction == '-'){
                if (bytes[pointer] == 0){ bytes[pointer] = 255;}
                else{ --bytes[pointer];}

            }else if (instruction == '>'){
                ++pointer;
            }else if (instruction == '<'){
                --pointer;

            }else if (instruction == '.'){
                result += (char) bytes[pointer];
            }else if (instruction == ','){
                bytes[pointer] = comma[0];

            }else if (instruction == '[' || instruction == ']'){
                i = move(i, code);
            }
        }

        System.out.println(result);
    }

    public String process(String input) {
        comma = new int[input.length()];
        char[] letters = input.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            comma[i] = letters[i];
        }
        
        return "";
    }

    public static void main(String[] args) {
        BrainFuck prove = new BrainFuck();

        prove.process("Codewars");
        prove.BrainLuck(",[.[-],]");
    }
}
