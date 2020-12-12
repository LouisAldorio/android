package com.example.peoplecounterapp

fun main(){
    var samsungS20Ultra = MobilePhone("Android","Samsung","Galaxy S20 Ultra")
    print(samsungS20Ultra.battery)
    samsungS20Ultra.chargeBattery(50)
    print(samsungS20Ultra.battery)
    
}

class MobilePhone(osName : String,brand: String, model : String){
    init {
        println("$osName , $brand , $model")
    }

    var battery = 30

    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }

    fun chargeBattery(chargedBy: Int){
        println("Battery was at $battery and is at ${battery+chargedBy} now")
        battery += chargedBy
    }
}