package org.itmo.lesson7.extra.service.impl;

import org.itmo.lesson7.extra.dao.Document;
import org.itmo.lesson7.extra.repository.DocumentRepository;
import org.itmo.lesson7.extra.repository.impl.DocumentRepositoryImpl;
import org.itmo.lesson7.extra.service.DocumentService;

import java.util.List;

public class DocumentServiceImpl implements DocumentService {
    private DocumentRepository repository = new DocumentRepositoryImpl();

    @Override
    public Document create(Integer pageCount, String format, Boolean isEditable) {
        Document document = new Document(pageCount, format, isEditable);
        repository.save(document);
        return document;
    }

    @Override
    public Document read(Long id) {
        return repository.findById(id);
    }

    @Override
    public Document update(Document document) {
        repository.save(document);
        return document;
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

    @Override
    public List<Document> getDocuments() {
        return repository.getDocuments();
    }
}
