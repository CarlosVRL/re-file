package rfile.service.impl;

import com.github.sardine.DavResource;
import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;
import rfile.domain.RfileResource;
import rfile.domain.fact.RfileResourceFactory;
import rfile.service.RfileService;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class RfileSardineImpl implements RfileService
{

    private Sardine sardine;

    public RfileSardineImpl() { return; }

    @Override
    public RfileSardineImpl init(String username, String password, String host)
    {
        this.sardine = SardineFactory.begin(username, password);
        this.sardine.enablePreemptiveAuthentication(host);
        return this;
    }

    @Override
    public List<RfileResource> list(String url) throws IOException
    {
        return setList(sardine.list(url));
    }

    @Override
    public void put(String path, InputStream data) throws IOException
    {
        this.sardine.put(path, data);
    }

    @Override
    public boolean exists(String path) throws IOException
    {
        return this.sardine.exists(path);
    }

    @Override
    public void delete(String url) throws IOException
    {
        this.sardine.delete(url);
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
