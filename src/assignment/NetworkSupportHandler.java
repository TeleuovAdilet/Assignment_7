package assignment;

public class NetworkSupportHandler extends SupportHandler {
    public NetworkSupportHandler(final SupportHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(final SupportRequest request) {
        if ("network".equals(request.getType())) {
            System.out.println("Handling network support request #" + request.getId());
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}

