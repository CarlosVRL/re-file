package e2e;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import rfile.domain.RfileResource;
import rfile.service.RfileService;
import rfile.service.impl.RfileSardineImpl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.testng.Assert.*;

/**
 * E2E Integration Tests for RfileService.
 */
public class RfileServiceIntTest
{

    private RfileService rfileService;

    private static final String ROOT_DIR = "/webdav/";
    private static final String DEV_PASS = "webdav";
    private static final String TEST_HOST = "http://192.168.99.100:8080/webdav/";

    @BeforeMethod
    private void init_test()
    {
        rfileService = new RfileSardineImpl().init(DEV_PASS, DEV_PASS, TEST_HOST);
    }

    @Test
    public void can_init()
    {
        assertNotNull(rfileService);
    }

    @Test
    public void can_list() throws IOException
    {
        List<RfileResource> rfileResources
                = rfileService.list(TEST_HOST);
        for (RfileResource rfileResource : rfileResources)
        {
            System.out.println(rfileResource.getPath());
        }
        assertEquals(rfileResources.get(0).getPath(), ROOT_DIR);
    }

    @Test
    public void can_saveFileToResource() throws IOException
    {
        String testPath = "testData.txt";
        String testData = "test data";
        InputStream is = new ByteArrayInputStream(testData.getBytes());

        rfileService.put(TEST_HOST + testPath, is);

        // assert


        // cleanup
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
