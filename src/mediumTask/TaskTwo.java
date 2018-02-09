package mediumTask;

import java.util.ArrayList;

public class TaskTwo {

    /*
     * Программа выполняющая Run-length encoding кодирование строки (aaabccdd -> 3a1b2c2d)
     *
     * Метод coderString записывает в лист символов каждый новый встречающийся символ, а в лист чисел количество одинаковых символов.
     * Далее с помощью цикла собирается строка из элементов обоих листов.
     */

    public static void coderString(String string){
        int index = 0;
        int number = 1;
        ArrayList<Integer> listNum = new ArrayList<>();
        ArrayList<Character> listSym = new ArrayList<>();
        char sym  = string.charAt(0);
        listSym.add(sym);
        listNum.add(number);
        for (int i=1; i<string.length(); i++){
            if(sym == string.charAt(i)){
                listNum.set(index,++number);
            } else {
                sym = string.charAt(i);
                index++;
                number = 1;
                listNum.add(number);
                listSym.add(sym);
            }
        }
        String result = "";
        for (int i=0; i<listNum.size(); i++){
            result += listNum.get(i).toString() + listSym.get(i).toString();
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        coderString("aaabccdd");
        coderString("aaaBBBBBBBmmmmmLLLLLeeL");
    }
}
