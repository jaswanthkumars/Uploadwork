public class LogicalPro10 {
    public static void main(String[] args) {
        int row=5;
        int space=2;
        int star=1;
        for(int i=1;i<=row;i++){
            for (int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for (int k=1;k<=star;k++){
                System.out.print("* ");
            }
            System.out.println();
            if (i<=row/2){
                star+=2;
                space--;

            }
            else{
                star-=2;
                space++;
            }


        }
    }
}
