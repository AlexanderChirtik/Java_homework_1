import java.util.Scanner;

public class Task{
    public static void main(String[] args){
        View();
        PrintResult(GetNumber(EnterValue()));
    }


    public static void View(){
        System.out.print("Введите число n, для вычисления n-ого треугольного числа ");
    }

    public static int EnterValue(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        return number;
    }

    public static int GetNumber(int value){
        int result = (value*(value + 1) / 2);
        return result;
    }

    public static void PrintResult(int value){
        System.out.print("Треугольное число = " + value);
    }
}