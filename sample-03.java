 /**
     * Tests if the input provided is a 1 or 2, and if the test fails, it prints an error message until the test passes. 
     * 
     * @return either a 1 or 2 based on what player score was entered. 
     */
    private int validPlayerNumber() { 
        boolean isPlayer = false; 
        int playerScored = 0;
        do {
            if (!in.hasNextInt()) { 
                System.out.println("Invalid player # entered: " + in.next()); 
            }
            else {
                int playerNumber = in.nextInt();
                if (playerNumber == PLAYER_ONE) { 
                    isPlayer = true; 
                    playerScored = PLAYER_ONE;
                }
                else { 
                    if (playerNumber == PLAYER_TWO) { 
                        isPlayer = true; 
                        playerScored = PLAYER_TWO;
                    }
                    else { 
                        System.out.println("Invalid player # entered: " + playerNumber); 
                    }
                }
            } 
        } while (!isPlayer);
        return playerScored;
    }