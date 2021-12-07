package com.example.scrambler

import androidx.databinding.ObservableField

class ScramblerViewModel {
    var fieldA: ObservableField<String> = ObservableField("3")
    var fieldResult: ObservableField<String> = ObservableField("0")

    fun encrypt(message:String,s:Int=1):String{
        var encrpt:String = ""
        for(m in message){
            if(m.isLetter() && m.isUpperCase())
                encrpt+=((m + s - 65).code % 26 + 65).toChar()

            else if(m.isLetter() && m.isLowerCase())
                encrpt+=((m + s - 97).code % 26 + 97).toChar()

            else
                encrpt+=m
        }
        return encrpt
    }
}