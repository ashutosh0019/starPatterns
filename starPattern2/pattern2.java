package starPattern2;

public class pattern2 {
    public static void main(String[] args) {
        int n=5;
        printStar(n);
    }
    public static void printStar(int n){
        for (int row=1; row<= n; row++){
            //for every row run the column
            for (int col= 1; col<=n; col++){
                System.out.print("* ");
            }
            //when row is printed, we need to add a new line
            System.out.println();
        }
    }
}
