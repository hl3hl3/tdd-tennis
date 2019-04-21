import org.junit.Assert;
import org.junit.Test;

public class TennisTest {

    @Test
    public void loveAll() {
        Tennis tennis = new Tennis();
        Assert.assertEquals(tennis.getScore(), "Love All");
    }
}
