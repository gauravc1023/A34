class Pattern15 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            int value = i;

            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value = value + (n - j);
            }

            System.out.println();
        }
    }
}

/*

1
2 5
3 6 8
4 7 9 10

*/