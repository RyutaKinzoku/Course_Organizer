package com.example.courseorganizer.model

class Usuario(pCorreo: String, pContrasena: String){
    private var correo: String = pCorreo
        get() = field
        set(value) {field = value}
    private var contrasena: String = pContrasena
        get() = field
        set(value) {field = value}
}