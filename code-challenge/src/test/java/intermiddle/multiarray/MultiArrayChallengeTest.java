package intermiddle.multiarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiArrayChallengeTest {

    private MultiArrayChallenge multiArrayChallenge;

    @BeforeEach
    void setUp() {
        multiArrayChallenge = new MultiArrayChallenge();
    }

    @Test
    void should_return_spiral() {
        // Act
        int[][] spiral = multiArrayChallenge.getSpiral(6);
        // Assert
        Assertions.assertNotNull(spiral);

    }
}
