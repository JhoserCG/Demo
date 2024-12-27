
package com.prueba.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cliente")
@Getter
@Setter
public class Clientes {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    @Column(name = "NOMBRE", nullable = false)
    private String nombre;
    @Column(name = "APELLIDOS", nullable = false)
    private String apellidos;
    @Column(name = "Telefono", nullable = false)
    private String telefono;
    @Column(name = "CORREO", nullable = false)
    private String correo;
    @Column(name = "DIRECCION", nullable = false)
    private String direccion;
    @Column(name = "FECHA-REGISTRO", nullable = false)
    private LocalDate fechaRegistro;
    
    @ManyToOne(optional = false )
    @JoinColumn(name = "idPedido")
    private Pedidos pedido;
    
    @ManyToOne(optional = false )
    @JoinColumn(name = "idProducto")
    private Producto producto;
}
