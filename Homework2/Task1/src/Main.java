import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //char charAt(int index) Возвращает символ по указанному индексу.
        String exampleText = "Зимним темным вечером я учу методы строк в Java";
        char firstSymbol = exampleText.charAt(0);
        System.out.println(String.format("1 -> %s", firstSymbol));
        //int compareTo(Object o) Сравнивает данную строку с другим объектом.
        String exampleText2 = "Привет";
        int compareResult = exampleText2.compareTo("10");
        System.out.println(String.format("2 -> %d", compareResult));
        compareResult = exampleText2.compareTo("Привет");
        System.out.println(String.format("2 -> %d", compareResult));
        //int compareToIgnoreCase(String str) Сравнивает две строки лексически, игнорируя регистр букв.
        String exampleText3 = "Привет";
        compareResult = exampleText3.compareToIgnoreCase("привет");
        System.out.println(String.format("4 -> %d", compareResult));
        //String concat(String str) Объединяет указанную строку с данной строкой, путем добавления ее в конце.
        String exampleText5 = "Привет";
        String concatResult = exampleText5.concat("привет");
        System.out.println(String.format("5 -> %s", concatResult));
        //boolean contentEquals(StringBuffer sb) Возвращает значение true только в том случае,
        // если эта строка представляет собой ту же последовательность символов как указанно в буфере строки (StringBuffer).
        String exampleText6 = "Привет";
        boolean contentEqualsResult = exampleText6.contentEquals("Привет");
        System.out.println(String.format("6 -> %b", contentEqualsResult));
        //static String copyValueOf(char[] data)
        //Возвращает строку, которая представляет собой последовательность символов, в указанный массив.
        char[] exampleCharText7 = {'п', 'р', 'и', 'в', 'е', 'т', ' ', 'м', 'и', 'р'};
        String contentResult = "";
        contentResult = contentResult.copyValueOf(exampleCharText7);
        System.out.println(String.format("7 -> %s", contentResult));
        contentResult = contentResult.copyValueOf(exampleCharText7, 0, 5);
        System.out.println(String.format("7 -> %s", contentResult));
        //boolean endsWith(String suffix)
        //Проверяет заканчивается ли эта строка указанным окончанием.
        String exampleText9 = "Привет";
        boolean endsWithResult = exampleText9.endsWith("т");
        System.out.println(String.format("9 -> %b", endsWithResult));
        //boolean equalsIgnoreCase(String anotherString)
        //Сравнивает данную строку с другой строкой, игнорируя регистр букв.
        String exampleText11 = "Привет";
        boolean equalsResult = exampleText11.equalsIgnoreCase("привет");
        System.out.println(String.format("11 -> %b", equalsResult));
        //String intern()
        //Возвращает каноническое представление для строкового объекта.
        boolean compareObjectsStr = new String("Hello").intern() == new String("Hello").intern();
        System.out.println(String.format("20 -> %s", compareObjectsStr));
        compareObjectsStr = new String("Hello") == new String("Hello");
        System.out.println(String.format("20 -> %s", compareObjectsStr));
        //int length()
        //Возвращает длину строки.
        String exampleText25 = "Привет";
        int length = exampleText25.length();
        System.out.println(String.format("25 -> %d", length));
        //String substring(int beginIndex)
        //Возвращает новую строку, которая является подстрокой данной строки.
        String exampleText37 = "Привет";
        String exampleText37Result = exampleText37.substring(1);
        System.out.println(String.format("37 -> %s", exampleText37Result));
        //char[] toCharArray()
        //Преобразует эту строку в новый массив символов.
        String exampleText39 = "Привет";
        char[] charArrayResult = exampleText39.toCharArray();
        System.out.println(charArrayResult);
        //String trim()
        //Возвращает копию строки с пропущенными начальными и конечными пробелами.
        String exampleText45 = " Привет ";
        String exampleText45Result = exampleText45.trim();
        System.out.println(String.format("45 -> |%s|", exampleText45Result));
    }
}