package com.api.weather

import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class WeatherController {

    @GetMapping("/clima")
    fun clime(location: String): ResponseEntity<Any> {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build()
    }
}
