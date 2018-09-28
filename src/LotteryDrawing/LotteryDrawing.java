package LotteryDrawing;

import java.util.*;
public class LotteryDrawing {
    public static void main(String args[])
    {
//        double [][] banlances;
//        banlances = new double[N][N];
        int [][] magicSquare =
                {
                        {16,3,2,13},
                        {3,56,78,9},
                        {45,67,54,90},
                        {98,23,12,34}
                };
        System.out.println(Arrays.deepToString(magicSquare));
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers do you need to draw ?");
        int k = in.nextInt();

        System.out.print("what is the highest number you can draw ?");
        int n = in.nextInt();
        int [] numbers = new int [n];
        for (int i = 0 ;i < numbers.length;i ++)
        {
            numbers[i] = i + 1 ;
        }
        int [] result = new int[k];
        for (int i = 0 ;i < result.length;i++)
        {
            int r = (int)(Math.random()*n);
            result[i] = numbers[r];
            numbers[r] = numbers[n-1];
            n--;
        }
        Arrays.sort(result);
        System.out.println("get the following combination.It'll make you rich !");
        for (int r : result)
            System.out.println(r);
    }
}