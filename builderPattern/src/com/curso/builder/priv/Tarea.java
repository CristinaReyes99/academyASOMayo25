package com.curso.builder.priv;

import java.util.Date;

public class Tarea {
	
	private final long id;
    private String tarea = "";
    private String descripcion = ""; 
    private String definidaPor = ""; 
    private String asignadaA = ""; 
    private boolean hecho = false;
    private Date fechaLimite;
    
    private Tarea(long id, String tarea, String descripcion, String definidaPor, String asignadaA, boolean hecho,
			Date fechaLimite) {
		super();
		this.id = id;
		this.tarea = tarea;
		this.descripcion = descripcion;
		this.definidaPor = definidaPor;
		this.asignadaA = asignadaA;
		this.hecho = hecho;
		this.fechaLimite = fechaLimite;
	}
	
	public long getId() {
		return id;
	}

	public String getTarea() {
		return tarea;
	}

	public void setTarea(String tarea) {
		this.tarea = tarea;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDefinidaPor() {
		return definidaPor;
	}

	public void setDefinidaPor(String definidaPor) {
		this.definidaPor = definidaPor;
	}

	public String getAsignadaA() {
		return asignadaA;
	}

	public void setAsignadaA(String asignadaA) {
		this.asignadaA = asignadaA;
	}

	public boolean isHecho() {
		return hecho;
	}

	public void setHecho(boolean hecho) {
		this.hecho = hecho;
	}
	
	public Date getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

	@Override
	public String toString() {
		return "Tarea [id=" + id + ", tarea=" + tarea + ", descripcion=" + descripcion + ", definidaPor=" + definidaPor
				+ ", asignadaA=" + asignadaA + ", hecho=" + hecho + ", fechaLimite=" + fechaLimite + "]";
	}
	
	public static class TareaBuilder {
		
		private final long id;
	    private String tarea = "";
	    private String descripcion = ""; 
	    private String definidaPor = ""; 
	    private String asignadaA = ""; 
	    private boolean hecho = false;
	    private Date fechaLimite = new Date();
	    
	    public TareaBuilder(long id) {
	    	this.id = id;
	    }

		public TareaBuilder setTarea(String tarea) {
			this.tarea = tarea;
			return this;
		}

		public TareaBuilder setDescripcion(String descripcion) {
			this.descripcion = descripcion;
			return this;
		}

		public TareaBuilder setDefinidaPor(String definidaPor) {
			this.definidaPor = definidaPor;
			return this;
		}

		public TareaBuilder setAsignadaA(String asignadaA) {
			this.asignadaA = asignadaA;
			return this;
		}

		public TareaBuilder setHecho(boolean hecho) {
			this.hecho = hecho;
			return this;
		}

		public TareaBuilder setFechaLimite(Date fechaLimite) {
			this.fechaLimite = fechaLimite;
			return this;
		}
		
		public Tarea build() {
			return new Tarea(id,tarea,descripcion, definidaPor,
					asignadaA,hecho,fechaLimite);
		}

	}

	
}
