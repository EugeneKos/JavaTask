package hardTask;


public class RealizationFunc {


    static int fibonacci(int num){
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }
        if(num == 2){
            return 1;
        }
        return fibonacci(num-1) + fibonacci(num-2);
    }


    static int factorial(int num){
        if(num == 0)
            return 1;
        return factorial(num-1)*num;
    }


    static int ackermann(int m, int n){
        if(m == 0){
            return n+1;
        }
        else if(m > 0 && n == 0){
            return ackermann(m-1,1);
        }
        else if(m > 0 && n > 0){
            return ackermann(m-1, ackermann(m,n-1));
        }
        return -1;
    }

}
