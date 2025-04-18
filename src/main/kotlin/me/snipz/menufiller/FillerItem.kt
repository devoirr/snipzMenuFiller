package me.snipz.menufiller

import org.bukkit.entity.Player

interface FillerItem {

    fun getPlaceholders(player: Player): Map<String, String>
    fun isLocked(player: Player): Boolean

}