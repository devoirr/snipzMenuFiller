package me.snipz.menufiller

interface IMenuService {

    fun registerFiller(key: String, filler: MenuFiller)
    fun getFillers(): Map<String, MenuFiller>

}