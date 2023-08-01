package com.bestbank.commons.messages.registro;

import com.bestbank.commons.tipos.TipoCliente;
import com.bestbank.commons.tipos.TipoDocumento;
import com.bestbank.commons.tipos.TipoEstadoFinaciero;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * Clase que representa a un cliente y que implementa la interfaz Serializable.
 */

@Data
public class ClienteInfoKafka  implements Serializable {
  
  private static final long serialVersionUID = 3816734689501931947L;

  private String id;
  
  private String secCtrl;
  
  private TipoCliente tipoCliente;
  
  private TipoDocumento tipoDocumento;
  
  private String numDocumento;
  
  private String nombres;
  
  private String apellidos;
  
  private String estado;
  
  private TipoEstadoFinaciero estadoFinanciero;
  
  private Integer indEliminado;
  
  private Date fechaRegistro;
  
  private Date fechaModificacion;  
  
  private String numeroTelefono;
  
  private String imeiTelefono;
  
  private String emailPersona;
  
  private Integer indMonedero;

}