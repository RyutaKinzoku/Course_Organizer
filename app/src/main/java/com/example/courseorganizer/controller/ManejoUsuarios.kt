package com.example.courseorganizer.controller

import com.example.courseorganizer.controller.dao.DAO
import com.example.courseorganizer.model.Usuario

class ManejoUsuarios {
    private var dao: DAO = DAO()

    fun iniciarSesion(correo: String, contrasena: String){
        var usuario = Usuario(correo, contrasena)
        return dao.iniciarSesion(usuario)
    }
}