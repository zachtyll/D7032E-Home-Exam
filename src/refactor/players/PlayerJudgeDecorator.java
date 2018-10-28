package refactor.players;

public class PlayerJudgeDecorator extends JudgeDecorator {

    public PlayerJudgeDecorator(Judge decoratedJudge) {
        super(decoratedJudge);		
    }

    @Override
    public void vote() {
        decoratedJudge.vote();
        test(decoratedJudge);
    }

    @Override
    public void setJudge(boolean isJudge) {
        decoratedJudge.setJudge(isJudge);
    }

    private void test(Judge decoratedJudge) {
        System.out.println("Somethig will happen here...");
    }
}