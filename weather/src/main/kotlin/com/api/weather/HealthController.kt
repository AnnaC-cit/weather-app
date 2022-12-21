package com.api.weather

import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class HealthController {
    @GetMapping("/health")
    fun health(): ResponseEntity<HttpStatusCode> {
        return ResponseEntity.status(HttpStatus.OK).build()
    }
}
