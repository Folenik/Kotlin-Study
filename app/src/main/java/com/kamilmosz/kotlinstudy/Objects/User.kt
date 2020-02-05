package com.kamilmosz.kotlinstudy.Objects

class User {

    var username = ""
        get() = field
        set(value) { field = value }

}