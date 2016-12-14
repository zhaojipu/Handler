package a001.and.com.homeworkapp.service;


import a001.and.com.homeworkapp.beans.MovieBean;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by zhaojipu on 2016/11/30.
 */

public interface MovieService {
    @GET("top250")
    Observable<MovieBean> getTopMovie(@Query("start") int start, @Query("count") int count);

    @POST("top250")
    Observable<MovieBean> postTop(@Body MovieBean movieBean);
}
