/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pedidos")
@Getter
@Setter
public class Pedidos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;
    
    @Column(name = "FECHA-PEDIDO", nullable = false)
    private LocalDate fechaPedido;
    @Column(name = "CANTIDAD", nullable = false)
    private Long cantidad;
    @Column(name = "TOTAL", nullable = false)
    private double total;
    @Column(name = "ESTADO", nullable = false)
    private String Estado;
    @Column(name = "DESCRIPCION", nullable = false)
    private String descripcion;
    
    
}
