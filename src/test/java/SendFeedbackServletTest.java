import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class SendFeedbackServletTest {

    @Mock
    HttpServletRequest request;

    @Mock
    HttpServletResponse response;

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testDoPost() throws ServletException, IOException {
        when(request.getParameter("name")).thenReturn("John Doe");
        when(request.getParameter("email")).thenReturn("harizjamil7@gmail.com");
        when(request.getParameter("subject")).thenReturn("Test.");
        when(request.getParameter("message")).thenReturn("This is a sample feedback.");

        new SendFeedbackServlet().doPost(request, response);

        verify(request, times(1)).getParameter("name");
        verify(request, times(1)).getParameter("email");
        verify(request, times(1)).getParameter("subject");
        verify(request, times(1)).getParameter("message");
    }
}
