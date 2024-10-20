package org.damc.ejemplo1.modelo;

import java.time.*;

import javax.persistence.*;

import org.openxava.model.*;

import lombok.*;


@Entity @Getter @Setter

public class mascota extends Identifiable{
	private String nombre;
	private String descripcion;
	private String raza;
	private LocalDate fechaNacimiento;

}
