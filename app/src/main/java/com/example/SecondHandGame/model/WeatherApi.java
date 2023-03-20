package com.example.SecondHandGame.model;

import com.example.SecondHandGame.WeatherSearchResult;
import retrofit2.Call;
import retrofit2.http.Query;
import retrofit2.http.GET;

// interface for defining a retrofit API client that can be used to make HTTP requests to the OpenWeatherMap API
public interface WeatherApi {
    @GET("weather")
    Call<WeatherSearchResult> getweather(@Query("q") String cityname,
                                         @Query("appid") String apikey);
}
