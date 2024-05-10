package assignment;

public class SupportRequest {
    private final int id;
    private final String description;
    private final String type;
    private final int priority;

    public SupportRequest(final int id, final String description, final String type, final int priority) {
        this.id = id;
        this.description = description;
        this.type = type;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public int getPriority() {
        return priority;
    }
}

