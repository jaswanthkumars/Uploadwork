import java.util.Scanner;

public class Program4 {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int row=sc.nextInt();
            for(int i=0;i<=row;i++)
            {
                for(int j=0;j<=row;j++)
                {
                    if(j!=i)
                    {
                        System.out.print(0);
                    }
                    else{
                        System.out.print(i);
                    }
                }
                System.out.println(" ");
            }
        }
    }


