package ApprovalAuthorityDesign;

public class SeniorManager extends Managers{

    public SeniorManager(int approvalLimit , String managerName){
            this.approvalLimit = approvalLimit;
            this.managerName = managerName;
    }
    @Override
    protected void processSalary(int employeeSalary) {
        System.out.println(this.managerName+" has approved the salary at level 2 for the amount "+employeeSalary);
    }
}
