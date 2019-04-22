import java.util.HashMap;
import java.util.Map;

public class Tennis {

    private int player1Score = 0;
    private int player2Score = 0;

    private Map<Integer, String> lookupScore = new HashMap<>();

    public Tennis() {
        lookupScore.put(0, "Love");
        lookupScore.put(1, "Fifteen");
        lookupScore.put(2, "Thirty");
        lookupScore.put(3, "Forty");
    }

    public String getScore() {
        if(player1Score == 1 && player2Score == 1) {
            return "Fifteen All";
        }
        if(player1Score == 0 && player2Score == 0) {
            return "Love All";
        }
        return lookupScore.get(player1Score) + " " + lookupScore.get(player2Score);
    }

    public void player1AddScore() {
        player1Score++;
    }

    public void player2AddScore() {
        player2Score++;
    }
}
