package picasso.example.ngondo.picassoexample.model;

import java.util.ArrayList;

/**
 * Created by ngondo on 6/17/16.
 */
public class TVShowsCollection {

    public static ArrayList<TVShows> getTVShows(){

        ArrayList<TVShows> tvshows = new ArrayList<>();
        TVShows tv = new TVShows();

        //Add the data dynamically
        tv.setName("Breaking Bad");
        tv.setUrl("https://www.gstatic.com/tv/thumb/tvbanners/9181462/p9181462_b_v8_aa.jpg");
        tvshows.add(tv);

        tv.setName("Game of Thrones");
        tv.setUrl("https://i.kinja-img.com/gawker-media/image/upload/c9lzmv4d3mgzpnyntz7s.jpg");
        tvshows.add(tv);

        tv.setName("Rick and Morty");
        tv.setUrl("http://assets.rollingstone.com/assets/2015/article/how-rick-and-morty-became-one-of-tvs-weirdest-hit-shows-20150722/203443/medium_rect/1437493748/720x405-RAM_S2_Ep205.jpg");
        tvshows.add(tv);

        tv.setName("The Sopranos");
        tv.setUrl("https://images-na.ssl-images-amazon.com/images/G/01/dvd/warner/SopranosS1BD_2.jpg");
        tvshows.add(tv);

        tv.setName("Sherlock");
        tv.setUrl("http://images.amcnetworks.com/bbcamerica.com/wp-content/uploads/2014/04/Benedict-Cumberbatch-Sherlock-.jpg");
        tvshows.add(tv);

        tv.setName("Avatar: The Last Airbender");
        tv.setUrl("http://cdn.playbuzz.com/cdn/cf7c80a6-06d6-45f4-8c98-5427fa470df7/3be826fd-013a-43f7-89bc-fc3ca822e173_560_420.jpg");
        tvshows.add(tv);


        return tvshows;
    }
}
