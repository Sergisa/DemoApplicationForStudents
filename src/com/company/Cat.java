package com.company;

import java.net.MalformedURLException;
import java.net.URL;

public class Cat {
    private String name;
    private URL image;

    public Cat(String name, URL image) {
        this.image = image;
        this.name = name;
    }

    public Cat(String name, String image) {
        try {
            this.image = new URL(image);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public URL getImage() {
        return image;
    }

    public void setImage(URL image) {
        this.image = image;
    }
}
