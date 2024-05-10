package proxyDesignPattern;

import proxyDesignPattern.Document;

public interface DocumentStorage {
    Document getDocument(final String id);
    void saveDocument(final Document document);
}

