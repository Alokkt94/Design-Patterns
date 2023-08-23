package ApprovalAuthorityDesign;

public abstract class Managers {

    protected Manager manager;
    int approvalLimit;
    String managerName;

    public void setManager(Manager manager){
        this.manager = manager;
    }

    public void approveSalary(int employeeSalary){
        if(this.approvalLimit > employeeSalary){
            processSalary(employeeSalary);
        } else if (manager != null) {
            manager.approveSalary(employeeSalary);
        }else {
            System.out.println("The offer letter cannot be release");
        }
    }

    protected void processSalary(int employeeSalary) {

    }

}
