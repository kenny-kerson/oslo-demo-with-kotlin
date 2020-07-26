package com.kenny.oslodemowithkotlin.biz.biz.infra

import com.kenny.oslodemowithkotlin.biz.biz.domain.DemoRepository
import com.kenny.oslodemowithkotlin.biz.biz.domain.DemoTable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DemoRepositoryImpl: DemoRepository, JpaRepository<String, DemoTable>{
}