package picasso.example.ngondo.picassoexample.views;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import picasso.example.ngondo.picassoexample.R;
import picasso.example.ngondo.picassoexample.model.TVShows;
import picasso.example.ngondo.picassoexample.views.picasso.PicassoClient;

/**
 * Created by ngondo on 6/17/16.
 */
public class RVAdapter extends RecyclerView.Adapter<RVHolder> {
    Context context;
    ArrayList<TVShows> mTVShows;

    public RVAdapter(Context context, ArrayList<TVShows> mTVShows) {
        this.context = context;
        this.mTVShows = mTVShows;
    }

    @Override
    public RVHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlayout, parent, false);
        RVHolder holder = new RVHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(RVHolder holder, int position) {
        //bind the name data to view
        holder.mName.setText(mTVShows.get(position).getName());

        //bind the image data to view using PicassoClient class
        PicassoClient.downloadImage(context, mTVShows.get(position).getUrl(), holder.mImage);

    }

    @Override
    public int getItemCount() {

        return mTVShows.size();
    }
}
