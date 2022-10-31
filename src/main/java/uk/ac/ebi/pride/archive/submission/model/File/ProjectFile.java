package uk.ac.ebi.pride.archive.submission.model.File;

import uk.ac.ebi.pride.archive.dataprovider.file.ProjectFileSource;
import uk.ac.ebi.pride.archive.dataprovider.file.ProjectFileType;

import java.io.Serializable;

public class ProjectFile implements Serializable {

        private Long id;
        private Long projectId;
        private Long assayId;
        private ProjectFileType fileType;
        private long fileSize;
        private String fileName;
        private String filePath;
        private ProjectFileSource fileSource;
        public static final int RESULT_FILE_TYPE = 1;
        public static final int PEAK_FILE_TYPE = 2;
        public static final int SEARCH_FILE_TYPE = 3;
        public static final int RAW_FILE_TYPE = 4;
        public static final int QUANTIFICATION_FILE_TYPE = 5;
        public static final int GEL_FILE_TYPE = 6;
        public static final int OTHER_FILE_TYPE = 7;

        public ProjectFile() {
        }

        public Long getId() {
            return this.id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getProjectId() {
            return this.projectId;
        }

        public void setProjectId(Long projectId) {
            this.projectId = projectId;
        }

        public Long getAssayId() {
            return this.assayId;
        }

        public void setAssayId(Long assayId) {
            this.assayId = assayId;
        }

        public ProjectFileType getFileType() {
            return this.fileType;
        }

        public void setFileType(ProjectFileType fileType) {
            this.fileType = fileType;
        }

        public ProjectFileSource getFileSource() {
            return this.fileSource;
        }

        public void setFileSource(ProjectFileSource fileSource) {
            this.fileSource = fileSource;
        }

        public long getFileSize() {
            return this.fileSize;
        }

        public void setFileSize(long fileSize) {
            this.fileSize = fileSize;
        }

        public String getFileName() {
            return this.fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        /** @deprecated */
        @Deprecated
        public String getFilePath() {
            return this.filePath;
        }

        /** @deprecated */
        @Deprecated
        public void setFilePath(String filePath) {
            this.filePath = filePath;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            } else if (!(o instanceof ProjectFile)) {
                return false;
            } else {
                ProjectFile that = (ProjectFile)o;
                if (this.fileSize != that.fileSize) {
                    return false;
                } else {
                    label59: {
                        if (this.assayId != null) {
                            if (this.assayId.equals(that.assayId)) {
                                break label59;
                            }
                        } else if (that.assayId == null) {
                            break label59;
                        }

                        return false;
                    }

                    if (!this.fileName.equals(that.fileName)) {
                        return false;
                    } else {
                        if (this.filePath != null) {
                            if (!this.filePath.equals(that.filePath)) {
                                return false;
                            }
                        } else if (that.filePath != null) {
                            return false;
                        }

                        if (this.fileSource != that.fileSource) {
                            return false;
                        } else if (this.fileType != that.fileType) {
                            return false;
                        } else {
                            if (this.projectId != null) {
                                if (!this.projectId.equals(that.projectId)) {
                                    return false;
                                }
                            } else if (that.projectId != null) {
                                return false;
                            }

                            return true;
                        }
                    }
                }
            }
        }

        public int hashCode() {
            int result = this.projectId != null ? this.projectId.hashCode() : 0;
            result = 31 * result + (this.assayId != null ? this.assayId.hashCode() : 0);
            result = 31 * result + this.fileType.hashCode();
            result = 31 * result + (int)(this.fileSize ^ this.fileSize >>> 32);
            result = 31 * result + this.fileName.hashCode();
            result = 31 * result + (this.filePath != null ? this.filePath.hashCode() : 0);
            result = 31 * result + this.fileSource.hashCode();
            return result;
        }

}
