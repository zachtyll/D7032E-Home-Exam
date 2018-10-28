package refactor.players;

public abstract class JudgeDecorator implements Judge {
    protected Judge decoratedJudge;
 
    public JudgeDecorator(Judge decoratedJudge){
       this.decoratedJudge = decoratedJudge;
    }

    public void vote() {
        decoratedJudge.vote();
    }
 }