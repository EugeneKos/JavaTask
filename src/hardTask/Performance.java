package hardTask;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Performance {

    private FunctionController functionController = new FunctionController();

    private Function[] functions = {functionController.new FibonacciFunc(), functionController.new FactorialFunc(), functionController.new AckermannFunc()};

    private ArrayList<Thread> listFunction = new ArrayList<>();

    private String nameFunc;

    public static void writeFile(int number, int result){
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter("src/hardTask/OutputFile",true),true);
            printWriter.println(number+" "+result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile(String filePath){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String item;
            while((item = bufferedReader.readLine()) != null){
                String[] args = parseString(item);
                for (Function function : functions) {
                    if(function.getName().equals(nameFunc)){
                        if(function.getNumArgs() == args.length){
                            function.setArgs(args);
                            listFunction.add(new Thread(function));
                        } else {
                            System.out.println("Неверное число аргументов для функции: "+nameFunc);
                        }
                    }
                }
            }
            startThread();
        } catch (FileNotFoundException e) {
            System.out.println("файл в каталоге < "+filePath+" > не найден");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String[] parseString(String text){
        Pattern pattern = Pattern.compile("\\s*([a-zA-z]+)\\s+([\\d+.?\\s+]+)");
        Matcher matcher = pattern.matcher(text);
        String[] args = {};
        while(matcher.find()){
            nameFunc = matcher.group(1);
            args = matcher.group(2).split("\\s+");
        }
        return args;
    }

    private void startThread(){
        for (Thread function : listFunction) {
            function.start();
        }
    }
}
