package me.snipz.menufiller

import org.bukkit.entity.Player

data class MenuFiller(val items: (Player) -> List<FillerItem>)