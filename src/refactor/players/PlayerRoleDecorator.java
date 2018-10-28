package refactor.players;

public class PlayerRoleDecorator extends RoleDecorator {

    public PlayerRoleDecorator(Role decoratedRole) {
        super(decoratedRole);		
    }

    @Override
    public void setRole(boolean isRole) {
        decoratedRole.setRole(isRole);
    }

    @Override
    public void canAct() {
        decoratedRole.canAct();
        vote(decoratedRole);
    }

    private void vote(Role decoratedRole) {
        System.out.println("Somethig will happen here...");
    }
}