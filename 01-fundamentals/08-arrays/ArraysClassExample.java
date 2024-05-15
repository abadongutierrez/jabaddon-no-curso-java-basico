import java.util.Arrays;
import java.util.Random;

void main() {
    int intArray[] = new int[1000];
    Arrays.fill(intArray, 1);
    printIntArray(intArray);
    final Random random = new Random();
    Arrays.setAll(intArray, (_) -> random.nextInt());
    printIntArray(intArray);

    int intArray01[] = new int[]{8, 4, 2, 1, 10, 9, 3, 6, 5, 7};
    Arrays.sort(intArray01);
    printIntArray(intArray01);

    int itemsToFind[] = new int[]{3, 8, 10, 11};
    for (int value: itemsToFind) {
        System.out.printf(
            "The value %d was found at index = %d\n",
            value, Arrays.binarySearch(intArray01, value));
    }
}

void printIntArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
        System.out.printf("array[%d] = %d\n", i, array[i]);
    }
}