import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import models.Carro;

public class Main {

	public static void main(String[] args) {
		System.out.println("AULA 01 - INÍCIO\n");
		
		Carro fusca = new Carro("Azul", "Fusca", 80.0);
		
		fusca.liga();
		fusca.acelera(20.0);
		fusca.acelera(5.0);
		
		System.out.println(fusca);
		
		
		Carro[] frotaUber = {new Carro("Prata", "Cobalt", 180.0), new Carro("Preto", "Fox", 140.0)};
		List<Carro> frotaBlack = new ArrayList<>();
		
		for (Carro carro : frotaUber) {
			frotaBlack.add(carro);
		}
		
		for (Carro carro : frotaBlack) {
			System.out.println(carro);
		}
		
		int aleatorio = new Random().nextInt(frotaBlack.size());
		
		System.out.println("\nO seu carro é:\n" + frotaBlack.get(aleatorio).getModelo() + " cor " + frotaBlack.get(aleatorio).getCor());
		
		System.out.println("\nAULA 01 - FIM");
	}
}
