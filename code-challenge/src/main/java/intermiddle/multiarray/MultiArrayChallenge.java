package intermiddle.multiarray;

public class MultiArrayChallenge {


    public int [] [] getSpiral(int number) {
        int counterValue = 1;
        int initial = -1;
        int [][] spiral = new int[number][number];
        iterationGeneral(--number, counterValue, spiral, ++initial);
        return spiral;
    }

    private static void iterationGeneral(int number, int counterValue, int[][] spiral, int initial) {
        if (number == 0) {
            return;
        }
        int initialPlusOne = initial + 1;
        int numberLessOne = number - 1;
        counterValue = firstIteration(number, spiral, counterValue, initial);
        counterValue = secondIteration(number, spiral, counterValue, initialPlusOne);
        counterValue = thirdIteration(number, spiral, counterValue, initial);
        counterValue = fourthIteration(numberLessOne, spiral, counterValue, initial);
        iterationGeneral(--number, counterValue, spiral, ++initial);
    }

    private static int firstIteration(int number, int[][] spiral, int counterValue, int initial) {
        int row = initial;
        while (initial < number + 1) {
            spiral[row][initial] = counterValue;
            counterValue++;
            initial++;
        }
        return counterValue;
    }

    private static int secondIteration(int number, int[][] spiral, int counterValue, int initial) {
        while (initial < number + 1) {
            spiral[initial][number] = counterValue;
            counterValue++;
            initial++;

        }
        return counterValue;
    }

    private static int thirdIteration(int number, int[][] spiral, int counterValue, int init) {
        int row = number;
        while(number > init) {
            spiral[row][number - 1] = counterValue;
            counterValue++;
            number--;
        }
        return counterValue;
    }

    private static int fourthIteration(int number, int[][] spiral, int counterValue, int initial) {
        while (number > initial) {
            spiral[number][initial] = counterValue;
            counterValue++;
            number--;
        }
        return counterValue;
    }
}
