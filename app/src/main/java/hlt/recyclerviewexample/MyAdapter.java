package hlt.recyclerviewexample;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList<CardItem> cardItems;
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public CardView cardView;
        public TextView cardTitle, subTitle, cardText;
        public ImageView cardImage;
        public ViewHolder(View v) {
            super(v);
            cardView = v.findViewById(R.id.cardView);
            cardTitle = (TextView) v.findViewById(R.id.card_title);
            subTitle = (TextView) v.findViewById(R.id.sub_title);
            cardImage = (ImageView) v.findViewById(R.id.card_image);
            cardText = (TextView) v.findViewById(R.id.cardText);
        }
    }

    public MyAdapter(ArrayList<CardItem> cardItems) {
        this.cardItems = cardItems;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CardItem cardItem = cardItems.get(position);
        holder.cardTitle.setText(cardItem.getCardTitle());
        holder.subTitle.setText(cardItem.getSubTitle());
        holder.cardImage.setImageResource(cardItem.getImageID());
        holder.cardText.setText(cardItem.getCardText());
    }

    @Override
    public int getItemCount() {
        return cardItems.size();
    }
}