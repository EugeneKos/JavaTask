package easyTask;

public class TaskTwo {

    /*
     * Программа, выполняющая разложение числа на набор простых множителей
     */

    public static void decompositionNum(int num){
        if (simpleNum(num)){
            System.out.println(num);
            return;
        }
        for(int i=2; i<num; i++){
            if(simpleNum(i)){
                if(num % i == 0){
                    num /= i;
                    System.out.println(i);
                    decompositionNum(num);
                    return;
                }
            }
        }
    }

    // метод проверяет является ли число простым

    private static boolean simpleNum(int num){
        for(int i=2; i<num-1; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        decompositionNum(78);
    }
}
