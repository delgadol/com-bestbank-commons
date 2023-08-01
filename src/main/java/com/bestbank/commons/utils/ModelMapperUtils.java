package com.bestbank.commons.utils;

import org.modelmapper.ModelMapper;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Clase de utilidad que proporciona métodos para mapear objetos entre diferentes 
 * modelos utilizando ModelMapper.
 * 
 */

public class ModelMapperUtils {
  
  private static final ModelMapper modelMapper = new ModelMapper();

  public static <S, T> Mono<T> mapToMono(Mono<S> source, Class<T> targetClass) {
    return source.map(s -> map(s, targetClass));
  }
  
  public static <S, T> Flux<T> mapToFlux(Flux<S> source, Class<T> targetClass) {
    return source.map(s -> map(s, targetClass));
  }

  public static <S, T> T map(S source, Class<T> targetClass) {
    return modelMapper.map(source, targetClass);
  }
  
  private ModelMapperUtils() {
    
  }
  
}
