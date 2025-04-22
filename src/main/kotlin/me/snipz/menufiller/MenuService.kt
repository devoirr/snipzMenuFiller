package me.snipz.menufiller

import org.slf4j.LoggerFactory

object MenuService : IMenuService {

    val logger = LoggerFactory.getLogger(MenuService::class.java)!!

    private val fillers = mutableMapOf<String, MenuFiller>()

    override fun registerFiller(key: String, filler: MenuFiller) {
        fillers[key] = filler
        logger.info("Registering filler '$key'")
    }

    override fun getFillers(): Map<String, MenuFiller> {
        return fillers
    }
}
