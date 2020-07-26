package com.kenny.oslodemowithkotlin.biz.biz

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BizApplication

fun main(args: Array<String>) {
    runApplication<BizApplication>(*args)
}
