package cimdata.android.dez2017.recyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import cimdata.android.dez2017.recyclerview.R;
import cimdata.android.dez2017.recyclerview.models.AnimalImage;

public class ListViewAdapter extends RecyclerView.Adapter<ListViewAdapter.ListViewHolder> {

    private LayoutInflater layoutInflater;
    private AnimalImage[] animalImages;
    private Context context;

    public ListViewAdapter(Context context, AnimalImage[] images) {
        this.animalImages = images;
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View listView = layoutInflater.inflate(
                R.layout.list_view_item, // Das Layout, das eine "Zelle" repräsentiert
                parent,                  // Die View (RecyclerView), die die Zellen darstellt
                false);

        // Hier geben wir eine Instanz des ViewHolders zurück, den wir mit der View verknüpfen
        return new ListViewHolder(context, listView);
    }

    // Hier wird recycelt:
    // Hier verknüpfen wir die Daten mit den ViewHoldern, die gerade angezeigt bzw.
    // vorbereitet werden
    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {

        AnimalImage currentImage = animalImages[position];
        holder.displayData(currentImage);

    }

    @Override
    public int getItemCount() {
        return animalImages.length;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        private TextView titleText;
        private ImageView image;
        private Context context;

        // Im Konstruktor nehmen wiur die ListView  (als ItemView) an und holen uns die Felder
        public ListViewHolder(Context context, View itemView) {
            super(itemView);

            this.titleText = itemView.findViewById(R.id.txt_vlist_title);
            this.image = itemView.findViewById(R.id.img_vlist_image);
            this.context = context;
        }

        public void displayData(AnimalImage animalImage) {

            // Hier holen wir uns die drawable ID mit Hilfe der des Bildnamens
            int drawableId = context
                    .getResources()
                    .getIdentifier(
                        animalImage.getImageName(),
                        "drawable",
                        context.getPackageName()
                    );

            image.setImageResource(drawableId);
            titleText.setText(animalImage.getName());

        }

    }
}
