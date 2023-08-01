package com.bestbank.commons.messages.registro;

import com.bestbank.commons.tipos.TipoCliente;
import com.bestbank.commons.tipos.TipoDocumento;

import lombok.Data;

/**
 * Representa una solicitud de cliente.
 * La clase ClienteReq es utilizada para enviar información relacionada a un cliente.
 */
@Data
public class ClienteReqInfoKafKa {
  
  private TipoCliente tipoCliente;
  
  private TipoDocumento tipoDocumento;
  
  private String numDocumento;
  
  private String nombres;
  
  private String apellidos;
  
  private String numeroTelefono;
  
  private String imeiTelefono;
  
  private String emailPersona;
  
}
