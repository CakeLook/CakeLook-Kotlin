package org.cakelook.cakelook

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class CakeLookApplication

fun main(args: Array<String>) {
    runApplication<CakeLookApplication>(*args)
}
