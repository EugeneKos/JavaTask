package mediumTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TaskOne {

    /*
     *  Программа, возвращающая n-й по величине элемент набора чисел.
     */

    public static void getNLargestElement() throws IOException {
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
        System.out.println("Набор чисел без повторений: "+listNum);
        listNum = sortList(listNum);
        System.out.println("Отсортированный набор чисел: "+listNum);

        int num;
        while (true){
            try {
                System.out.print("введите величину возвращаемого элемента >");
                num = Integer.parseInt(bufferedReader.readLine());
                if(num < listNum.size()+1 && num >= 1)
                    break;
                System.out.println("некорректная велечина, попробуйте снова");
            } catch (NumberFormatException e){
                System.out.println("некорректная велечина, попробуйте снова");
            }
        }

        System.out.println(num+" по величине элемент равен "+listNum.get(num-1));
    }

    // Метод checkReps проверяет наличие повторяющихся значений

    private static boolean checkReps(double num, ArrayList<Double> list){
        for (int i=0; i<list.size(); i++){
            if(num == list.get(i))
                return false;
        }
        return true;
    }

    // Метод sortList сортирует лист в порядке возрастания

    private static ArrayList<Double> sortList(ArrayList<Double> listNum){
        for (int i=0; i<listNum.size()-1; i++){
            for(int j=0; j<listNum.size()-1; j++){
                if(listNum.get(j) < listNum.get(j+1)){
                    double temp = listNum.get(j);
                    listNum.set(j,listNum.get(j+1));
                    listNum.set(j+1,temp);
                }
            }
        }
        return listNum;
    }

    public static void main(String[] args) throws IOException {
        getNLargestElement();
    }
}
