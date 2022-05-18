package org.bmsoft.eggs.pets.entrypoint

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Pets {
    @GetMapping
    fun getAllPets(): List<Pets> {
        return emptyList();
    }
}
