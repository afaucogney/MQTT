package com.app.androidkt.mqtt

import org.json.JSONObject

class SensorMqttManager<S>(var contract: IBaseMqttContract, defaultStatus: S) {
    var status: S = defaultStatus

    fun buildStatusTopic(): String {
        return "$contract.device\\Status\\$contract.name"
    }

    fun buildStatusPayLoad(): String {
        return JSONObject()
                .apply {
                    put("status", "$status")
                }
                .toString()

    }

    
}