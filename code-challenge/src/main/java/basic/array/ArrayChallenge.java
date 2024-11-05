package basic.array;

public class ArrayChallenge {

    public int findThirdLargestNumber(int[] numbers) {
        int temp, index, after;
        for (int j = 0; j < 3; j ++) {
            for (int i = j; i < numbers.length - 1; i++) {
                after = numbers[i + 1];
                index = numbers[j];
                temp = index;
                if (index < after) {
                    numbers[j] = after;
                    numbers[i + 1] = temp;
                }
            }
        }
        if (numbers.length > 2 && (numbers[2] != numbers[1])) {
            return numbers[2];
        }
        return -1;
    }

    private static int getThirdNumber(int[] numbers) {
        if (numbers.length > 2 && (numbers[2] != numbers[1])) {
            return numbers[2];
        }
        return -1;
    }
}
