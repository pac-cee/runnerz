package pacifique.runnerz;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import pacifique.runnerz.model.Book;
import pacifique.runnerz.repository.BookRepository;

@DataJpaTest
public class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    void testSaveBook() {
        Book book = new Book();
        book.setTitle("Learning Spring Boot");
        book.setAuthor("John Doe");
        book.setIsbn("1234567890");
        
        Book savedBook = bookRepository.save(book);
        
        assertThat(savedBook).isNotNull();
        assertThat(savedBook.getId()).isNotNull();
    }
} 