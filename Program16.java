public class Program16 {

        public static void main(String[] args)
        {
            int a = 10;
            int b = 20;
            while (b!=0)
            {
                int borrow = (~a) & b;
                a=a^b;
                b=borrow<<1;
            }
            System.out.println("sub of two no. is  " +a);
        }

}
