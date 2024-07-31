package com.vishu.chatapp

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LCViewModel @Inject constructor(
   private val auth : FirebaseAuth

) : ViewModel() {
         init {

            }



    fun signUp(name: String , number : String , email: String ,  password: String ){
        auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener {

            if (it.isSuccessful){
                Log.d("TAG", "signInWithEmail:success")
            }else{
                Log.d("TAG", "signInWithEmail:failure", it.exception)
            }

        }
    }

}