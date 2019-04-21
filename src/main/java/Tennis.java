public class Tennis {

    private int player1Score = 0;

    public String getScore() {
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
}
