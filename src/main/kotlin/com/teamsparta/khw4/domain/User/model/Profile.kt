package com.teamsparta.khw4.domain.User.model

import jakarta.persistence.Column
import jakarta.persistence.Embeddable


@Embeddable
data class Profile(
    @Column(name = "name")
    var name: String = "",

)