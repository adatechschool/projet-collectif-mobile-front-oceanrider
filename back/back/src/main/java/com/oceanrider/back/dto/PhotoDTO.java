package com.oceanrider.back.dto;

import lombok.Getter;
import lombok.Setter;


import java.util.Map;

public class PhotoDTO {
    private String id;
    private int width;
    private int height;
    private String url;
    private String filename;
    private long size;
    private String type;
    private Map<String, Thumbnail> thumbnails;

    public static class Thumbnail {
        private String url;
        private int width;
        private int height;

        public Thumbnail(String url, int width, int height) {
            this.url = url;
            this.width = width;
            this.height = height;
        }

        // Getters and Setters
        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
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
    }

    // Getters and Setters
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public Map<String, Thumbnail> getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(Map<String, Thumbnail> thumbnails) {
        this.thumbnails = thumbnails;
    }
}

