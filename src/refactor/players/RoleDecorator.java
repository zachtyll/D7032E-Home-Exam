package refactor.players;

public abstract class RoleDecorator implements Role {
    protected Role decoratedRole;
 
    public RoleDecorator(Role decoratedRole){
       this.decoratedRole = decoratedRole;
    }

    public void setRole(boolean isRole) {
        decoratedRole.setRole(isRole);
    }

    public void canAct() {
        decoratedRole.canAct();
    }
 }