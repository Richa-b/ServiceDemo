package com.demo

class CustomBean {

    static scope = 'prototype'

    String getName() {
        return name
    }

    void setName(String name) {
        println("Calling Setter")
        this.name = name
    }
    String name


}
