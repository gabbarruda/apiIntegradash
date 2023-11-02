package com.senai.apiintegradash.controllers;


import com.senai.apiintegradash.models.UsuarioModel;
import com.senai.apiintegradash.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuarios", produces = {"application/json"})
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;



    @GetMapping
    public ResponseEntity<List<UsuarioModel>> listaUsuario() {
        return ResponseEntity.status(Ht tpStatus.OK).body(usuarioRepository.findAll());
    }
}