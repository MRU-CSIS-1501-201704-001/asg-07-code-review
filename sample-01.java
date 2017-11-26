/**
     * Ask for an input from the keyboard and check if it is a 1 or a 2, while it is
     * not, prints an error message and reask for an input
     * 
     * @return whichPlayer An int contains either a 1 or a 2 depending on the input
     *         from the keyboard
     */
    private int validPlayer() {
        String input = keyboard.next();

        while (!input.equals("1") && !input.equals("2")) {
            System.out.format("Invalid player # entered: %s%n", input);
            input = keyboard.next();
        }

        int selectedPlayer = Integer.parseInt(input);
        return selectedPlayer;
    }
