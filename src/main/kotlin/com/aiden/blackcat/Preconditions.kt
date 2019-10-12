package com.aiden.blackcat

import com.aiden.blackcat.extensions.requiredPermissions
import me.aberrantfox.kjdautils.api.dsl.Precondition
import me.aberrantfox.kjdautils.api.dsl.precondition
import me.aberrantfox.kjdautils.internal.command.Fail
import me.aberrantfox.kjdautils.internal.command.Pass

@Precondition
fun hasPermission() = precondition {
    val permissions = it.container[it.commandStruct.commandName]?.requiredPermissions ?: listOf()
    if (it.message.member!!.hasPermission(permissions)) {
        return@precondition Pass
    }
    return@precondition Fail("Missing permissions to execute this command!")
}