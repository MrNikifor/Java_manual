package patterns.behavioral.chain_of_responsebility;

public abstract class ComplaintHandler {
    protected ComplaintHandler nextHandler;

    public void setNextHandler(ComplaintHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleComplaint(String complaint);
}
