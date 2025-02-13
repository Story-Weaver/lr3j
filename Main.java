import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList();
        Scanner sr = new Scanner(System.in);
        System.out.println("Задание 1");
        System.out.print("Enter first number: ");
        arr.add(sr.nextInt());
        System.out.print("Enter second number: ");
        arr.add(sr.nextInt());
        System.out.print("Enter third number: ");
        arr.add(sr.nextInt());
        Collections.sort(arr);
        System.out.print("Возрастание: ");
        for( int i : arr){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        Collections.reverse(arr);
        System.out.print("Убывание: ");
        for( int i : arr){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        System.out.println("Задание 2");
        for(int i : arr){
            if(i<0){
                i++;
                System.out.print(i+" ");
            } else System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("Задание 3");
        List<Integer> fib = new ArrayList<Integer>();
        fib.add(1);
        fib.add(1);
        int i = 0;
        int val;
        while(true){
            val = fib.get(i) + fib.get(i+1);
            if(val > 10000000){break;}
            fib.add(val);
            i++;
        }
        for(int j : fib){
            System.out.print(j+" ");
        }
    }
}
