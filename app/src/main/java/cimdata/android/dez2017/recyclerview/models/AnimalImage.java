package cimdata.android.dez2017.recyclerview.models;

/**
 * Created by Student on 13.12.2017.
 */

public class AnimalImage {

    private String name;
    private String imageName;

    public AnimalImage(String name, String imageName) {
        this.name = name;
        this.imageName = imageName;
    }

    public String getName() {
        return name;
    }

    public String getImageName() {
        return imageName;
    }
}
