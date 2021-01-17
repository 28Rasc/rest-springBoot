package com.algaworks.osworks.api.exceptionhandler;

import java.time.LocalDateTime;

public class Problema {

	private Integer status;
	private LocalDateTime dataHora;
	private String titulo;
	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * @return the dataHora
	 */
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	/**
	 * @param dataHora the dataHora to set
	 */
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	} 
}
