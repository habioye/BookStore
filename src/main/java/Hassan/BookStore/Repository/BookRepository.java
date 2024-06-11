package Hassan.BookStore.Repository;

import Hassan.BookStore.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
