package br.com.alura.screenmatch.service;

public interface IConverteDados {
    //T significa tipogenerico, pois neste caso nao sei o que sera retornado
    <T> T obterDados(String json, Class<T> classe);
}
