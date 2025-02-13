import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class rt {
    public static void main(String[] args) {
        
            System.out.println("введите номер задания:");
            System.out.println("   Задание 1 - 1    ");
            System.out.println("   Задание 2 - 2    ");
            System.out.println("   Задание 3 - 3    ");
            Scanner sc = new Scanner(System.in);
            int select = sc.nextInt();
            sc.close();
            if (select == 1){exe1();}
            else if (select == 2){exe2();}
            else if (select == 3){exe3();}
        
    }

    public static void exe1(){
        //Ввести с консоли 3 целых числа.
        //На консоль вывести: числа,
        //которые делятся на 5 и на 7.
        List<Integer> nums = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1");
        nums.add(scanner.nextInt());
        scanner.close();
        
    }

    public static void exe2(){

    }

    public static void exe3(){

    }
}