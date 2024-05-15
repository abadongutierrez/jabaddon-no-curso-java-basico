import java.util.Random;


void main() {

    int myArray[];
    int[] myOtherArray;
    
    // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
    int myArrayWithSize[] = new int[10];
    System.out.println(myArrayWithSize);

    for (int i = 0; i < myArrayWithSize.length; i++) {
        System.out.println(myArrayWithSize[i]);
    }

    System.out.println("--------------------------------------------------");
    int myArray01[] = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    for (int i = 0; i < myArray01.length; i++) {
        System.out.println(myArray01[i]);
    }

    System.out.println("--------------------------------------------------");
    int myArray02[] = new int[1000];

    final Random random = new Random();
    for (int i = 0; i < myArray02.length; i++) {
        myArray02[i] = random.nextInt();
    }

    for (int i = 0; i < myArray02.length; i++) {
        System.out.printf("myArray02[%d] = %d\n", i, myArray02[i]);
    }
}