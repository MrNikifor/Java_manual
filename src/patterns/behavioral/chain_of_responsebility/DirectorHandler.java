package patterns.behavioral.chain_of_responsebility;

public class DirectorHandler extends ComplaintHandler{
    @Override
    public void handleComplaint(String complaint) {
        if(complaint.contains("director")){
            System.out.println("Director handling critical complaint");
        }else if (nextHandler != null){
            nextHandler.handleComplaint(complaint);
        }
    }
}
