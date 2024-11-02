package basic.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArrayChallengeTest {

    private ArrayChallenge arrayChallenge;

    @BeforeEach
     void setUp() {
        arrayChallenge = new ArrayChallenge();
    }

    @Test
    void should_returnLargestNumber_when_array_of_numbers() {
        // Act
        Integer thirdLargestNumber = arrayChallenge.findThirdLargestNumber(new int[]{2, 4, 1, 3, 5});
        // Assert
        Assertions.assertEquals(3, thirdLargestNumber);
    }

    @Test
    void should_NotReturnLargestNumber_when_there_are_less_than_3_elements() {
        // Act
        Integer thirdLargestNumber = arrayChallenge.findThirdLargestNumber(new int[]{10, 2});
        // Assert
        Assertions.assertEquals(-1, thirdLargestNumber);
    }

    @Test
    void should_NotReturnLargestNumber_when_there_are_similar_elements() {
        // Act
        Integer thirdLargestNumber = arrayChallenge.findThirdLargestNumber(new int[]{5, 5, 5});
        // Assert
        Assertions.assertEquals(-1, thirdLargestNumber);
    }
}
