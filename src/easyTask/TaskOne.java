package easyTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class TaskOne {

    /*
     * Программа, возвращающая 2-й по величине элемент набора чисел.
     * Метод getSecondLargestElement получает числа до ввода exit,
     * проверяет есть ли число в листе чисел, если нет, то добавляет его в лист
     * далее лист сортируется по возрастанию и выводится второй элемент листа
     */

    public static void getSecondLargestElement() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Double> listNum = new ArrayList<>();
        String data;
        System.out.print("введите число, для остановки введите exit >");
        while (!(data = bufferedReader.readLine()).equals("exit")){
            try {
                double num = Double.parseDouble(data);
                if(checkReps(num,listNum))
                    listNum.add(num);
                System.out.print("введите число, для остановки введите exit >");
            } catch (NumberFormatException e){
                System.out.println("некорректная ввод, попробуйте снова");
                System.out.print("введите число, для остановки введите exit >");
            }
        }
        System.out.println("исходный лист чисел: "+listNum);
        for (int i=0; i<listNum.size()-1; i++){
            for(int j=0; j<listNum.size()-1; j++){
                if(listNum.get(j) < listNum.get(j+1)){
                    double temp = listNum.get(j);
                    listNum.set(j,listNum.get(j+1));
                    listNum.set(j+1,temp);
                }
            }
        }
        System.out.println("отсортированный лист чисел: "+listNum);
        System.out.println("второе по величине число: "+listNum.get(1));
    }

    // Метод checkReps проверяет наличие повторяющихся значений

    private static boolean checkReps(double num, ArrayList<Double> list){
        for (int i=0; i<list.size(); i++){
            if(num == list.get(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        getSecondLargestElement();
    }
}
