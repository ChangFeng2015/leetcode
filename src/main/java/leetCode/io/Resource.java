package leetCode.io;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

/**
 * @ClassName Resource
 * @Description TODO
 * @Author Dave
 * @Date 2018/8/29 10:54
 * @Version 1.0
 **/
public interface Resource extends InputStream {

    boolean exists();

    boolean isReadable();

    boolean isOpen();

    URI getURI() throws IOException;

    URL getURL() throws IOException;

    File getFile() throws IOException;

    long contentLength() throws IOException;

    long lastModified() throws IOException;

    Resource createRelative(String relativePath) throws IOException;

    String getFilename();

    String getDescription();
}
