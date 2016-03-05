package com.demo


class CustomBean {

    static scope = 'prototype'

    def userService

    String getName() {
        return name
    }

    void setName(String name) {
        println("Calling Setter:: SettingName : ${name}")
        this.name = name
    }
    String name

    CustomBean(){}

    CustomBean(String name){
        println("Calling Constructor:: SettingName : ${name}")
        this.name = name
    }


}
