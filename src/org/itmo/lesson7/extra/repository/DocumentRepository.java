package org.itmo.lesson7.extra.repository;

import org.itmo.lesson7.extra.dao.Document;

import java.util.List;

public interface DocumentRepository {
    Document findById(Long id);

    void save(Document document);

    void delete(Long id);

    List<Document> getDocuments();
}
