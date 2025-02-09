package patterns.behavioral.chain_of_responsebility;

public class ManagerHandler extends ComplaintHandler{
    @Override
    public void handleComplaint(String complaint) {
        if(complaint.contains("manager")){
            System.out.println("Manager handling serious complaint");
        }else if(nextHandler != null){
            nextHandler.handleComplaint(complaint);
        }
    }
}
