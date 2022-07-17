package me.ash.reader.data.model.account

import androidx.room.TypeConverter

typealias BlockList = List<String>

class BlockListConverters {

    @TypeConverter
    fun toBlockList(blockList: String): BlockList? {
        return blockList?.split(",")
    }

    @TypeConverter
    fun fromBlockList(blockList: BlockList?): String? {
        return blockList?.toString()
    }
}
