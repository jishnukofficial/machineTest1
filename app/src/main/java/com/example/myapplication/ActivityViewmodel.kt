package com.example.myapplication
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.model.LoginResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ActivityViewmodel(private val repository: Repository) : ViewModel() {

    private val _loginResult = MutableLiveData<Boolean>()
    val loginResult: LiveData<Boolean>
        get() = _loginResult

    fun login(username: String, password: String) {
        repository.login(username, password)
            .enqueue(object : Callback<LoginResponse> {
                override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                    _loginResult.value = response.isSuccessful
                }

                override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                    // Handle failure
                }
            })
    }
}
