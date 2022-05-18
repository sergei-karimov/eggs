package org.bmsoft.eggs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EggsApplication

fun main(args: Array<String>) {
	runApplication<EggsApplication>(*args)
}
