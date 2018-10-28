package refactor.players;

public class Judge implements Role {
    private boolean isJudge = false;

    @Override
    public void setRole(boolean isJudge) {
        this.isJudge = isJudge;
    }

    @Override
    public void canAct() {
        if (isJudge) {
            System.out.println("Just voted Votetard!");
        } else {
            System.out.println("Not allowed to vote");
        }
    }
 }