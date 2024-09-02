package br.com.bruno.layout.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Task {

  public Task(Long id, String nome, String cargo, Date dataContratacao) {
    this.id = id;
    this.nome = nome;
    this.cargo = cargo;
    this.dataContratacao = dataContratacao;
  }

  public Task() {
  }

  private Long id;
  private String nome;
  private String cargo;

  @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
  private Date dataContratacao;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public Date getDataContratacao() {
    return dataContratacao;
  }

  public void setDataContratacao(Date dataContratacao) {
    this.dataContratacao = dataContratacao;
  }

}
