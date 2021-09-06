package com.example.courseorganizer.controller

class Controladora{
    private var manejadorUsuarios: ManejoUsuarios = ManejoUsuarios()

    fun iniciarSesion(correo: String, contrasena: String){
        return manejadorUsuarios.iniciarSesion(correo, contrasena)
    }
}