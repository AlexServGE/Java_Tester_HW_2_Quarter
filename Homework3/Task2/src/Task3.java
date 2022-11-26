import java.util.*;

/**
 * - Создать два списка LinkedList и ArrayList
 * Нужно создать два списка – LinkedList и ArrayList.
 * - Провести 10 тысяч вставок, удалений
 * Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set. (исключетельно методами, за 10 тыс элементов можно взять числп от 1 до 10_001)
 * - Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
 * Метод getTimeMsOfInsert должен вернуть время его исполнения в миллисекундах. (Подсказка - import java.util.Date;)
 * - Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
 * Метод getTimeMsOfGet должен вернуть время его исполнения в миллисекундах.(Подсказка - import java.util.Date;)
 */


public class Task3 {
    public static void main(String[] args) {
        Task3 tk = new Task3();
        List<Integer> myArrayList = new ArrayList<>();
        List<Integer> myLinkedList = new LinkedList<>();
        tk.getTimeMsOfInsert(myArrayList);
        tk.getTimeMsOfInsert(myLinkedList);
        tk.getTimeMsOfGet(myArrayList);
        tk.getTimeMsOfGet(myLinkedList);
    }

    public void getTimeMsOfInsert(List<Integer> someList) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            someList.add(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println(String.format("Время выполнения операции Insert для %s составило %d миллисекунды", someList.getClass(), finish - start));
    }

    public void getTimeMsOfGet(List<Integer> someList) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < someList.size(); i++) {
            someList.get(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println(String.format("Время выполнения операции get для %s составило %d миллисекунды", someList.getClass(), finish - start));
    }
}