package com.vamsi.popularmovies;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Vamsi on 03-08-2016.
 */
public class Globals {

    public static String apiKey = ""; //replace with your own

    public static String baseImageUrl = "http://image.tmdb.org/t/p/w342/";//342//500//185

    public static String baseImageUrlHD = "http://image.tmdb.org/t/p/w500/";

    public static String trials = "http://api.themoviedb.org/3/movie/%s/videos?api_key=%s";

    public static String reviews = "http://api.themoviedb.org/3/movie/%s/reviews?api_key=%s";

    public static String youtube_thumb = "http://img.youtube.com/vi/%s/0.jpg";

    public static String movies = "http://api.themoviedb.org/3/movie/%s?api_key=%s";

    public static String youtube_url = "http://www.youtube.com/watch?v=";


    public static boolean isOnline(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }


    /*refrence urls

    * https://github.com/codepath/android_guides/wiki/Using-an-ArrayAdapter-with-ListView
    * */

}
