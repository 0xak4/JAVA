
public class ex4 {
    public static void main(String[] args) {
        int[][] square = {
            {16, 23, 17},
            {78, 32, 21},
            {17, 16, 15}
        };
        
        System.out.println("Is magic square: " + isMagicSquare(square));
    }

    public static boolean isMagicSquare(int[][] square) {
        int sum = 0;
        int diagSum1 = 0, diagSum2 = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[0][i];
            diagSum1 += square[i][i];
            diagSum2 += square[i][square.length - 1 - i];
        }

        if (diagSum1 != sum || diagSum2 != sum) return false;

        for (int i = 0; i < square.length; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < square.length; j++) {
                rowSum += square[i][j];
                colSum += square[j][i];
            }
            if (rowSum != sum || colSum != sum) return false;
        }

        return true;
    }
}
