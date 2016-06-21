package picasso.example.ngondo.picassoexample.views.picasso;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import picasso.example.ngondo.picassoexample.R;

/**
 * Created by ngondo on 6/17/16.
 */
public class PicassoClient {

    public static void downloadImage(Context c, String url, ImageView image){
        //check first if the url has sth
        if(url != null && url.length() > 0){
            Picasso.with(c).load(url).placeholder(R.drawable.ic_person_pin_black_24dp).into(image);

        }else{
            Picasso.with(c).load(R.drawable.ic_person_pin_black_24dp);
        }
    }
}
