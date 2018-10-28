package refactor.players;

public class Judge implements Role {
    private boolean isJudge = false;

    @Override
    public void vote() {
        
    }

    @Override
    public void setJudge(boolean isJudge) {
        this.isJudge = isJudge;
        if (isJudge) {
            System.out.println("Just voted Votetard!");
        } else {
            System.out.println("Not allowed to vote");
        }
    }
 }