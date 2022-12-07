import java.util.Arrays;
public class Homework {
    public static void main(String[] args) {
        Homework hw = new Homework();
        Integer[] myUnsortedList = new Integer[]{2, -15, 1, 2, 15, -2};
        System.out.println(Arrays.toString(myUnsortedList));
        hw.quickSort(myUnsortedList, 0, myUnsortedList.length - 1);
        System.out.println(Arrays.toString(myUnsortedList));
    }
    public void quickSort(Integer[] unsortedList, Integer minIndex, Integer maxIndex) {
        if (minIndex >= maxIndex) return;
        Integer pivot = getPivot(unsortedList, minIndex, maxIndex);
        quickSort(unsortedList, minIndex, pivot - 1);
        quickSort(unsortedList, pivot + 1, maxIndex);
    }
    public Integer getPivot(Integer[] unsortedList, Integer minIndex, Integer maxIndex) {
        Integer pivotIndex = minIndex - 1;
        for (int i = minIndex; i <= maxIndex; i++) {
            if (unsortedList[i] < unsortedList[maxIndex]) {
                pivotIndex++;
                swap(unsortedList, pivotIndex, i);
            }
        }
        pivotIndex++;
        swap(unsortedList, pivotIndex, maxIndex);
        return pivotIndex;
    }

    public void swap(Integer[] unsortedList, Integer indexEl1, Integer indexEl2) {
        Integer temp = unsortedList[indexEl1];
        unsortedList[indexEl1] = unsortedList[indexEl2];
        unsortedList[indexEl2] = temp;
    }
}