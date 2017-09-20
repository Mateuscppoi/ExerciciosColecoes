package br.com.db1.start;

public class Carros implements Comparable<Carros>{
	private Integer ano;
	private String modelo;
	private String marca;
	private String placa;
	
	public Carros (Integer ano, String modelo, String marca, String placa) {
		this.ano = ano;
		this.modelo = modelo;
		this.marca = marca;
		this.placa = placa;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	@Override
	public int compareTo(Carros outroCarro) {
		if (this.getAno() < outroCarro.getAno()) {
			return -1;
		}
		if (this.getAno() > outroCarro.getAno()) {
			return 1;
		}
		return 0;
	}
}
