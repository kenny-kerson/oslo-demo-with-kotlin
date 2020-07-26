package com.kenny.oslodemowithkotlin.biz.biz.ui

import com.kenny.oslodemowithkotlin.biz.biz.domain.DemoRepository
import com.kenny.oslodemowithkotlin.biz.biz.domain.DemoTable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.lang.Exception

@RestController
@RequestMapping(value = ["/biz/demo"])
class SampleController( private val demoRepository: DemoRepository ) {

    @GetMapping
    fun getDemoBiz(): String {
        return "getDemoBiz test call SUCCESS!!"
    }

    @GetMapping("/db/{key1}")
    fun getDemoBizForDB( @PathVariable key1: String ): DemoTable {
        val demoTable = demoRepository.findByKey1(key1).orElse(DemoTable())
        println( "__KENNY__ demoTable : " + demoTable.toString() )
        return demoTable
    }
}
