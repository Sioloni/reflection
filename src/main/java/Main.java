
public class Main {
    public static void main(String[] args) {

        System.out.println(Calculator.Q.processing(12,45));

//        calculator(12,34, Calculator.Q);
//        calculator(12,34, Calculator.W);
//        calculator(12,34, Calculator.E);
//        calculator(12,34, Calculator.R);

    }
    public static void calculator(int x, int y, Calculator calculator){
        switch (calculator){
            case Q:
                System.out.println(calculator.processing(x, y));
                break;
            case W:
                System.out.println(calculator.processing(x, y));
                break;
            case E:
                System.out.println(calculator.processing(x, y));
                break;
            case R:
                System.out.println(calculator.processing(x, y));
                break;
            default:
                System.out.println("Что то пошло не так");
        }
    }
}
