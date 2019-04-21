import org.junit.Assert;
import org.junit.Test;

public class TennisTest {

    @Test
    public void loveAll() {
        Tennis tennis = new Tennis();
        Assert.assertEquals(tennis.getScore(), "Love All");
    }

    @Test
    public void fifteenLove() {
        Tennis tennis = new Tennis();
        tennis.player1AddScore();
        Assert.assertEquals(tennis.getScore(), "Fifteen Love");
    }
}
