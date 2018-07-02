package io.github.ranolp.mfsjeamc.sender

import io.github.ranolp.mfsjea.ConversionResult
import io.github.ranolp.mfsjeamc.Chatter
import org.bukkit.event.player.AsyncPlayerChatEvent

internal object HideMessageSender : MessageSender {
    override fun sendMessage(
        sender: Chatter,
        event: AsyncPlayerChatEvent,
        original: String,
        converted: ConversionResult
    ) {
        event.message = converted.sentence
    }
}
