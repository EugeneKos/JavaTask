package easyTask;

public class TaskFive {

    /*
     * Программа, выполняющая поиск подстроки в строке.
     * Метод checkSubstring проверяет наличие подстроки в строке без использования
     * библиотечного метода contains
     *
     * Метод checkSubstringTwo соответственно с использованием библиотечного метода
     */


    public static boolean checkSubstring(String string, String subString){
        int begin = 0;
        int count = 0;
        for (int i=0; i<subString.length(); i++){
            char symbol = subString.charAt(i);
            for (int j=begin; j<string.length(); j++){
                if(symbol == string.charAt(j)){
                    count++;
                    begin = j + 1;
                    break;
                }
            }
        }
        if(count == subString.length())
            return true;
        return false;
    }



    public static boolean checkSubstringTwo(String text1, String text2){
        return text1.contains(text2);
    }

    public static void main(String[] args) {
        System.out.println(checkSubstring("здравствуйте меня зовут евгений", "евген"));
        System.out.println(checkSubstringTwo("здравствуйте меня зовут евгений", "зов"));
    }
}
