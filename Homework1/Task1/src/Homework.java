import java.io.*;
import java.util.List;

public class Homework {

//    +Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму.
//    Пример 1: а = 3, b = 2, ответ: 9
//    Пример 2: а = 2, b = -2, ответ: 0.25
//    Пример 3: а = 3, b = 0, ответ: 1
//    Пример 4: а = 0, b = 0, ответ: не определено

    public static void main(String[] args) throws IOException {
        Homework hw = new Homework();
        System.out.println(hw.myPower(3, 2));
        System.out.println(hw.myPower(2, -2));
        System.out.println(hw.myPower(3, 0));
//        System.out.println(hw.myPower(0, 0));

        /**
         * Чтение и запись в файл
         */
        FileReader fr = new FileReader("Input.txt");
        BufferedReader br = new BufferedReader(fr);
        Integer power = Integer.valueOf(List.of(br.readLine().split(" ")).get(1));
        Integer num = Integer.valueOf(List.of(br.readLine().split(" ")).get(1));
        FileWriter fw = new FileWriter("Output.txt", false);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(String.valueOf(hw.myPower(num, power)));
        bw.close();
        fw.close();
    }

    public Double myPower(Integer num, Integer power) {
        Double result = 1.0;
        boolean powerIsNegative = false;
        if (power == 0 && num == 0) {
            throw new IllegalStateException("не определено");
        }
        if (power == 0) return 1.0;
        if (power < 0) {
            power = -power;
            powerIsNegative = true;
        }
        for (int i = 0; i < power; i++) {
            result *= num;
        }
        return powerIsNegative ? 1 / result : result;
    }
}