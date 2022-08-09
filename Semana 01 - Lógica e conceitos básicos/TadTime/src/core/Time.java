package core;

public class Time {
	private int hora;
	private int minuto;
	private int segundo;
	
	public Time(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public Time(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = 0; 
	}
	
	public Time(int hora) {
		this.hora = hora;
		this.minuto = 0;
		this.segundo = 0;
	}
	
	public void setTime(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public void setTime(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = 0;
	}
	
	public void setTime(int hora) {
		this.hora = hora;
		this.minuto = 0;
		this.segundo = 0;
	}
	
	public String exibirHoraUniversal() {
		return formatarNum(this.hora)+":"+formatarNum(this.minuto)+":"+formatarNum(this.segundo);
	}
	public String exibirHoraPadrao(){
		String sufixo;
		String horaPadrao;
		if (hora == 0) {
			horaPadrao = "12";
			sufixo = "AM";
		}else if (hora == 12){
			horaPadrao = "12";
			sufixo = "PM";
		}else if (hora > 0 && hora < 12) {
			horaPadrao = String.valueOf(formatarNum(hora));
			sufixo = "AM";
		}else {
			horaPadrao = String.valueOf(formatarNum(hora-12));
			sufixo = "PM";
		}
		return horaPadrao + ":"+ formatarNum(this.minuto)+":"+formatarNum(this.segundo)+" "+ sufixo;
	}

	private String formatarNum(int num){
		if (num < 10) {
			return "0"+num;
		}
		return String.valueOf(num);
	}
	
}
