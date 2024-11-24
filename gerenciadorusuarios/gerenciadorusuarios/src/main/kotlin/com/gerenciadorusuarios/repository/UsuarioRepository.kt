package com.gerenciadorusuarios.repository

import com.gerenciadorusuarios.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepository : JpaRepository<Usuario, Long> {
}