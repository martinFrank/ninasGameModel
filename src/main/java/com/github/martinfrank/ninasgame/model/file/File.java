package com.github.martinfrank.ninasgame.model.file;

import java.util.List;

public class File {
    private String filename;
    private String fileContentAsBase64String;

    public File() {
    }

    public File(String filename, String fileContentAsBase64String) {
        this.filename = filename;
        this.fileContentAsBase64String = fileContentAsBase64String;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFileContentAsBase64String() {
        return fileContentAsBase64String;
    }

    public void setFileContentAsBase64String(String fileContentAsBase64String) {
        this.fileContentAsBase64String = fileContentAsBase64String;
    }
}
