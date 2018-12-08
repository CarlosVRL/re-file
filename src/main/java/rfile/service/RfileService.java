package rfile.service;

import rfile.domain.RfileResource;

import java.io.IOException;
import java.util.List;

public interface RfileService
{
    /**
     * Initialize the service.
     *
     * @return the instance
     */
    RfileService init();

    /**
     * Gets a directory listing from the URL.
     *
     * @param url Path to the resource including protocol and hostname
     * @return List of resources for this URI including the parent resource itself
     * @throws IOException I/O error or HTTP response validation failure
     */
    List<RfileResource> list(String url) throws IOException;
}
