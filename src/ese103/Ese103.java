package ese103;

import geometricshapes.*;

public class Ese103 {

	public static void main(String[] args) throws Exception {
		Circle c;

		// Verifica di Costruttore Circle
		System.out.print("01: Verifica implementazione costruttore di Circle...");
		try {
			c = new Circle(0, 0, 0);
			// Se viene eseguita l'istruzione successiva, non è stata lanciata l'eccezione
			// per il raggio non positivo. L'implementazione sarebbe errata.
			throw new Exception("Errore nell'implementazione di Costruttore di Circle");
		}
		catch(IllegalArgumentException e) {
			System.out.println("superata");
		}
		
		// Verifica di Costruttore e Getter
		System.out.print("02: Verifica implementazione Costruttore e Getter di Circle...");
		c = new Circle(5, 6, 7);
		if(c.getXC() != 5)
			throw new Exception("Errore nell'implementazione di getXC o Costruttore");
		if(c.getYC() != 6)
			throw new Exception("Errore nell'implementazione di getYC o Costruttore");
		if(c.getR() != 7)
			throw new Exception("Errore nell'implementazione di getR o Costruttore");
		System.out.println("superata");
		
		// Verifica di Costruttore e Getter
		System.out.print("03: Verifica implementazione Setter di Circle...");
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
		System.out.print("04: Verifica implementazione setR di Circle...");
		try {
			c.setR(-1);
			// Se viene eseguita l'istruzione successiva, non è stata lanciata l'eccezione
			// per il raggio non positivo. L'implementazione sarebbe errata.
			throw new Exception("Errore nell'implementazione di setR");
		}
		catch(IllegalArgumentException e) {
			System.out.println("superata");
		}		

		//-----------------------------------------------------
		Triangle t;
		// Verifica di Costruttore Circle
		System.out.print("11: Verifica implementazione costruttore di Triangle...");
		try {
			t = new Triangle(0, 0, 0);
			// Se viene eseguita l'istruzione successiva, non è stata lanciata l'eccezione
			// per il raggio non positivo. L'implementazione sarebbe errata.
			throw new Exception("Errore nell'implementazione di Costruttore di Triangle");
		}
		catch(IllegalArgumentException e) {
			System.out.println("superata");
		}
		
		// Verifica di Costruttore e Getter
		System.out.print("12: Verifica implementazione Costruttore e Getter di Triangle...");
		t = new Triangle(5, 6, 7);
		if(t.getXV() != 5)
			throw new Exception("Errore nell'implementazione di getXV o Costruttore");
		if(t.getYV() != 6)
			throw new Exception("Errore nell'implementazione di getYV o Costruttore");
		if(t.getL() != 7)
			throw new Exception("Errore nell'implementazione di getL o Costruttore");
		System.out.println("superata");
		
		// Verifica di Costruttore e Getter
		System.out.print("13: Verifica implementazione Setter di Triangle...");
		t.setXV(10);
		t.setYV(11);
		t.setL(12);
		if(t.getXV() != 10)
			throw new Exception("Errore nell'implementazione di setXV");
		if(t.getYV() != 11)
			throw new Exception("Errore nell'implementazione di setYV");
		if(t.getL() != 12)
			throw new Exception("Errore nell'implementazione di setL");
		System.out.println("superata");
		
		// Verifica di eccezione in setR
		System.out.print("14: Verifica implementazione setL di Triangle...");
		try {
			t.setL(-1);
			// Se viene eseguita l'istruzione successiva, non è stata lanciata l'eccezione
			// per il raggio non positivo. L'implementazione sarebbe errata.
			throw new Exception("Errore nell'implementazione di setL di Circle");
		}
		catch(IllegalArgumentException e) {
			System.out.println("superata");
		}
		
		//-------------------------------------------------------------------------------
		// Verifica di contains
		System.out.println("20: Verifica di contains (manuale)...");
		Circle circleArray[] =  new Circle[3];
		Triangle triangleArray[] =  new Triangle[2];
		
		circleArray[0] = new Circle(0, 0, 1);
		circleArray[1] = new Circle(0.5, 0.5, 0.5);
		circleArray[2] = new Circle(1, 1, 1);
		
		triangleArray[0] = new Triangle(0, 0, 1);
		triangleArray[1] = new Triangle(-2, -2, 4);
		
		System.out.println("I cerchi contengono i triangoli?");
		for(int i=0; i<circleArray.length; i++) {
			c = circleArray[i];
			for(int j=0; j<triangleArray.length; j++) {
				t = triangleArray[j];
				if(c.contains(t))
					System.out.println(c + " contiene " + t);
				else
					System.out.println(c + " NON contiene " + t);
				}
		}
		
		System.out.println("\nI triangoli contengono i cerchi?");
		for(int j=0; j<triangleArray.length; j++) {
			t = triangleArray[j];
			for(int i=0; i<circleArray.length; i++) {
				c = circleArray[i];
			
				if(t.contains(c))
					System.out.println(t + " contiene " + c);
				else
					System.out.println(t + " NON contiene " + c);
				}
		}
	}

}