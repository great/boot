package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class DemoApplication {
	@GetMapping
	fun hello() = "Hello, World!"
}

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
