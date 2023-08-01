package com.bestbank.commons.tipos;

/**
 * Enumeración que define los diferentes tipos de documentos de identificación.
 */
public enum TipoDocumento {
  
  DNI("Documento Nacional de Identidad"),
  CE("Carnet de Extranjeria"),
  PAS("Pasaporte");
  
  private String descripcion;
  
  TipoDocumento(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getDescripcion() {
    return descripcion;
  }

}
