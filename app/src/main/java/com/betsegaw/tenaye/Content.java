package com.betsegaw.tenaye;

/**
 * Created by betsegaw on 3/22/18.
 */

public class Content {
    String title;
    String description;
    int thumbnail;

    public Content() {
    }

    public Content(String title, String description, int thumbnail) {
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
