package com.aiden.blackcat.dataclasses

import com.google.gson.Gson
import me.aberrantfox.kjdautils.api.annotation.Data
import java.io.File

@Data("config/config.json")
data class Config(val prefix: String = "!",
                  val token: String,
                  val owners: List<String>)

fun getConfig(): Config? {
    val buffer = File("config/config.json").readText()
    return Gson().fromJson(buffer, Config::class.java)
}