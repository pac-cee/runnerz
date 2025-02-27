package pacifique.runnerz;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import pacifique.runnerz.controller.BookController;
import pacifique.runnerz.model.Book;
import pacifique.runnerz.service.BookService;

@WebMvcTest(BookController.class)
public class BookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

    @Test
    void testGetBook() throws Exception {
        Book book = new Book();
        book.setId(1L);
        when(bookService.getBookById(1L)).thenReturn(book);
        
        mockMvc.perform(get("/api/books/1"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$.id").value(1));
    }
} 