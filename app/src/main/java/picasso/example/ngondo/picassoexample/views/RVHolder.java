package picasso.example.ngondo.picassoexample.views;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import picasso.example.ngondo.picassoexample.R;

/**
 * Created by ngondo on 6/17/16.
 */
public class RVHolder extends RecyclerView.ViewHolder{

    TextView mName;
    ImageView mImage;

    public RVHolder(View itemView) {
        super(itemView);

        mName = (TextView) itemView.findViewById(R.id.movieName);
        mImage = (ImageView) itemView.findViewById(R.id.movieImage);
    }
}
