package com.app.androidkt.mqtt

abstract class BaseAbstractMqttInterface<T> {


    var topic : String = "TOPIC"


    var item : String = "ITEM"


    var device : String = "DEVICE"


    var status : T? = null

    fun publishStatus()         {
       publish("$device\\Status\\$item",status.toString())
    }

    fun publish(topic: String, payload:String){

    }
}