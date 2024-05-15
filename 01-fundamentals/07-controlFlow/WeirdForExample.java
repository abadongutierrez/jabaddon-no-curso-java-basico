
void main() {
    for (int i = 0, j = i * 2, x = j * 2; i < 100; i++) {
        System.out.printf("%d, %d, %d\n", i, j, x);
    }
}

int otherMethod(int j, int x) {
    return j/2 + x/2;
}