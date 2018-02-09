package hardTask;


public class FunctionController {

    public class FibonacciFunc extends Function{

        private int arg;

        @Override
        public String getName() {
            return "FIB";
        }

        @Override
        public void setArgs(String[] args) {
            arg = Integer.parseInt(args[0]);
        }

        @Override
        public int getNumArgs() {
            return 1;
        }

        @Override
        public void run() {
            Performance.writeFile(3,RealizationFunc.fibonacci(arg));
        }
    }

    public class FactorialFunc extends Function{

        private int arg;

        @Override
        public String getName() {
            return "F";
        }

        @Override
        public void setArgs(String[] args) {
            arg = Integer.parseInt(args[0]);
        }

        @Override
        public int getNumArgs() {
            return 1;
        }

        @Override
        public void run() {
            Performance.writeFile(2,RealizationFunc.factorial(arg));
        }
    }

    public class AckermannFunc extends Function{

        private int arg1;
        private int arg2;

        @Override
        public String getName() {
            return "ACK";
        }

        @Override
        public void setArgs(String[] args) {
            arg1 = Integer.parseInt(args[0]);
            arg2 = Integer.parseInt(args[1]);
        }

        @Override
        public int getNumArgs() {
            return 2;
        }

        @Override
        public void run() {
            Performance.writeFile(1,RealizationFunc.ackermann(arg1,arg2));
        }
    }

}
