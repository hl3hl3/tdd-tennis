import org.junit.Assert;
import org.junit.Test;

public class TennisTest {

    Tennis tennis = new Tennis();

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

    private void scoreShouldbe(String expected) {
        Assert.assertEquals(tennis.getScore(), expected);
    }

    @Test
    public void loveAll() {
        scoreShouldbe("Love All");
    }

    @Test
    public void fifteenLove() {
        player1AddScoreTimes(1);
        scoreShouldbe("Fifteen Love");
    }

    @Test
    public void thirtyLove() {
        player1AddScoreTimes(2);
        scoreShouldbe("Thirty Love");
    }

    @Test
    public void fortyLove() {
        player1AddScoreTimes(3);
        scoreShouldbe("Forty Love");
    }

    @Test
    public void loveFifteen() {
        player2AddScoreTimes(1);
        scoreShouldbe("Love Fifteen");
    }

    @Test
    public void loveThirty() {
        player2AddScoreTimes(2);
        scoreShouldbe("Love Thirty");
    }

    @Test
    public void fifteenAll() {
        player1AddScoreTimes(1);
        player2AddScoreTimes(1);
        scoreShouldbe("Fifteen All");
    }

    @Test
    public void thirtyAll() {
        player1AddScoreTimes(2);
        player2AddScoreTimes(2);
        scoreShouldbe("Thirty All");
    }

    @Test
    public void deuce() {
        player1AddScoreTimes(3);
        player2AddScoreTimes(3);
        scoreShouldbe("Deuce");
    }

    @Test
    public void player1Adv() {
        player1AddScoreTimes(3);
        player2AddScoreTimes(3);
        player1AddScoreTimes(1);
        scoreShouldbe("Player1 Adv");
    }

    @Test
    public void player2Adv() {
        player1AddScoreTimes(3);
        player2AddScoreTimes(3);
        player2AddScoreTimes(1);
        scoreShouldbe("Player2 Adv");
    }

    @Test
    public void player1Win() {
        player1AddScoreTimes(3);
        player2AddScoreTimes(3);
        player1AddScoreTimes(2);
        scoreShouldbe("Player1 Win");
    }

    @Test
    public void player2Win() {
        player1AddScoreTimes(3);
        player2AddScoreTimes(3);
        player2AddScoreTimes(2);
        scoreShouldbe("Player2 Win");
    }
}
