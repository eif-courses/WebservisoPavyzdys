package service;

import model.Countries;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface CovidServiceAPI {
// HTTP REQUEST
  @Headers({
      "x-rapidapi-host:coronavirus-monitor.p.rapidapi.com",
      "x-rapidapi-key:Kfba298KTgmshUnvWZ4VsghiZYa5p1KU1AEjsnw86pEJ3gVBTL"
  })

  @GET("coronavirus/cases_by_country.php")
  Call<Countries> getInfectedCountries();






}
