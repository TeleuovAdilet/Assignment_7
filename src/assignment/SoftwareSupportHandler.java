package assignment;

public class SoftwareSupportHandler extends SupportHandler {
    public SoftwareSupportHandler(final SupportHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(final SupportRequest request) {
        if ("software".equals(request.getType())) {
            System.out.println("Handling software support request #" + request.getId());
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}

