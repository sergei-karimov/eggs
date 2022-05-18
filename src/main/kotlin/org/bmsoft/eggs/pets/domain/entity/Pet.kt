package org.bmsoft.eggs.pets.domain.entity

import java.util.*

data class Pet(
    val id: UUID,
    val name: String,
    val type: Type,
    val kind: Kind
)
