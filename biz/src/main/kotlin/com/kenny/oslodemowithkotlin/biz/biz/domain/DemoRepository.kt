package com.kenny.oslodemowithkotlin.biz.biz.domain

import java.util.*

interface DemoRepository {
    fun findByKey1( key1: String ): Optional<DemoTable>
}