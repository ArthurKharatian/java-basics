package org.itmo.lesson7.extra.service;

import org.itmo.lesson7.extra.dao.Document;

import java.util.List;

public interface DocumentService {
    Document create(Integer pageCount, String format, Boolean isEditable);

    Document read(Long id);

    Document update(Document document);

    void delete(Long id);

    List<Document> getDocuments();
}
