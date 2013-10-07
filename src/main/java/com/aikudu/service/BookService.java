package com.aikudu.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aikudu.dao.MongoDao;
import com.aikudu.model.Book;
import com.aikudu.model.QueryResult;
import com.googlecode.mjorm.query.DaoQuery;

@Service
public class BookService {

  @Autowired
  private IdGenerator idGenerator;
  @Autowired
  private MongoDao mongoDao;

  public QueryResult<Book> queryBooks(int page, int pageSize) {
    QueryResult<Book> result = new QueryResult<>(page, pageSize);
    DaoQuery query = mongoDao.createQuery("Book");
    result.setTotal(query.countObjects());

    query.setFirstDocument(result.getStart());
    query.setMaxDocuments(result.getPageSize());
    result.setItems(query.findObjects(Book.class).readAll());

    return result;
  }

  public Book addBook(String name) {
    Book book = new Book();
    book.setId(idGenerator.getStringId());
    book.setName(name);
    book.setCreated(new Date());
    book.setModified(book.getCreated());
    return mongoDao.createObject("Book", book);
  }

  public void deleteBook(String id) {
    mongoDao.deleteObject("Book", id);
  }

  public Book getBook(String id) {
    return mongoDao.findById("Book", Book.class, id);
  }

}
