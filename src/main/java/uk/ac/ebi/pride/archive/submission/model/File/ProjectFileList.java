package uk.ac.ebi.pride.archive.submission.model.File;

import uk.ac.ebi.pride.archive.submission.model.util.CollectionUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProjectFileList implements Serializable {


    private final List<ProjectFile> ProjectFiles;

    public ProjectFileList() {
        this.ProjectFiles = new ArrayList<ProjectFile>();
    }

    public ProjectFileList(Collection<ProjectFile> ProjectFiles) {
        this.ProjectFiles = CollectionUtils.createListFromList(ProjectFiles);
    }

    public List<ProjectFile> getProjectFiles() {
        return ProjectFiles;
    }

    public void setProjectFiles(List<ProjectFile> ProjectFiles) {
        CollectionUtils.replaceValuesInCollection(ProjectFiles, this.ProjectFiles);
    }

    public void addProjectFile(ProjectFile ProjectFile) {
        this.ProjectFiles.add(ProjectFile);
    }

}
