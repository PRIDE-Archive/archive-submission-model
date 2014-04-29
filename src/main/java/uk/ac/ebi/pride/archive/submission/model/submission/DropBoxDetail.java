package uk.ac.ebi.pride.archive.submission.model.submission;

import java.io.Serializable;

/**
 * DropBox represents an upload dropbox directory (e.g. FTP folder or Aspera folder)
 *
 * @author Rui Wang
 * @version $Id$
 */
public class DropBoxDetail implements Serializable{
    private final String dropBoxDirectory;
    private final String userName;
    private final String password;

    public DropBoxDetail(String dropBoxDirectory, String userName, String password) {
        this.dropBoxDirectory = dropBoxDirectory;
        this.userName = userName;
        this.password = password;
    }

    public String getDropBoxDirectory() {
        return dropBoxDirectory;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DropBoxDetail)) return false;

        DropBoxDetail that = (DropBoxDetail) o;

        if (!dropBoxDirectory.equals(that.dropBoxDirectory)) return false;
        if (!password.equals(that.password)) return false;
        if (!userName.equals(that.userName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dropBoxDirectory.hashCode();
        result = 31 * result + userName.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }
}
