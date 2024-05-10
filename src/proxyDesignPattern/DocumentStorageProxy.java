package proxyDesignPattern;

public class DocumentStorageProxy implements DocumentStorage {
    private final DocumentStorage realStorage;

    public DocumentStorageProxy(final DocumentStorage realStorage) {
        this.realStorage = realStorage;
    }

    @Override
    public Document getDocument(final String id) {
        System.out.println("Accessing document with ID: " + id);
        return realStorage.getDocument(id);
    }

    @Override
    public void saveDocument(final Document document) {
        System.out.println("Saving document with ID: " + document.getId());
        realStorage.saveDocument(document);
    }
}

