public class run {
    public static void main(String[] args) {
        //a
        String[][] names = {
            {"Abby", "Don", "George", "Kim"},
            {"Brian", "Elenor", "Harry", "Lenny"},
            {"Cathy", "Fred", "Jill", "Matt"}
        };
        for (String[] row : names) {
            for (String str : row) {
                System.out.print(str + " ");
            }
            System.out.println();
        }

        //b
        names[1][2] = "Paul";
        for (String[] row : names) {
            for (String str : row) {
                System.out.print(str + " ");
            }
            System.out.println();
        }

        //c
        String temp = names[0][0];
        names[0][0] = names[2][3];
        names[2][3] = temp;
        for (String[] row : names) {
            for (String str : row) {
                System.out.print(str + " ");
            }
            System.out.println();
        }

        //d
        String[] temp2 = names[0];
        names[0]=names[1];
        names[1]=temp2;
        for (String[] row : names) {
            for (String str : row) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}