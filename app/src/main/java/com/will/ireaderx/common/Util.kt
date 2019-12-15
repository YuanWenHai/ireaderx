package com.will.ireaderx.common

import kotlin.math.pow

/**
 * created  by will on 2019/12/15 15:26
 */
class Util {

    companion object {
        fun getFileLengthText(length: Long):String{
            val units = arrayOf("byte","kb","mb","gb","tb")

            val base = kotlin.math.log10(1024.0)
            val index = (kotlin.math.log10(length.toDouble())/base).toInt()
            val number = length/ 1024.0.pow(index)
            return number.toString()+units[index]
        }
    }
}