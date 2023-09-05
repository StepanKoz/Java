
public class Main {
    public static int counting(int[] elements){
        return elements.length;
    }
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.setNum1(0);
        c.setNum2(5);
        c.sum();
        System.out.println(c.getResult());
        System.out.println(c.sub());
        int[] money= new int[100];
        int[] count= new int[2];
        String[] names=  {"Alex", "Igor"};
        int number=counting(money);
        System.out.println(number);
        count[0] = 2;
        count[1]= 3;
        System.out.println(count);
    }
    }



