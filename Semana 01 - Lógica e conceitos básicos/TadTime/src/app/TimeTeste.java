package app;
import core.Time;

public class TimeTeste {
	public static void main(String args[]) {
		Time t = new Time (0,28,14);
		
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
		
		t.setTime(8,25);
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
		
		t.setTime(16,14,28);
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
		
		t.setTime(12, 12, 10);
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
	}
}
