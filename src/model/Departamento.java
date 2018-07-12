package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_departamento")
public class Departamento {
 @Id
 @GeneratedValue
 @Column(name="DEP_ID")
 private Long id;
 
 @Column(name="DEP_NOMBRE")
 private String nombre;
 
 @OneToMany(mappedBy = "departamento", cascade=CascadeType.PERSIST)
 private List<Empleado> empleados = new ArrayList<Empleado>();
 
 public Departamento(){}
 
 public Departamento(String nombre){
	 
 }
}
