public class Question2 {
    public static void main(String[] args) {
        //a
        int[][] arr1 = {
            {0,0,0},
            {0,0,0}
        };
        for (int[] row : arr1) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        String[][] arr2 = {
            {"null", "null"},
            {"null", "null"},
            {"null", "null"},
            {"null", "null"}
        };
        for (String[] row : arr2) {
            for (String str : row) {
                System.out.print(str + " ");
            }
            System.out.println();
        }

        //b
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;
        for (int[] row : arr1) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        //c
        arr2[0][0] = "a";
        arr2[0][1] = "b";
        arr2[1][0] = "c";
        arr2[1][1] = "d";
        arr2[2][0] = "e";
        arr2[2][1] = "f";
        arr2[3][0] = "g";
        arr2[3][1] = "h";
        for (String[] row : arr2) {
            for (String str : row) {
                System.out.print(str + " ");
            }
            System.out.println();
        }

    }
}