public class Tennis {

    private int player1Score = 0;
    private int player2Score = 0;

    private static final String[] showScore = {
            "Love", "Fifteen", "Thirty", "Forty"
    };

    private String getAdvancePlayerName() {
        return player1Score - player2Score > 0 ? "Player1" : "Player2";
    }

    private boolean isDeuce() {
        return player1Score >=3 || player2Score >= 3;
    }

    private boolean isGamePoint() {
        return player1Score >=3 && player2Score >= 3;
    }

    private boolean isSame() {
        return player1Score == player2Score;
    }

    private boolean isAdv() {
     return Math.abs(player2Score - player1Score) == 1;
    }

    private String getShowScore() {
        return showScore[player1Score] + " " + showScore[player2Score];
    }

    private String getGamePointScore() {
        return getAdvancePlayerName() + (isAdv() ? " Adv" : "Win");
    }

    public String getScore() {
        if(isSame()) {
            if(isDeuce()) {
                return "Deuce";
            }
            return showScore[player1Score] + " All";
        }
        if(isGamePoint()) {
            return getGamePointScore();
        }
        return getShowScore();
    }

    public void player1AddScore() {
        player1Score++;
    }

    public void player2AddScore() {
        player2Score++;
    }
}
