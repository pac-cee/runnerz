package pacifique.runnerz.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pacifique.runnerz.model.Book;
import pacifique.runnerz.repository.BookRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    
    public Book getBookById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found with id: " + id));
    }
    
    public Book createBook(Book book) {
        if (bookRepository.existsByIsbn(book.getIsbn())) {
            throw new RuntimeException("Book with ISBN " + book.getIsbn() + " already exists");
        }
        book.setAvailableQuantity(book.getQuantity());
        return bookRepository.save(book);
    }
    
    public Book updateBook(Long id, Book bookDetails) {
        Book book = getBookById(id);
        book.setTitle(bookDetails.getTitle());
        book.setAuthor(bookDetails.getAuthor());
        book.setCategory(bookDetails.getCategory());
        book.setQuantity(bookDetails.getQuantity());
        book.setAvailableQuantity(bookDetails.getAvailableQuantity());
        book.setPublishedYear(bookDetails.getPublishedYear());
        return bookRepository.save(book);
    }
    
    public void deleteBook(Long id) {
        Book book = getBookById(id);
        bookRepository.delete(book);
    }
} 