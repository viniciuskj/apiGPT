package com.chatgpt.chatgpt.usuario;

import java.util.Date;

public class Usuario {
    private String id;
    private String nome;
    private Date dataNascimento;
    private double altura;
    private double peso;
    private String genero;
    private double tempoMedioExerciciosPorMinuto;
    private boolean possuiDoencaNaFamilia;


    public Usuario(String id, String nome, Date dataNascimento, double altura, double peso, String genero,
                   double tempoMedioExerciciosPorMinuto, boolean possuiDoencaNaFamilia) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
        this.genero = genero;
        this.tempoMedioExerciciosPorMinuto = tempoMedioExerciciosPorMinuto;
        this.possuiDoencaNaFamilia = possuiDoencaNaFamilia;
    }




    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getGenero() {
        return genero;
    }

    public double getTempoMedioExerciciosPorMinuto() {
        return tempoMedioExerciciosPorMinuto;
    }

    public boolean isPossuiDoencaNaFamilia() {
        return possuiDoencaNaFamilia;
    }




    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTempoMedioExerciciosPorMinuto(double tempoMedioExerciciosPorMinuto) {
        this.tempoMedioExerciciosPorMinuto = tempoMedioExerciciosPorMinuto;
    }

    public void setPossuiDoencaNaFamilia(boolean possuiDoencaNaFamilia) {
        this.possuiDoencaNaFamilia = possuiDoencaNaFamilia;
    }

}
