package assignment;

public class HardwareSupportHandler extends SupportHandler {
    public HardwareSupportHandler(final SupportHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(final SupportRequest request) {
        if ("hardware".equals(request.getType())) {
            System.out.println("Handling hardware support request #" + request.getId());
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}

