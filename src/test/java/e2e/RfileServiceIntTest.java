package e2e;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import rfile.domain.RfileResource;
import rfile.service.RfileService;
import rfile.service.impl.RfileSardineImpl;

import java.io.IOException;
import java.util.List;

import static org.testng.Assert.*;

/**
 * E2E Integration Tests for RfileService.
 */
public class RfileServiceIntTest
{

    private RfileService rfileService;

    private static final String ROOT_DIR = "/";

    @BeforeMethod
    private void init_test()
    {
        rfileService = new RfileSardineImpl().init();
    }

    @Test
    public void can_init()
    {
        assertNotNull(rfileService);
    }

    @Test
    public void can_list() throws Exception
    {
        List<RfileResource> rfileResources
                = rfileService.list("http://192.168.99.100:8080/");
        assertEquals(rfileResources.get(0).getPath(), ROOT_DIR);
    }

    @Test
    public void can_saveFileToResource()
    {

    }

    @Test
    public void can_readFileFromResource()
    {

    }

    @Test
    public void can_listSubDirectories()
    {

    }

    @Test
    public void can_listContentsOfSubdirectory()
    {

    }
}
