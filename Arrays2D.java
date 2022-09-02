package com.javaCodePractice;

public class Arrays2D {
    static void print2dArray(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void sumOf2dArray(int[][] arr) {
        int sum = 0;
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);
    }

    static void reverseOf2dArray(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[] searchElement(int[][] arr, int element) {

        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == element) {
                    int[] ans = {i, j};
                    return ans;
                }
            }

        }
        int[] ans = {-1, -1};
        return ans;
    }

    static boolean identicalArrays(int[][] arr1, int[][] arr2) {
        boolean identical = true;
        int rows1 = arr1.length;
        int cols1 = arr1[0].length;
        int rows2 = arr2.length;
        int cols2 = arr2[0].length;

        if (rows1 != rows2 || cols1 != cols2) {
            identical = false;
            return identical;
        } else {

            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    if (arr1[i][j] != arr2[i][j]) {
                        identical = false;
                        return identical;
                    }
                }

            }
        }
        return identical;
    }

    static boolean checkSumOfEachRowsEqual(int[][] arr) {
        boolean identical = true;
        int rows = arr.length;
        int cols = arr[0].length;
        int[] sums = new int[rows];
        int sum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }
            sums[i] = sum;
            sum = 0;
        }

        return identical;
    }

    static void printWaveRowWiseOfMatrix(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int [][] brr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
    static void printWaveColumnWiseOfMatrix(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int [][] brr = new int[rows][cols];
        for (int i = 0; i < cols; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < rows; j++) {
                    System.out.print(arr[j][i] + " ");
                }
            } else {
                for (int j = rows - 1; j >= 0; j--) {
                    System.out.print(arr[j][i] + " ");
                }
            }
            System.out.println();
        }
    }

    static void sumOfIndices(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }
    }

    static void differanceOfIndices(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(i - j + " ");
            }
            System.out.println();
        }
    }

    static void mainDiagonalElements(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        if (rows == cols) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (i == j) {
                        System.out.print(arr[i][j] + " ");
                    }
                }
            }
        } else {
            System.out.println("Not a square matrix(Rows!=Columns)");
        }
    }

    static void mainDiagonalElementsOptimized(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int i = 0;
        if (rows == cols) {
            while (i < rows) {
                System.out.print(arr[i][i] + " ");
                i++;
            }
        } else {
            System.out.println("Not a square matrix(Rows!=Columns)");
        }
    }

    static void counterDiagonalElements(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        if (rows == cols) {
            for (int i = 0; i < rows; i++) {
                for (int j = cols - 1 - i; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                    break;
                }
            }
        } else {
            System.out.println("Not a square matrix(Rows!=Columns)");
        }
    }

    static void counterDiagonalElementsOptimized(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int i = 0;
        int j = cols - 1;
        if (rows == cols) {
            while (i < rows & j >= 0) {
                System.out.print(arr[i++][j--] + " ");
                // // OR replace j-- with n-i-1
            }
        } else {
            System.out.println("Not a square matrix(Rows!=Columns)");
        }
    }

    static boolean isIdentityMatrix(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        if (rows != cols) {
            return false;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j) {
                    if (arr[i][j] != 1) {
                        return false;
                    }
                } else {
                    if (arr[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }//1 0 0 0 1 0 0 0 1

    static boolean isSumOfDiagonalsEqual(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int sum1 = 0;
        int sum2 = 0;

        if (rows != cols) {
            return false;
        }
        int i = 0;
        while (i < rows) {
            sum1 += arr[i][i];
            sum2 += arr[i][rows - i - 1];
            i++;
        }
        return sum1 == sum2;
    }

    static void transposeOfMatrix(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }//1 2 3 4 5 6 7 8 9

    static boolean isSymmetric(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] trans = new int[rows][cols];

        if (rows != cols) {
            return false;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[i][j] = arr[j][i];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (trans[i][j] != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    static int [][] rotateMatrix90DegreeClockwise(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] trans = new int[rows][cols];
        int[][] rotated = new int[rows][cols];

        if (rows != cols) {
            System.out.println("Rows not equal to columns!");
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[i][j] = arr[j][i];          // 02  01  00
            }                                   // 21  11  01
            // 22  12  02
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotated[i][j] = trans[i][cols - j - 1];
            }
        }
        return rotated;
    }

    static void multiply2Matrix(int[][] arr, int[][] brr) {
        int rows1 = arr.length;
        int cols1 = arr[0].length;
        int rows2 = brr.length;
        int cols2 = brr[0].length;
        int[][] product = new int[rows1][cols2];

        if (cols1 != rows2) {
            System.out.println("-1");
        }else {
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    int x = 0;
                    for (int k = 0; k < cols1; k++) {
                        x = x + (arr[i][k] * brr[k][j]);
                    }
                    product[i][j] = x;
                }
            }
            print2dArray(product);
        }
    }

    static void sumOfDiagonalElements(int [][]arr, int rows){
        int sum =0;
        int j = rows-1;
        for (int i = 0; i < rows; i++) {
            if(rows%2==0){
                sum+=arr[i][i];
                sum+=arr[i][j];
                j--;
            }else{
                sum+=arr[i][i];
                if(i!=rows/2){
                    sum+=arr[i][j];
                }
                j--;
            }
        }
        System.out.println(sum);
    }

    static void convert1dArrayTo2d(int size,int []arr, int rows,int cols){
        int [][] brr = new int [rows][cols];
        int k =0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                brr[i][j]=arr[k];
                k++;
            }
        }
        print2dArray(brr);
    }

    static boolean checkPalindrome(int size,int []arr){
        for (int i = 0; i <= size/2; i++) {
            if(arr[i]!=arr[size-i-1]){
                return false;
            }
        }
        return true;
    }
    static void countAllPalindromicRows(int rows,int cols,int [][]arr){
        int count =0;
        for (int i = 0; i < rows; i++) {
            if(checkPalindrome(cols,arr[i])){
               count++;
            }
        }
        System.out.println(count);
    }
    static void waveRowMatrix(int [][]arr){
        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 1; i < rows; i+=2) {
            for (int j = 0; j < cols; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][cols-j-1];
                arr[i][cols-j-1]= temp;
            }
        }
        print2dArray(arr);
    }
        public static void main (String[]args){
//            Scanner sc = new Scanner(System.in);
//            int rows1 = sc.nextInt();
//            int cols1 = sc.nextInt();
//            int[][] arr1 = new int[rows1][cols1];
//            for (int i = 0; i < rows1; i++) {
//                for (int j = 0; j < cols1; j++) {
//                    arr1[i][j] = sc.nextInt();
//                }
//            }
//        int rows2 = sc.nextInt();
//        int cols2 = sc.nextInt();
//        int[][] arr2 = new int[rows2][cols2];
//        for (int i = 0; i < rows2; i++) {
//            for (int j = 0; j < cols2; j++) {
//                arr2[i][j]= sc.nextInt();
//            }
//        }


            int [][]arr = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9},
                    {10,11,12}

            };
            int [][]brr = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9},
            };
            printWaveColumnWiseOfMatrix(arr);
        }
    }
