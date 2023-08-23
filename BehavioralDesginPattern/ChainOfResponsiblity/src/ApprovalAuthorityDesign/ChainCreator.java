package ApprovalAuthorityDesign;

public class ChainCreator {

    public Managers managerChain(){
        HiringManager hiringManager = new HiringManager(10000 , "Uttapa");
        SeniorManager seniorManager = new SeniorManager(20000,"Bini");
        Director director = new Director(30000 , "Rinto Markose");

        hiringManager.setManager(seniorManager);
        seniorManager.setManager(director);

        return hiringManager;
    }
}
