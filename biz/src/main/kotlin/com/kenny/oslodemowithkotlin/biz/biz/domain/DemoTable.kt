package com.kenny.oslodemowithkotlin.biz.biz.domain

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class DemoTable {
    @Id
    lateinit var key1: String
    lateinit var val1: String
    lateinit var val2: String
}