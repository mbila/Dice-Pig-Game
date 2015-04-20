public class Roll {

    int dice1;
    int player1Score;
    int player2Score;
    final int WINNING_SCORE = 100;

    public void main(String[] args) {
        welcome();
    }

    public void welcome() {
        System.out.println("Welcome. Roll a die to begin.");
    }

    public void roll(int playerNum) {
        System.out.println("Rolling for player " + playerNum);
        dice1 = (int)(Math.random() * 6 + 1);
        discoverPlayer(playerNum);
    }

    public void discoverPlayer(int playerNum) {
        if (playerNum == 1) {
            //arbitrary choices inserted
            editPlayer1(1, 1);
        } else {
            //arbitrary choices inserted
            editPlayer2(1, 2);
        }
    }

    public void editPlayer1(int choice, int playerNum) {
        System.out.println("Your roll was a " + dice1 + ". Would you like to roll again (1) or hold (2)?");
        if (choice == 1) {
            player1Score = player1Score + dice1;
            if (player1Score > WINNING_SCORE) {
                winMenu(playerNum);
            } else {
                roll(playerNum);
            }
        } else {
            System.out.println("You are holding with a score of " + player1Score);
            System.out.println("Player 2 will now roll,");
            roll(2);
        }
    }

    public void editPlayer2(int choice, int playerNum) {
        System.out.println("Player " + playerNum + "'s roll was a " + dice1 + ". Would you like to roll again (1) or hold (2)?");
        if (choice == 1) {
            player2Score = player2Score + dice1;
            if (player2Score > WINNING_SCORE) {
                winMenu(playerNum);
            } else {
                roll(playerNum);
            }
        } else {
            System.out.println("You are holding with a score of " + player2Score);
            System.out.println("Player 1 will now roll,");
            roll(1);
        }
    }

    public void winMenu(int playerNum) {
        System.out.println("Player " + playerNum + "wins!!");
    }
}
