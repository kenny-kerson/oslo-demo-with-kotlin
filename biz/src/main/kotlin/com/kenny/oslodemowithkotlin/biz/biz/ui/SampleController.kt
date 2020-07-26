package com.kenny.oslodemowithkotlin.biz.biz.ui

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/biz/demo"])
class SampleController {

    @GetMapping
    fun getDemoBiz(): String {
        return "getDemoBiz test call SUCCESS!!"
    }
}