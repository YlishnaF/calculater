package sample;

public class Logic {
    public long calculate(long num1, long num2, String oper){
        switch (oper) {
            case "+":
                return  num1+num2;
            case "-":
                return  num1-num2;
            case "/":
                if (num2==0)
                    return 0;
                return  num1/num2;
            case "*":
                return  num1*num2;
        }
        System.out.println("Неизвестны оператор -" + oper);
        return 0;
    }
}
