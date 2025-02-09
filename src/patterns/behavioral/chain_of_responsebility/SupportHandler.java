package patterns.behavioral.chain_of_responsebility;

import java.util.logging.Handler;

public class SupportHandler extends ComplaintHandler {
    @Override
    public void handleComplaint(String complaint) {
        if (complaint.contains("support")) {
            System.out.println("Support handling general complaint");
        }else if(nextHandler != null){
            nextHandler.handleComplaint(complaint);
        }
    }
}
