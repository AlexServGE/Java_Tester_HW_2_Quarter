import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите значений, сколько Вы весите в кг: ");
        Double userEarthWeight = input.nextDouble();
        Double userMoonWeight = userEarthWeight * 0.17;
        String outputMessage = String.format("Ваш вес в кг на Луне будет равен: %.2f",userMoonWeight);
        System.out.println(outputMessage);
    }
}