package Hassan.BookStore.Service;

import Hassan.BookStore.Entity.Book;
import Hassan.BookStore.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }


    // Updates the book by checking if it exists and changing it.
    public void updateBook(Long id, String title, String author, Double price) {
        Book book = getBookById(id);
        if (book == null) return;
        book.title = title;
        book.author = author;
        book.price = price;
        saveBook(book);


    }
}
