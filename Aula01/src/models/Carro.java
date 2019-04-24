package models;

public class Carro {
	
	private String cor;
	private String modelo;
	private Double velocidadeAtual;
	private Double velocidadeMaxima;
	private boolean ligado;
	
	public Carro() {}
	
	public Carro(String cor, String modelo, Double velocidadeMaxima) {
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeAtual = 0.0;
		this.velocidadeMaxima = velocidadeMaxima;
		this.ligado = false;
	}

	public void liga() {
		ligado = true;
	}
	
	public void desliga() {
		ligado = false;
	}

	public void acelera(Double valor) {
		this.velocidadeAtual = velocidadeAtual + valor;
	}
	public Double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(Double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public String getCor() {
		return cor;
	}

	public String getModelo() {
		return modelo;
	}

	public Double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public boolean isLigado() {
		return ligado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + (ligado ? 1231 : 1237);
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((velocidadeAtual == null) ? 0 : velocidadeAtual.hashCode());
		result = prime * result + ((velocidadeMaxima == null) ? 0 : velocidadeMaxima.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		if (cor == null) {
			if (other.cor != null)
				return false;
		} else if (!cor.equals(other.cor))
			return false;
		if (ligado != other.ligado)
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (velocidadeAtual == null) {
			if (other.velocidadeAtual != null)
				return false;
		} else if (!velocidadeAtual.equals(other.velocidadeAtual))
			return false;
		if (velocidadeMaxima == null) {
			if (other.velocidadeMaxima != null)
				return false;
		} else if (!velocidadeMaxima.equals(other.velocidadeMaxima))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String estado = (ligado) ? "ligado" : "desligado";
		
		return "Este " + modelo + " " + cor + " tem a velocidade atual de " + velocidadeAtual
				+ ", anda numa velocidade máxima de " + velocidadeMaxima + ", e está " + estado + "!";
	}
}
