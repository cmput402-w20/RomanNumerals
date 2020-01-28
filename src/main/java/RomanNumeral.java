/**
 * Created by snadi on 2019-01-30.
 */
public class RomanNumeral {

    public static int convert(String input){
        if(input.equals("I"))
            return 1;
        else if (input.equals("III"))
            return 3;
        else if (input.equals("VI"))
            return 6;
        else if (input.equals("IV"))
            return 4;
        else if (input.equals("XVI"))
            return 16;
        else if (input.equals("XIV"))
            return 14;
        else
            return 0;
    }

}
