package com.example

class B {

    String col1
    String col2

    static belongsTo = [a:A]

    static hasMany = [c: C]

    static constraints = {
    }
}
