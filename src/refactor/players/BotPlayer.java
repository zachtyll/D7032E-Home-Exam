package refactor.players;

public class BotPlayer implements Player {
    private String playerID;
    private String playerType;

    public void setplayerID(String playerID) {
        this.playerID = playerID;
    }
     
    public void setplayerType(String playerType) {
        this.playerType = playerType;
    }

    @Override
    public String getPlayerID() {
        return playerID;
    }

    @Override
    public String getTypeOfPlayer() {
        return  playerType;
    }
    
 }