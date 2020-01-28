/**
 * Created by snadi on 2019-01-30.
 */
public class RomanNumeral {

    public static int convert(String input){

        int value = 0;
        for(int i = input.length() - 1; i >= 0; i-- ){
            switch(input.charAt(i)){
                case 'I':
                    value += 1;
                    break;
                case 'V':
                    value += 5;
                    break;
                case 'X':
                    value += 10;
                    break;
                default:
                    return -1;
            }
        }

        return value;
    }

}
