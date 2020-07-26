package com.kenny.oslodemowithkotlin.hub.ui

import com.kenny.oslodemowithkotlin.hub.infra.BizFeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/hub/demo"])
class SampleController( private val bizFeignClient: BizFeignClient) {

    @GetMapping
    fun getDemoBiz() {
        val demoCbs = bizFeignClient.getDemoBiz()
        println( "__KENNY__ demoCbs : " + demoCbs.toString())
    }
}