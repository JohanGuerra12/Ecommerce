package MiTecho.MiTecho.model;

import java.util.Date;

public class Orden {
private Integer id;
private String numero;
private Date FechaCreacion;
private Date FechaRecibido;
private double total;
public Orden() {

}
public Orden(Integer id, String numero, Date fechaCreacion, Date fechaRecibido, double total) {
	super();
	this.id = id;
	this.numero = numero;
	this.FechaCreacion = fechaCreacion;
	this.FechaRecibido = fechaRecibido;
	this.total = total;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNumero() {
	return numero;
}
public void setNumero(String numero) {
	this.numero = numero;
}
public Date getFechaCreacion() {
	return FechaCreacion;
}
public void setFechaCreacion(Date fechaCreacion) {
	this.FechaCreacion = fechaCreacion;
}
public Date getFechaRecibido() {
	return FechaRecibido;
}
public void setFechaRecibido(Date fechaRecibido) {
	this.FechaRecibido = fechaRecibido;
}
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}
@Override
public String toString() {
	return "Orden [id=" + id + ", numero=" + numero + ", FechaCreacion=" + FechaCreacion + ", FechaRecibido="
			+ FechaRecibido + ", total=" + total + "]";
}

 	
 	
}
