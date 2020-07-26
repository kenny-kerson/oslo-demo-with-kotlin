package com.kenny.oslodemowithkotlin.hub.common

import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.Configuration

@Configuration
@EnableFeignClients(basePackages = ["com.kenny.oslodemowithkotlin.hub.infra"])
class OpenFeignConfig {
}