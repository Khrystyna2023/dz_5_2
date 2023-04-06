import java.util.Scanner;
public class MathOperation {
        public int a;
        public int b;
        public int c;
        public int d;
        public int sum1 = 0;
        public int sum2 = 0;
        public void Display1() {
            Scanner UserInput = new Scanner(System.in);
            System.out.println("Please enter 4 integer number: \n");
            if (UserInput.hasNextInt()) {
                MathOperation.this.a = UserInput.nextInt();
                System.out.println("a = " + MathOperation.this.a);
                MathOperation.this.b = UserInput.nextInt();
                System.out.println("b = " + MathOperation.this.b);
                MathOperation.this.c = UserInput.nextInt();
                System.out.println("c = " + MathOperation.this.c);
                MathOperation.this.d = UserInput.nextInt();
                System.out.println("d = " + MathOperation.this.d);
            }
            else {
                System.out.println("Input incorrect number:");
            }
            System.out.println("-------------------------------");

            sum1 = MathOperation.this.a + MathOperation.this.b;
            System.out.println("Add a+b =: " + sum1);
            sum2 = MathOperation.this.c + MathOperation.this.d;
            System.out.println("Add b+d =: " + sum2);

            boolean sum_res1 = (sum1 >= sum2); //? true : false;
            System.out.println("The first sum1 more than sum2: " + sum_res1);

            sum1 += 1;
            System.out.println("Sum1 was increased by 1: " + sum1);

            sum2 -= 2;
            System.out.println("Sum2 was reduced by 2: " + sum2);

            boolean sum_res2 = sum1 >= sum2;
            System.out.println("The first sum1 more than sum2:" + sum_res2);

            //boolean result3 = (sum1 % 2 == 0 || sum2 % 2 == 0) ? true : false;
            boolean result3 = (sum1 % 2 == 0 || sum2 % 2 == 0);
            System.out.println("The sum is a multiple of 2: " + result3);



        }
}
