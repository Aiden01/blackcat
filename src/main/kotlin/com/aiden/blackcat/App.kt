package com.aiden.blackcat
import com.aiden.blackcat.dataclasses.Config
import com.aiden.blackcat.dataclasses.getConfig
import me.aberrantfox.kjdautils.api.dsl.PrefixDeleteMode
import me.aberrantfox.kjdautils.api.startBot

fun main() {
    val config = getConfig() ?: throw Error("Config cannot be loaded")
    startBot(config.token) {
        configure {
            prefix = config.prefix
            deleteMode = PrefixDeleteMode.Double
        }
    }
}
