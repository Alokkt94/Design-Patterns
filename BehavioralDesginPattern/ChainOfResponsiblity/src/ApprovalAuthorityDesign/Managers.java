package ApprovalAuthorityDesign;

public abstract class Managers {

    protected Managers manager;
    int approvalLimit;
    String managerName;

    public void setManager(Managers manager){
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

    protected abstract void processSalary(int employeeSalary);

}
