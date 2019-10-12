package com.aiden.blackcat.services

import com.aiden.blackcat.dataclasses.Config
import me.aberrantfox.kjdautils.api.annotation.Service
import me.aberrantfox.kjdautils.discord.Discord
import me.aberrantfox.kjdautils.internal.di.PersistenceService

@Service
open class ConfigService(val config: Config, private val discord: Discord, private val store: PersistenceService) {

    fun setPrefix(prefix: String) {
        discord.configuration.prefix = prefix
        save()
    }

    fun save() = store.save(config)
}