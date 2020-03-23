import model.Celebrations;
import model.Countries;
import model.Stat;
import model.Weather;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import service.CovidServiceAPI;
import service.WeatherServiceAPI;

import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";

  public static void main(String[] args) throws IOException {

//    String BASE_URL = "https://coronavirus-monitor.p.rapidapi.com/";
//
//    Retrofit.Builder builder = new Retrofit.Builder()
//        .baseUrl(BASE_URL)
//        .addConverterFactory(GsonConverterFactory.create());
//    Retrofit retrofit = builder.build();
//    CovidServiceAPI covidServiceAPI = retrofit.create(CovidServiceAPI.class);
//    Call<Countries> call = covidServiceAPI.getInfectedCountries();
//



    String BASE_URL2 = "https://weatherapi33.p.rapidapi.com/";

    Retrofit.Builder builder2 = new Retrofit.Builder()
        .baseUrl(BASE_URL2)
        .addConverterFactory(GsonConverterFactory.create());
    Retrofit retrofit2 = builder2.build();
    WeatherServiceAPI weatherServiceAPI = retrofit2.create(WeatherServiceAPI.class);

    Call<Weather> call2 = weatherServiceAPI.getWeatherDetails();


  //  Weather weather = call2.execute().body();

    call2.enqueue(new Callback<Weather>() {
      @Override
      public void onResponse(Call<Weather> call, Response<Weather> response) {
        System.out.println(response.body());
        for(Celebrations c: response.body().getList()){
          System.out.println(c.getTitle()+" "+ c.getColour());
        }


      }

      @Override
      public void onFailure(Call<Weather> call, Throwable t) {
        System.out.println(t.getMessage());
      }
    });

  // System.out.println(weather);

    //CovidServiceAPI covidServiceAPI = retrofit.create(CovidServiceAPI.class);
    //Call<Countries> call = covidServiceAPI.getInfectedCountries();



    //synchroninis BLOKUOS PAGRINDINI PROCESA
    //Countries countries = call.execute().body();
    //System.out.println(countries);


//    call.enqueue(new Callback<Countries>() {
//      @Override
//      public void onResponse(Call<Countries> call, Response<Countries> response) {
//          if(response.isSuccessful() && response.body() != null){
//            Countries countries = response.body();
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("NURODYKITE SAVO SALI:");
//            String my_country = scanner.next();
//            for(Stat s: countries.getCountries_stat()){
//              if(s.getCountry_name().toUpperCase().equals(my_country.toUpperCase())){
//                System.out.println(ANSI_BLUE+s.getCountry_name()+ANSI_RESET);
//                System.out.println("Uzsikretusiu: "+ANSI_YELLOW+s.getActive_cases()+ANSI_RESET);
//                System.out.println("Mirciu:"+ANSI_RED+s.getDeaths()+ANSI_RESET);
//                System.out.println("Isgydytu:"+ANSI_GREEN+s.getTotal_recovered()+ANSI_RESET);
//                System.out.println("--------------------------------------------------------------------------------------");
//              }
//            }
//            int counter = 0;
//            System.out.println("NURODYKITE KIEK SALIU NORITE ISVESTI I EKRANA:");
//            int howMany = scanner.nextInt();
//            for(Stat s: countries.getCountries_stat()){
//              if(counter < howMany){
//              System.out.println(ANSI_BLUE+s.getCountry_name()+ANSI_RESET);
//                System.out.println("Uzsikretusiu: "+ANSI_YELLOW+s.getActive_cases()+ANSI_RESET);
//                System.out.println("Mirciu:"+ANSI_RED+s.getDeaths()+ANSI_RESET);
//                System.out.println("Isgydytu:"+ANSI_GREEN+s.getTotal_recovered()+ANSI_RESET);
//                System.out.println("--------------------------------------------------------------------------------------");
//              }
//              counter++;
//            }
//
//
//
//
//
//
//
//          }
//      }
//
//      @Override
//      public void onFailure(Call<Countries> call, Throwable t) {
//        System.out.println(t.getMessage());
//      }
//    });
//



  }
}
