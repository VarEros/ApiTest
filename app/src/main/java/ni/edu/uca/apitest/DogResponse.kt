package ni.edu.uca.apitest

import com.google.gson.annotations.SerializedName

data class DogResponse(@SerializedName("status") var status:String, @SerializedName("message") var message:String)
