public class Tennis {

    private int player1Score = 0;
    private int player2Score = 0;

    public String getScore() {
        if(player2Score == 1) {
            return "Love Fifteen";
        }
        if(player1Score == 3) {
            return "Forty Love";
        }
        if(player1Score == 2) {
            return "Thirty Love";
        }
        if(player1Score == 1) {
            return "Fifteen Love";
        }
        return "Love All";
    }

    public void player1AddScore() {
        player1Score++;
    }

    public void player2AddScore() {
        player2Score++;
    }
}
