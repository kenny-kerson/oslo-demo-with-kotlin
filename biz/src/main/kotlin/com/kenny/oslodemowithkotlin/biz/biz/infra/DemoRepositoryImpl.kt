package com.kenny.oslodemowithkotlin.biz.biz.infra

import com.kenny.oslodemowithkotlin.biz.biz.domain.DemoRepository
import com.kenny.oslodemowithkotlin.biz.biz.domain.DemoTable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

interface DemoRepositoryImpl: DemoRepository, JpaRepository<DemoTable, String> {

    override fun findByKey1(key1: String): Optional<DemoTable> {
        return findById(key1);
    }
}