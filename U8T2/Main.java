package U8T2;

public class Main {
    public static void main(String[] args) {


/* --- PROBLEM 1 --- */
System.out.println("PROBLEM 1:");
int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

System.out.println("---------");
// write code below that uses nested ENHANCED for loops
// to print each element in nums in ROW-MAJOR order again;
// print all the numbers in a row on the same line
// with a space in between
for(int[] row : nums){
    for(int num : row){
       System.out.print(num + " ");
    }
    System.out.println();
}




// now, write code below that uses nested INDEX-BASED for loops
// to print each element in nums in ROW-MAJOR order;
// print all the numbers in a row on the same line
// with a space in between

// write code here

for (int row = 0; row < nums.length; row++){
    for (int col = 0; col < nums[0].length; col++){
      System.out.print(nums[row][col] + " ");
    }
    System.out.println();
  }
  

System.out.println("---------");
// finally, write code below that uses nested for loops
// to print each element in nums in COLUMN-MAJOR order;
// print all the numbers in a COLUMN on the same line
// with a space in between

// write code here

for (int col = 0;col < nums[0].length; col++){
    for (int row = 0; row < nums.length; row++){
      System.out.print(nums[row][col] + " ");
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

for (int animal =0; animal<animals.length;animal++){
    for(int col = 0; col < animals[0].length ; col++){
        animals[animal][col] += "s";
    }
}

// write code here
// next, write code below to print out the 2D
// array in column-major order, showing each
// animal in inside a bracketed "enclosure"
// using "|" (like fences separating animal pens
// in a zoo)

// write code here

for (int col = 0;col < animals[0].length; col++){
    System.out.print("|");
    for (int row = 0; row < animals.length; row++){
      System.out.print(animals[row][col] + "|");
    }
    System.out.println();
  }
  



    }
}
