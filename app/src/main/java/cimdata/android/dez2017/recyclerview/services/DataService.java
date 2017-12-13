package cimdata.android.dez2017.recyclerview.services;

import cimdata.android.dez2017.recyclerview.models.AnimalImage;

public class DataService {

    public static AnimalImage[] animalImages;

    static {

        animalImages = new AnimalImage[]{
                new AnimalImage("Camelatz","camelatz"),
                new AnimalImage("Delfund","delfund"),
                new AnimalImage("Elefalter","elefalter"),
                new AnimalImage("Eulachs","eulachs"),
                new AnimalImage("Kamelund","kamelund"),
                new AnimalImage("Löffel","loeffel"),
                new AnimalImage("Tiger Eule","tigeule"),
        };

    }

}
