import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два значения температуры:");
        int troom = in.nextInt();
        int tcond = in.nextInt();
        System.out.println("Введите режим кондиционера(freeze,heat,auto,fan): ");
        String mode =  in.next();


        Condition cond = new Condition(troom,tcond);
        cond.setMode(mode);
        int k= cond.work();
        System.out.println(k);


    }
}