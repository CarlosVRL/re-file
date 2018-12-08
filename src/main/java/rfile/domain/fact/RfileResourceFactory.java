package rfile.domain.fact;

import com.github.sardine.DavResource;
import rfile.domain.RfileResource;

public class RfileResourceFactory
{
    public static RfileResource create(DavResource davResource)
    {
        RfileResource rfileResource = new RfileResource();

        rfileResource.setPath(davResource.getPath());

        return rfileResource;
    }
}
