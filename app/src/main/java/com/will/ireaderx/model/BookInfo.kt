package com.will.ireaderx.model

import com.will.ireaderx.common.Util
import java.io.File

/**
 * created  by will on 2019/12/15 11:30
 */
open class BookInfo() {

    var name = ""
    var size = "0.00b"
    var path = ""
    var readPosition = 0L;
    var encoding = "gbk"
    var lastReadTime = ""
    init {
        println("initializing a BookInfo instance")
    }
    constructor(book: File): this(){
        name = book.name;
        size = Util.getFileLengthText(book.length())
        path = book.path
    }

    protected fun mockData(size :Int = 10) : Array<BookInfo>{
        return Array(size){
            val info = BookInfo();
            info.name = it.toString()
            info.size = "$it mb"
            info.path = "/sdcard/$it /.txt"
            info
        }
    }


}