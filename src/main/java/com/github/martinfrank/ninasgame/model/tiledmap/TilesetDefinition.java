package com.github.martinfrank.ninasgame.model.tiledmap;

public class TilesetDefinition {

    private String name;
    private String filename;
    private String fileContentAsBase64String;
    private String imageName;


    public TilesetDefinition() {
    }

    public TilesetDefinition(String name, String filename, String fileContentAsBase64String, String imageName) {
        this.name = name;
        this.filename = filename;
        this.fileContentAsBase64String = fileContentAsBase64String;
        this.imageName = imageName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
