package com.google.hangout.Database;

public class DaoPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PlayerDAO playerDAO = new PlayerDAOImpl();
        
        
        
        for (Player player: playerDAO.getAllPlayers()){
            System.out.println(player.toString());
        }

    }

}