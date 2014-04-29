package uk.ac.ebi.pride.archive.submission.model.submission;

import java.io.Serializable;

/**
 * Upload details for an incoming submission
 *
 * @author Rui Wang
 * @version $Id$
 */
public class UploadDetail implements Serializable {
    private final UploadMethod method;
    private final String host;
    private final int port;
    private final String folder;
    private final DropBoxDetail dropBox;

    public UploadDetail(UploadMethod method,
                        String host,
                        int port,
                        String folder,
                        DropBoxDetail dropBox) {
        this.method = method;
        this.host = host;
        this.port = port;
        this.folder = folder;
        this.dropBox = dropBox;
    }

    public UploadMethod getMethod() {
        return method;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getFolder() {
        return folder;
    }

    public DropBoxDetail getDropBox() {
        return dropBox;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UploadDetail)) return false;

        UploadDetail that = (UploadDetail) o;

        if (port != that.port) return false;
        if (!dropBox.equals(that.dropBox)) return false;
        if (!folder.equals(that.folder)) return false;
        if (!host.equals(that.host)) return false;
        if (method != that.method) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = method.hashCode();
        result = 31 * result + host.hashCode();
        result = 31 * result + port;
        result = 31 * result + folder.hashCode();
        result = 31 * result + dropBox.hashCode();
        return result;
    }
}
