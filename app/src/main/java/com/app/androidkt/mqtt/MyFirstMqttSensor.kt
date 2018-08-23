package com.app.androidkt.mqtt

class MyFirstMqttSensor : IBaseMqttContract {
    override val name="SENSOR"
    override val device= "DROID"

    val manager = SensorMqttManager<SensorStatus>(SensorStatus.OFF)

}