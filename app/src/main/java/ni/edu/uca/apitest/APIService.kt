package ni.edu.uca.apitest

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
    @GET
    fun getARandomDog(): Response<DogResponse>
}