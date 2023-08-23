package ApprovalAuthorityDesign;

public class Main {

    public static void main(String[] args) {
        ChainCreator chainCreator = new ChainCreator();
        Managers manager = chainCreator.managerChain();

        manager.approveSalary(5000);
        manager.approveSalary(15000);
        manager.approveSalary(50000);
    }
}
