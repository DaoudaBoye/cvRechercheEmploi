package sn.esmt.employe.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import sn.esmt.employe.model.CvEntities;

public interface CvApi {

    @GET("/all")
    Call<List<CvEntities>> getAllCvEntities();

    @POST
    @GET("/save")
    Call<List<CvEntities>> save(@Body CvEntities cvEntities);

}
