package assignment;

public abstract class SupportHandler {
    protected final SupportHandler next;

    public SupportHandler(final SupportHandler next) {
        this.next = next;
    }

    public abstract void handleRequest(final SupportRequest request);
}

