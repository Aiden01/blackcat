package com.aiden.blackcat.commands

import com.aiden.blackcat.extensions.requiredPermissions
import com.aiden.blackcat.services.ConfigService
import me.aberrantfox.kjdautils.api.dsl.command.CommandSet
import me.aberrantfox.kjdautils.api.dsl.command.commands
import me.aberrantfox.kjdautils.internal.arguments.WordArg
import net.dv8tion.jda.api.Permission

@CommandSet("Config")
fun configCommands(configService: ConfigService) = commands {
    command("SetPrefix") {
        description = "Sets the prefix of the bot"
        requiredPermissions = listOf(Permission.ADMINISTRATOR)
        execute(WordArg) {
            val prefix = it.args.first
            configService.setPrefix(prefix)
            it.respond("The prefix is now: **$prefix**")
        }
    }
}