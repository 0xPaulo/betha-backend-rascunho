package com.betha.manutencao.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.betha.manutencao.model.Cadastro;
import com.betha.manutencao.repository.CadastroRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/lista")
@AllArgsConstructor
public class ManutencaoController {

  private final CadastroRepository cadastroRepository;

  @GetMapping
  public List<Cadastro> list() {
    return cadastroRepository.findAll();
  }

}
