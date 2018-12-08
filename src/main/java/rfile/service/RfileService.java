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
     * @param path path to the resource
     * @return list of resources including the parent resource itself
     * @throws Exception I/O error or response validation failure
     */
    List<RfileResource> list(String path) throws Exception;
}
