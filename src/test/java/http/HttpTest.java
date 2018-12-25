package http;

import static org.testng.Assert.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HttpTest
{

    private HttpURLConnectionApi api;

    @BeforeMethod
    public void init_api()
    {
        api = new HttpURLConnectionApi();
    }

    @Test
    public void can_instantiate()
    {
        assertNotNull(api);
    }

    @Test
    public void can_perform_get()
    {

    }

    @Test
    public void can_print_http_response()
    {

    }

    @Test
    public void can_print_http_headers()
    {

    }

    @Test
    public void can_print_http_cookies()
    {

    }
}
