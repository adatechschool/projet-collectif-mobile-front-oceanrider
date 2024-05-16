package com.oceanrider.back.dto;


public class PhotoDTO {
    public PhotoDTO(String id, int width, int height, String testUrl, String filename, long size, String type) {
        this.id = id;
        this.width = width;
        this.height = height;
        this.testUrl = testUrl;
        this.filename = filename;
        this.size = size;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getTestUrl() {
        return testUrl;
    }

    public void setTestUrl(String testUrl) {
        this.testUrl = testUrl;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String id;
    private int width;
    private int height;
    private String testUrl;
    private String filename;
    private long size;
    private String type;
}
