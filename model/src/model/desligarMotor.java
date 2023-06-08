package model;

public class desligarMotor {

	public static void main(String[] args) {
	

	}
	
		public string acelerar(int valor) {
			if(this.motorLigado == true) {
				this.velocidade = this.velocidade + valor;
				return this.modelo + "ACELEROU!!! Velocidade atual:\r\n"
						+ this.velocidade + "Km/h.";
			}else {
				return this.modelo + "ATENÇÃO: Não é possível acelerar\r\n"
						+ "com o motor desligado!";
			}
		}
	
		public string desligarMotor() {
				if ( !this.motorLigado ) {
					return "O motor do " + this.modelo + "ja estava desligado";
				}else {
					if (this.velocidade != 0) {
						return "ATENÇÂO: O motor do " + this.modelo + "nao foi desligado por que o carro esta em movimento";
					}else {
						this.motorLigado = false; // desligar motor
						return "O motor do " + this.modelo + " foi desligado agora.";
					}
				}		
			}
		
		public string LigarMotor() {
			if ( !this.motorLigado ) {
				return "O motor do " + this.modelo + "ja estava desligado";
			}
		}
		
		public int frear(int valor) {
			if (this.LigarMotor == false) {
				return this.modelo + "ATENÇÃO: O motor está desligado! O carro já está parado!";
			}else {
				if(this.velocidade == 0) {
					return this.modelo + "ATENÇÃO: O carro já está parado!";
				}else { // daqui pra frente motor ligado != 0
					if(this.velocidade - valor <= 0 ) {
						this.velocidade = 0; // parando o carro sem deixar ficar um numero negativo
					}else { // daqui pra frente o carro esta ligado , velocidade != 0 = freia mas ainda esta andando
						this.velocidade = this.velocidade - valor;
						return this.modelo + "freio velocidade atual" + this.velocidade + "km/h";
					}
				}
			}
		}
	
	}
