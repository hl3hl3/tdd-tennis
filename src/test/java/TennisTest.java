import org.junit.Assert;
import org.junit.Test;

public class TennisTest {

    private Tennis tennis = new Tennis();

    @Test
    public void loveAll() {
        Assert.assertEquals(tennis.getScore(), "Love All");
    }

    @Test
    public void fifteenLove() {
        tennis.player1AddScore();
        Assert.assertEquals(tennis.getScore(), "Fifteen Love");
    }

    @Test
    public void thirtyLove() {
        tennis.player1AddScore();
        tennis.player1AddScore();
        Assert.assertEquals(tennis.getScore(),"Thirty Love");
    }
}
