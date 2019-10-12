package com.aiden.blackcat.extensions

import me.aberrantfox.kjdautils.api.dsl.command.Command
import net.dv8tion.jda.api.Permission

private val permissions: MutableMap<Command, List<Permission>> = mutableMapOf()

/**
 * Allow setting .permission on DSL
 */
var Command.requiredPermissions: List<Permission>
    get() = permissions[this] ?: listOf()
    set(perms) { permissions[this] = perms }