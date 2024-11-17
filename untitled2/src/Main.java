import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номердня недели:");
        int d = in.nextInt();
        switch (d) {
            case 1:
                System.out.println("ПОН");
                break;
            case 2:
                System.out.println("ВТ");
                break;
            case 3:
                System.out.println("СР");
                break;
            case 4:
                System.out.println("ЧТ");
                break;
            case 5:
                System.out.println("ПТ");
                break;
            case 6:
                System.out.println("СБ");
                break;
            case 7:
                System.out.println("ВС");
                break;
            default:
                System.out.println("ОШИБКА");
        }
    }
}
