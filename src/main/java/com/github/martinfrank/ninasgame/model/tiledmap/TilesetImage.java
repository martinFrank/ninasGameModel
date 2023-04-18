package com.github.martinfrank.ninasgame.model.tiledmap;

public class TilesetImage {


    private String name;
    private String filename;
    private String imageContentAsBase64String;

    public TilesetImage(String name, String filename, String imageContentAsBase64String) {
        this.name = name;
        this.filename = filename;
        this.imageContentAsBase64String = imageContentAsBase64String;
    }

    public TilesetImage() {
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

    public String getImageContentAsBase64String() {
        return imageContentAsBase64String;
    }

    public void setImageContentAsBase64String(String imageContentAsBase64String) {
        this.imageContentAsBase64String = imageContentAsBase64String;
    }

}
