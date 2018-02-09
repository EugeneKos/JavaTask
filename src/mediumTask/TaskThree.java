package mediumTask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskThree {

    /*
     * Программа выполняющая Run-length encoding декодирование строки (3a1b2c2d->aaabccdd).
     *
     * Метод decoderString разбивает строку на группы чисел и символов, далее собирает
     * строку с помощью метода assembleString
     */


    public static void decoderString(String text){
        Pattern pattern = Pattern.compile("([0-9]+)([a-zA-Z])");
        Matcher matcher = pattern.matcher(text);
        String result = "";
        while (matcher.find()){
            result += assembleString(matcher.group(2),Integer.parseInt(matcher.group(1)));
        }
        System.out.println(result);
    }

    private static String assembleString(String sym, int num){
        String res = "";
        for (int i=0; i<num; i++){
            res += sym;
        }
        return res;
    }

    public static void main(String[] args) {
        decoderString("3a3L4B50k");
        decoderString("3a1b2c2d");
    }
}
