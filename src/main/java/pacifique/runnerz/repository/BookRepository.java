package pacifique.runnerz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pacifique.runnerz.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    boolean existsByIsbn(String isbn);
} 