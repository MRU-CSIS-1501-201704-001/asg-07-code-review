//return the boolean value of matchOver to determine wether the match ends
private boolean matchOver(int playerOneScore, int playerTwoScore){                                          
	boolean matchOver = false;

	if (playerOneScore == MATCH_THRESHOLD){
		matchOver = true;   
	}
	else if(playerTwoScore == MATCH_THRESHOLD){
		matchOver = true;
	}
	return matchOver;
}

//returns the tieWinner based on the values of playerOne and playerTwo
    private int determineTieWinner(int playerOne, int playerTwo){
        int tieWinner = 0;

        if(playerOne > playerTwo){
            tieWinner = 1;
        }
        else{
            tieWinner = 2;
        }
        return tieWinner;   
    }
