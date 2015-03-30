package ese103;

import geometricshapes.*;

public class Ese103 {

	public static void main(String[] args) throws Exception {
		Circle c = null;
		
		// Verifica di Costruttore
		System.out.print("01: Verifica implementazione costruttore...");
		try {
			c = new Circle(0, 0, 0);
			// Se viene eseguita l'istruzione successiva, non è stata lanciata l'eccezione
			// per il raggio non positivo. L'implementazione sarebbe errata.
			throw new Exception("Errore nell'implementazione di Costruttore");
		}
		catch(IllegalArgumentException e) {
			System.out.println("superata");
		}
		
		// Verifica di Costruttore e Getter
		System.out.print("02: Verifica implementazione Costruttore e Getter...");
		c = new Circle(5, 6, 7);
		if(c.getXC() != 5)
			throw new Exception("Errore nell'implementazione di getXC o Costruttore");
		if(c.getYC() != 6)
			throw new Exception("Errore nell'implementazione di getYC o Costruttore");
		if(c.getR() != 7)
			throw new Exception("Errore nell'implementazione di getR o Costruttore");
		System.out.println("superata");
		
		// Verifica di Costruttore e Getter
		System.out.print("03: Verifica implementazione Setter...");
		c.setXC(10);
		c.setYC(11);
		c.setR(12);
		if(c.getXC() != 10)
			throw new Exception("Errore nell'implementazione di setXC");
		if(c.getYC() != 11)
			throw new Exception("Errore nell'implementazione di setYC");
		if(c.getR() != 12)
			throw new Exception("Errore nell'implementazione di setR");
		System.out.println("superata");
		
		// Verifica di eccezione in setR
		System.out.print("04: Verifica implementazione setR...");
		try {
			c.setR(-1);
			// Se viene eseguita l'istruzione successiva, non è stata lanciata l'eccezione
			// per il raggio non positivo. L'implementazione sarebbe errata.
			throw new Exception("Errore nell'implementazione di setR");
		}
		catch(IllegalArgumentException e) {
			System.out.println("superata");
		}
		
		// Verifica di contains
		System.out.println("05: Verifica implementazione contains (manuale)...");
		Circle circleArray[] =  new Circle[3];
		
		circleArray[0] = new Circle(0, 0, 1);
		circleArray[1] = new Circle(0.5, 0.5, 0.5);
		circleArray[2] = new Circle(1, 1, 1);
		
		Circle a, b;
		
		for(int i=0; i<circleArray.length; i++) {
			a = circleArray[i];
			b = circleArray[(i+1) % circleArray.length];
			if(a.contains(b))
				System.out.println(a + " contiene " + b);
			else
				System.out.println(a + " NON contiene " + b);
		}
	}

}