package easyTask;

public class TaskFour {

    /*
     * Программа, возвращающая список разменов на 3,5 копеек и 3, 5, 7 копеек.
     */

    public static void exchangeThreeAndFive(int number){
        int countFive;
        int countThree = 0;
        int remainder;
        countFive = number / 5;
        if(number % 5 > 0){
            remainder = number % 5;
            while(remainder % 3 != 0){
                remainder = remainder + 5;
                countFive--;
                countThree += remainder / 3;
                remainder = remainder % 3;
            }
        }
        System.out.println("размен "+number+"к = 5к * "+countFive+" + 3к * "+countThree);
    }

    public static void exchangeThreeFiveAndSeven(int number){
        int countSeven;
        int countFive = 0;
        int countThree = 0;
        int remainder = number % 7;
        countSeven = number / 7;
        if(remainder > 0){
            while(remainder % 3 != 0){
                switch (remainder){
                    case 1:
                        countSeven--;
                        countFive++;
                        remainder += 5;
                        countThree++;
                        remainder = remainder % 3;
                        break;
                    case 2:
                        countSeven--;
                        remainder += 7;
                        countThree += remainder / 3;
                        remainder = remainder % 3;
                        break;
                    case 4:
                        remainder = remainder % 3;
                        countThree++;
                        break;
                    case 5:
                        remainder = remainder % 5;
                        countFive++;
                        break;
                }
            }
            if(remainder != 0){
                countThree += remainder / 3;
            }
        }
        System.out.println("размен "+number+"к = 7к * "+countSeven+" + 5к * "+countFive+" + 3к * "+countThree);
    }

    public static void main(String[] args) {
        exchangeThreeAndFive(29);
        exchangeThreeFiveAndSeven(34);
    }
}
