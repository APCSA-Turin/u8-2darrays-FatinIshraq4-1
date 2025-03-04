public class FunWith2DArrays {

    public static int totalElements(int[][] x) {
        int rows = x.length;
        int columns = x[0].length;
        return rows*columns;
    }

    public static void fourCorners(String[][] s) {
        int rows=s.length;
        int columns=s[0].length;
        System.out.println(s[0][0]);
        System.out.println(s[0][columns-1]);
        System.out.println(s[rows-1][0]);
        System.out.println(s[rows-1][columns-1]);
    }

    public static void swapFrontAndBackRows(String[][] s) {
        String[] firstRow = s[0];
        String[] lastRow = s[s.length-1];
        s[0]=lastRow;
        s[s.length-1]=firstRow;
    }

}
