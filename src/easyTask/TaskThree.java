package easyTask;

public class TaskThree {

    /*
     * Программа, выполняющая проверку строки на то, что она является палиндромом
     * Метод isPalindrom проверяет является ли строка палиндромом, по средствам записи символов с конца исходной строки
     * в новую строку и проверкой их равности.
     * Метод noSpace собирает исходную строку без пробелов
     */


    public static boolean isPalindrom(String text){
        text = noSpace(text);
        String newText = "";
        for(int i=text.length()-1; i>=0; i--){
            newText += text.charAt(i)+"";
        }
        if(text.equals(newText)){
            return true;
        }
        return false;
    }

    private static String noSpace(String text){
        String newText = "";
        for (int i=0; i<text.length(); i++){
            if(text.charAt(i) != ' '){
                newText += ""+text.charAt(i);
            }
        }
        return newText;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrom("а роза упала на лапу азора"));
    }
}
