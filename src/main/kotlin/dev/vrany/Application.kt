package dev.vrany

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("dev.vrany")
		.start()
}

