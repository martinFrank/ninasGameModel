package com.github.martinfrank.ninasgame.model.tiledmap;

import java.util.List;

public class TiledmapDefinition {

    private String name;
    private String filename;
    private String fileContentAsBase64String;
    private List<String> requiredTilesetNames;

    public TiledmapDefinition() {
    }

    public TiledmapDefinition(String name, String filename, String fileContentAsBase64String, List<String> requiredTilesetNames) {
        this.name = name;
        this.filename = filename;
        this.fileContentAsBase64String = fileContentAsBase64String;
        this.requiredTilesetNames = requiredTilesetNames;
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

    public void setFileContentAsBase64String(String filename) {
        this.filename = filename;
    }

    public String getFileContentAsBase64String() {
        return fileContentAsBase64String;
    }

    public void setFileContent(String fileContentAsBase64String) {
        this.fileContentAsBase64String = fileContentAsBase64String;
    }

    public List<String> getRequiredTilesetNames() {
        return requiredTilesetNames;
    }

    public void setRequiredTilesetNames(List<String> requiredTilesetNames) {
        this.requiredTilesetNames = requiredTilesetNames;
    }
}
