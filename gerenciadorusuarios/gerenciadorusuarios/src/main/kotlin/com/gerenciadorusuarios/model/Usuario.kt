package com.gerenciadorusuarios.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import org.hibernate.validator.constraints.br.CPF
import org.springframework.format.annotation.DateTimeFormat

@Entity
data class Usuario (

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    //Anotação do Validation - Dependência
    @field:NotBlank(message = "Nome é obrigatório")
    val nome: String = "",

    @field:NotBlank(message = "E-mail é obrigatório")
    @field:Email(message = "E-mail inválido")
    val email: String = "",

    @field:NotBlank(message = "CPF é obrigatório")
    @field:CPF(message = "CPF inválido")
    val cpf: String = "",

    @field:NotBlank(message = "Data de Nascimento é obrigatória")
    val dataNascimento: String = "",

    @field:NotBlank(message = "Perfil é obrigatório")
    val perfil: String = "",


){

}