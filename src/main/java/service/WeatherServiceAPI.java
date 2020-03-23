package service;

import model.Weather;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface WeatherServiceAPI {
  @GET("/calendars/default/today/")
  @Headers({
      "x-rapidapi-host:weatherapi33.p.rapidapi.com",
      "x-rapidapi-key:Kfba298KTgmshUnvWZ4VsghiZYa5p1KU1AEjsnw86pEJ3gVBTL",
     "Accept: application/json"
  })
  Call<Weather> getWeatherDetails();

}
