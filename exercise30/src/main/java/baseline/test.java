package baseline;

public class test {
    //Method for unit testing. The code is based on the multiplicationTable method
    public static int multiplicationTableTest(int i, int j) {
        //used an array to know the value when multiplying 2 numbers between 1-12 inclusive
        int[][] multiply = new int[13][13];
        //the outer loop will loop from 1 to 12
        for (int a = 1; a <= i; a++) {
            //inner loop will also loop up to 12
            for (int b = 1; b <= j; b++) {
                //multiply i*j
                multiply[a][b] = a*b;
            }
        }
        return multiply[i][j];
    }
}
