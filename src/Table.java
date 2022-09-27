import java.util.Arrays;
public class Table {
    public static void main(String[] args) {
        int[] table = {5, 3, 1, 2, 4};

        System.out.println("Table before sorting " + Arrays.toString(table));

        sorting1(table);

        System.out.println("Table after sorting (ascending)" + Arrays.toString(table));

        sorting2(table);

        System.out.println("Table after sorting (descending)" + Arrays.toString(table));

    }

    static void sorting1(int[] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = i + 1; j < table.length; j++) {
                int value1 = table[i];
                int value2 = table[j];

                if (value1 > value2) {
                    table[i] = value2;
                    table[j] = value1;
                }
            }
        }
    }
    static void sorting2(int[] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = i + 1; j < table.length; j++) {
                int value1 = table[i];
                int value2 = table[j];

                if (value1 < value2) {
                    table[i] = value2;
                    table[j] = value1;
                }
            }
        }
    }
}

