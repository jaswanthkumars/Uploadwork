public class LogicalPro8 {
    public static void main(String[] args) {
        int star=1;
        int row=7;
        for (int i=1;i<=row;i++){

            for (int k=1;k<=star;k++){
                System.out.print("* ");
            }
            System.out.println();
            if (i<=row/2){
                star++;
            }
            else{
                star--;
            }
        }
    }
}
