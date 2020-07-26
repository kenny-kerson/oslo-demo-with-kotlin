package com.kenny.oslodemowithkotlin.hub.infra

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(value = "\${custom.feign.value}", url = "\${custom.feign.target_url}")
interface BizFeignClient {

    @GetMapping("/demo")
    fun getDemoBiz(): String?

    @GetMapping("/demo/db/{key1}")
    fun getDemoBizForDB( @PathVariable key1: String): Any?
}