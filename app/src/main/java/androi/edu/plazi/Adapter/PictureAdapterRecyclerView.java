package androi.edu.plazi.Adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androi.edu.plazi.R;
import androi.edu.plazi.model.Picture;

public class PictureAdapterRecyclerView extends RecyclerView.Adapter<PictureAdapterRecyclerView.PictureViewHolder> {

    private ArrayList<Picture> pictures;
    private int resource;
    private Activity activity;

    public PictureAdapterRecyclerView(ArrayList<Picture> pictures, int resource, Activity activity) {
        this.pictures = pictures;
        this.resource = resource;
        this.activity = activity;
    }

    @NonNull
    @Override
    public PictureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource,parent,false);
        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PictureViewHolder holder, int position) {
        Picture picture = pictures.get(position);
        holder.usernombrecard.setText(picture.getUsername());
        holder.timecard.setText(picture.getTime());
        holder.likeNumberCard.setText(picture.getLike_number());

    }

    @Override
    public int getItemCount() {
        return pictures.size() ;
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder{

        private ImageView pictureCard;
        private TextView usernombrecard,timecard,likeNumberCard;

    public PictureViewHolder(View itemView){
        super(itemView);

        pictureCard = (ImageView) itemView.findViewById(R.id.pictureCard);
        usernombrecard = (TextView) itemView.findViewById(R.id.usernombrecard);
        timecard = (TextView) itemView.findViewById(R.id.timecard);
        likeNumberCard = (TextView) itemView.findViewById(R.id.likeNumberCard);
    }

    }
}
