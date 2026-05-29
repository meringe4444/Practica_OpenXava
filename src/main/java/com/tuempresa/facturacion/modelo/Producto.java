package com.tuempresa.facturacion.modelo;

import java.math.BigDecimal;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Producto {

    @Id
    @Column(length = 6)
    int numero;

    @Column(length = 50)
    @Required
    String descripcion;

    @ManyToOne(
        fetch = FetchType.LAZY,
        optional = true)
    @DescriptionsList
    Categoria categoria;

    @Money
    BigDecimal precio;

    @Files
    @Column(length = 32)
    String fotos;

    @TextArea
    String observaciones;

}
