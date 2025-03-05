public class runner {
    public static void main(String[] args) {     
        /* --- PROBLEM 1 --- */
        System.out.println("PROBLEM 1:");
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

        System.out.println("---------");
        // write code below that uses nested ENHANCED for loops
        // to print each element in nums in ROW-MAJOR order again;
        // print all the numbers in a row on the same line
        // with a space in between
        // write code here
        for (int[] row : nums) {
            for (int element : row) {
                System.out.print(element+" ");
            }
            System.out.println();
        }

        // now, write code below that uses nested INDEX-BASED for loops
        // to print each element in nums in ROW-MAJOR order;
        // print all the numbers in a row on the same line
        // with a space in between
        // write code here
        for (int i=0; i<nums.length; i++) {
            for (int x=0; x<nums[i].length; x++) {
                System.out.print(nums[i][x] + " ");
            }
            System.out.println();
        }

        System.out.println("---------");
        // finally, write code below that uses nested for loops
        // to print each element in nums in COLUMN-MAJOR order;
        // print all the numbers in a COLUMN on the same line
        // with a space in between
        // write code here
        for (int i=0; i<nums[0].length; i++) {
            for (int x=0; x<nums.length; x++) {
                System.out.print(nums[x][i] + " ");
            }
            System.out.println();
        }


        /* --- PROBLEM 2 --- */
        System.out.println("---------");
        System.out.println("PROBLEM 2:");

        String[][] animals = {
            {"anteater", "bird"},
            {"camel", "dog"},
            {"elephant", "giraffe"},
            {"hyena", "jackal"}
        };
        // write code below using a nested loop to update each element
        // in animals to its plural form, e.g. bird --> birds;
        // (no printing yet)
        // write code here
        for (int i=0; i<animals.length; i++) {
            for (int x=0; x<animals[0].length; x++) {
                animals[i][x] = animals[i][x] + "s";
            }
        }


        // next, write code below to print out the 2D
        // array in column-major order, showing each
        // animal in inside a bracketed "enclosure"
        // using "|" (like fences separating animal pens
        // in a zoo)
        // write code here
        for (int i=0; i<animals[0].length; i++) {
            System.out.print("|");
            for (int x=0; x<animals.length; x++) {
                System.out.print(animals[x][i]+"|");
            }
            System.out.println();
        }




    }
}