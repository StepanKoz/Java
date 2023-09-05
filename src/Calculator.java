public class Calculator implements CalculatorInterface{
    private double num1;
    private double num2;
    private double result;

    //    public static void main(String[] arg) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Добро пожаловать в калькулятор!");
//        System.out.print("Введите первое число: ");
//        double num1 = scanner.nextDouble();
//
//        System.out.print("Введите оператор (+, -, *, /): ");
//        char operator = scanner.next().charAt(0);
//
//        System.out.print("Введите второе число: ");
//        double num2 = scanner.nextDouble();
//
//        double result = 0.0;
//
//        switch (operator) {
//            case '+':
//                result = num1 + num2;
//                break;
//            case '-':
//                result = num1 - num2;
//                break;
//            case '*':
//                result = num1 * num2;
//                break;
//            case '/':
//                if (num2 != 0) {
//                    result = num1 / num2;
//                } else {
//                    System.out.println("Ошибка: деление на ноль!");
//                    return;
//                }
//                break;
//            default:
//                System.out.println("Ошибка: неверный оператор!");
//                return;
//        }
//
//        System.out.println("Результат: " + result);
//    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResult() {
        return result;
    }

    public void sum() {
        result = num1 + num2;
    }

    public double sub() {
        return num1 - num2;
    }
}

