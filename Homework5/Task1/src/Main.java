import java.util.*;

public class Main {

    // Дана строка. Необходимо написать метод, который отсортирует слова в строке по длине с помощью TreeMap.
    // Строки с одинаковой длиной не должны “потеряться”.
    public static void main(final String[] args) {
        Main tk = new Main();
        String text = "Если вы можете мечтать об этом вы можете это сделать";
        System.out.println(tk.getSortedIncludesWords(text));
    }

    public String getSortedIncludesWords(final String inputText) {
        List<String> inputTextList = Arrays.asList(inputText.toLowerCase().split(" "));
        Map<Integer, List<String>> subResultMap = new TreeMap<>();
        for (String item : inputTextList) {
            if (subResultMap.containsKey(item.length())) {
                List<String> temp = subResultMap.get(item.length());
                temp.add(item);
                subResultMap.put(item.length(), temp);
            } else {
                List<String> temp = new ArrayList<>(List.of(item));
                subResultMap.put(item.length(), temp);
            }
        }
        StringBuilder resultText = new StringBuilder();
        for (List<String> item : subResultMap.values()) {
            resultText.append(item);
        }
        return String.valueOf(resultText);
    }
}
