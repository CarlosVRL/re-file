package rfile.service;

import rfile.domain.RfileResource;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public interface RfileService
{
    /**
     * Initialize the service.
     *
     * @return the instance
     */
    RfileService init(String username, String password, String host);

    /**
     * Gets a directory listing from the URL.
     *
     * @param path path to the resource
     * @return list of resources including the parent resource itself
     * @throws Exception I/O error or response validation failure
     */
    List<RfileResource> list(String path) throws IOException;

    /**
     * Put a file on the server.
     *
     * @param path path to the resource
     * @param data the file data
     * @throws IOException I/O error or response validation failure
     */
    void put(String path, InputStream data) throws IOException;

    /**
     * Performs a request to see if a resource exists or not.
     *
     * @param path path to the resource
     * @return true if the resource is founde, else false
     * @throws IOException I/O error or response validation failure
     */
    boolean exists(String path) throws IOException;

    /**
     * Delete a resource at the specified path.
     *
     * @param path path to the resource
     * @throws IOException I/O error or HTTP response validation failure
     */
    void delete(String path) throws IOException;

    /**
     * Get a resource at the specified path.
     *
     * @param path path to the resource
     * @return
     */
    InputStream get(String path) throws IOException;
}
