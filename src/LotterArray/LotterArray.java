package LotterArray;

public class LotterArray {
    public static void main(String args[])
    {
        final int NMAX = 10;
        int [][] odds = new int [NMAX + 1][];
        for (int n = 0 ;n <= NMAX; n ++)
        {
            odds[n] = new int[n + 1];

        }

        for (int n = 0 ;n < odds.length; n ++)
        {
            for (int k = 0 ; k < odds[n].length;k ++)
            {
                int lotterOdds = 1;
                for (int i = 1;i <= k;i ++)
                {
                    lotterOdds = lotterOdds * (n-i+1)/i;

                }
                odds[n][k] = lotterOdds;
            }
        }
        for (int [] row : odds)
        {
            for (int odd : row)
            System.out.printf("%4d",odd);
        System.out.println();
        }
    }
}
