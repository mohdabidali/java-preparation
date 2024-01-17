package CodingQuestions;
import java.util.*;

public class PatternMatchingAverageScore {
 
    public static void main(String[] args) {
        String[] input1 = {"Madeline Choi 5 5 6", "Ethan Wyatt 8 9 10"};
        String[] input2 = {"Denver Wagner 6 7 8", "Ernie Gibbs 11 2"};
        String[] input3 = {"Kim Ramos: 4 5 6", "Giovanni Landry - 10 10"};
        String[] input4 = {"Henrietta Moon:5;5;8", "Edwin Bonilla 100;"};

        System.out.println(calculateAverageScore(input1));
        System.out.println(calculateAverageScore(input2));
        System.out.println(calculateAverageScore(input3));
        System.out.println(calculateAverageScore(input4));
    }
    public static String calculateAverageScore(String[] input){
        StringBuilder result  = new StringBuilder();

        for(String entry: input){
            //creating  different arrays of the entries for example -- ["Henrietta", "Moon", "5", "5", "8"]
            String[] part = entry.split("[^a-zA-Z0-9]+");
            if(part.length >= 1){
                String name = part[0];
                int total = 0;
                int count = 0;
                
                for (int i = 1; i<part.length; i++){
                    if(isNumeric(part[i])){
                        try{
                            int marks = Integer.parseInt(name)
                            total += Integer.parseInt(part[i]);
                            count++;
                        }catch(NumberFormatException ignored){}
                        
                    }
                    else{
                        name += " "+part[i];
                    }
                }
              Integer average = count > 0? total/count : 0; 
              result.append(name.trim()).append("-").append(average).append(";");  
            }
        }
        return result.toString();
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
/**
 *
 * The expression str.matches("-?\\d+(\\.\\d+)?") is a regular expression used in Java to check if a given string (str) matches a specific pattern. Let's break down the components of this regular expression:

^: Anchors the match at the beginning of the string.

-?: Specifies an optional minus sign (-). This allows for an optional negative sign at the beginning of the number.

\\d+: Matches one or more digits. The \\d represents any digit from 0 to 9, and + specifies that there must be at least one or more digits.

(\\.\\d+)?: This is an optional group for the decimal part of the number. It consists of:

\\.: Matches the decimal point.
\\d+: Matches one or more digits after the decimal point.
?: Makes the entire decimal part optional, meaning it can appear zero or one time.
$: Anchors the match at the end of the string.

In summary, 
the regular expression "-?\\d+(\\.\\d+)?" is used to check if a string represents a numeric value,
which can be an integer or a decimal.
It allows for an optional minus sign at the beginning, 
followed by one or more digits, and an optional decimal part.
This pattern covers both integers and decimal numbers,
making it suitable for checking if a string is a valid numeric representation.
 */

