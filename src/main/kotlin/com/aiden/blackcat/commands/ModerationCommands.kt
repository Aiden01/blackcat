package com.aiden.blackcat.commands
import me.aberrantfox.kjdautils.api.dsl.command.CommandSet
import me.aberrantfox.kjdautils.api.dsl.command.commands
import me.aberrantfox.kjdautils.internal.arguments.SentenceArg
import me.aberrantfox.kjdautils.internal.arguments.UserArg

@CommandSet("Moderation")
fun moderationCommands() = commands {
    command("Ban") {
        description = "Bans a user"
        execute(UserArg, SentenceArg.makeOptional("No reason specified")) {
            val (user, reason) = it.args
        }
    }
}