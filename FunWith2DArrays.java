import java.util.Arrays;

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

    //U8T2
    public static double average(int[][] nums) {
        double average = 0;
        int count=0;
        for (int[] row : nums) {
            for (int element : row) {
                count++;
                average+=element;
            }
        }
        return average/count;
    }

    public static int edgeSum(int[][] nums) {
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            for (int x=0; x<nums[0].length; x++) {
                if (x==0 || x==nums[0].length-1 || i==0 || i==nums.length-1) {sum+=nums[i][x];}
            }
        }
        return sum;
    }

    public static int[] indexFound(String[][] str, String target) {
        int[] index = new int[2];
        index[0]=-1;
        index[1]=-1;
        for (int i=0; i<str[0].length; i++) {
            for (int x=0; x<str.length; x++) {
                if (str[x][i].equals(target)) {
                    index[0]=x;
                    index[1]=i;
                    return index;
                }
            }
        }
        return index;
    }

    public static int[][] split(int[][] nums, int row, int column) {
        int[][] ans = new int[row+1][column+1];
        if (row>=nums.length || column>=nums[0].length) {return new int[0][0];}
        for (int i=0; i<=row; i++) {
            for (int x=0; x<=column; x++) {
                ans[i][x]=nums[i][x];
            }
        }
        return ans;
    }

    public static int[][] invert(int[][] nums) {
        int[][] ans = new int[nums[0].length][nums.length];
        for (int i=0; i<nums.length; i++) {
            for (int x=0; x<nums[0].length; x++) {
                int num =nums [i][x];
                ans[x][i]=num;
            }
        }
        return ans;
    }

   
}




