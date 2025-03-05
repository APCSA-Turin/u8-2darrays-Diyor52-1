public class FunWith2DArrays {
    public static int totalElements(int[][] numArray) {
        int numRows = numArray.length;
        int numColumns = numArray[0].length;
        return numRows * numColumns;
    }
    public static void fourCorners(String[][] strArray) {
        int numRows = strArray.length;
        int numColumns = strArray[0].length;
    
        System.out.println(strArray[0][0]);
        System.out.println(strArray[0][numColumns - 1]);
        System.out.println(strArray[numRows - 1][0]);
        System.out.println(strArray[numRows - 1][numColumns - 1]);
    }
    public static void swapFrontAndBackRows(String[][] strArray) {
        String[] firstRow = strArray[0];
        int numRows = strArray.length;
        String[] lastRow = strArray[numRows - 1];
        strArray[0] = lastRow;
        strArray[numRows - 1] = firstRow;
    }

    public static double average(int[][] numArray){
        int sum = 0;
        int count =0;
        for(int[] row : numArray){
            for(int num : row){
               sum += num;
               count++;
            }
        }
        return (double)sum/count; 
        
    }
    public static int edgeSum(int [][] numArray){
        int sum =0; 
        int[] firstrow = numArray[0];
        for(int element : firstrow){
            sum += element;
        }

        int[]lastRow = numArray[numArray.length-1];
        for(int element : lastRow){
            sum += element;
        }

        for(int i = 1; i<numArray.length-1;i++){
            sum+= numArray[i][0];
            sum += numArray[i][numArray[0].length-1];
        }
        return sum; 
    }

    public static int[] indexFound(String[][] wordArray, String target){
        int[] indexFound = new int[2];
        for (int row = 0; row < wordArray.length; row++){
            for (int col = 0; col < wordArray[0].length; col++){
                if(wordArray[row][col].equals(target)){
                    indexFound[0] = row;
                    indexFound[1] = col;
                    return indexFound;
                }
            }
          }
          indexFound[0] = -1;
        indexFound[1] = -1;
        return indexFound;
    }
        
    public static int[][] split(int[][] numArray, int row, int col){
        if(row >=numArray.length||col>=numArray[0].length){
            int[][]array = new int[0][0];
            return array;
        }
        int [][]newArray = new int [row+1][col+1];
        for(int i =0; i<=row;i++){
            for(int x =0; x<=col;x++){
                newArray[i][x] = numArray[row][col];
            }
        }
        return newArray;
    }

    public static int[][]invert(int [][]numArray){
        int Numcolumn = numArray[0].length;
        int Numrow = numArray.length; 
        int[][]newArray = new int[Numcolumn][Numrow];
       for(int row =0; row<numArray.length;row++){
        for(int column =0; column <numArray[0].length;column++){
            int number = numArray[row][column];
            newArray[column][row] = number; 
        }
       }
       return newArray;
    }
}
