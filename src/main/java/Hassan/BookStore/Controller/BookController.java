package Hassan.BookStore.Controller;

import Hassan.BookStore.Entity.Book;
import Hassan.BookStore.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    // Below operations implements CRUD operations for the database

    // Retrieves all books
    @GetMapping
    public List<Book> getAllBook(@PathVariable Long id) {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @PostMapping("/create")
    public Book createBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }

    @PostMapping("/update/{id}")
    public void updateBook(@PathVariable Long id, String title, String author, Double price) {
        bookService.updateBook(id, title, author, price);
    }


}
