import org.junit.Assert;
import org.junit.Test;

public class TennisTest {

    private Tennis tennis = new Tennis();

    private void scoreShouldBe(String expected) {
        Assert.assertEquals(tennis.getScore(), expected);
    }

    private void player1AddScoreTimes(int times) {
        for(int i=0; i<times; i++) {
            tennis.player1AddScore();
        }
    }

    private void player2AddScoreTimes(int times) {
        for(int i=0; i<times; i++) {
            tennis.player2AddScore();
        }
    }

    @Test
    public void loveAll() {
        scoreShouldBe("Love All");
    }

    @Test
    public void fifteenLove() {
        player1AddScoreTimes(1);
        scoreShouldBe("Fifteen Love");
    }

    @Test
    public void thirtyLove() {
        player1AddScoreTimes(2);
        scoreShouldBe("Thirty Love");
    }

    @Test
    public void fortyLove() {
        player1AddScoreTimes(3);
        scoreShouldBe("Forty Love");
    }

    @Test
    public void loveFifteen() {
        player2AddScoreTimes(1);
        scoreShouldBe("Love Fifteen");
    }

    @Test
    public void loveThirty() {
        player2AddScoreTimes(2);
        scoreShouldBe("Love Thirty");
    }

    @Test
    public void fifteenAll() {
        player1AddScoreTimes(1);
        player2AddScoreTimes(1);
        scoreShouldBe("Fifteen All");
    }
}
