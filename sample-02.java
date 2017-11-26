/**
     * Takes valid user inputs (g,o,s,m) that specify the way game will be scored.
     * Calls GameType method to score the type chosen.
     */
    public void run()
    {
        // Run Variables
        String gameOption;
        //Input from user
        System.out.print("Would you like to score a (g)ame, (o)vertime game, (s)et or (m)atch; ");
        gameOption = kbd.next();
        gameType(gameOption);
    }

    /**
     * Takes user input from run() method and scores the type chosen.
     * Prints a "Error" message if incorect user input is entered.
     * 
     * @param gameType User input from run() that decides what to score.
     */
    private void gameType(String gameType) {
        if (gameType.equalsIgnoreCase("g")) {
            scoreGame();
        } else if (gameType.equalsIgnoreCase("o")) {
            scoreOvertime();
        } else if (gameType.equalsIgnoreCase("s")) {
            scoreSet();
        } else if (gameType.equalsIgnoreCase("m")) {
            scoreMatch();
        } else {
            System.out.println("Error");
        }
    }