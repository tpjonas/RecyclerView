package cimdata.android.dez2017.recyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class ListViewAdapter extends RecyclerView.Adapter<ListViewAdapter.ListViewHolder> {


    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {


        public ListViewHolder(View itemView) {
            super(itemView);
        }
    }
}
