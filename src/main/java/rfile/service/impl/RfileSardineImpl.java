package rfile.service.impl;

import com.github.sardine.DavResource;
import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;
import rfile.domain.RfileResource;
import rfile.domain.fact.RfileResourceFactory;
import rfile.service.RfileService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RfileSardineImpl implements RfileService
{

    private Sardine sardine;

    public RfileSardineImpl() { return; }

    public RfileSardineImpl init()
    {
        this.sardine = SardineFactory.begin();
        return this;
    }

    public List<RfileResource> list(String url) throws IOException
    {
        return setList(sardine.list(url));
    }

    private List<RfileResource> setList(List<DavResource> davResources)
    {
        List<RfileResource> rfileResources = new ArrayList<>();
        for (DavResource davResource : davResources)
        {
            rfileResources.add(RfileResourceFactory.create(davResource));
        }
        return rfileResources;
    }
}
