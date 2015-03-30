package geometricshapes;

public class Circle{
	private double xC;
	private double yC;
	private double r;
	
	public Circle(double xC, double yC, double r) {
		this.xC = xC;
		this.yC = yC;
		if(r <= 0) {
			throw new IllegalArgumentException("Il raggio deve essere maggiore di 0.");
		}
		this.r = r;
	}

	public double getXC() {
		return xC;
	}

	public void setXC(double xC) {
		this.xC = xC;
	}

	public double getYC() {
		return yC;
	}

	public void setYC(double yC) {
		this.yC = yC;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		if(r <= 0) {
			throw new IllegalArgumentException("Il raggio deve essere maggiore di 0.");
		}
		this.r = r;
	}
	
	public double getXMin() {
		return (this.xC - this.r);
	}
	
	public double getXMax() {
		return (this.xC + this.r);
	}

	public double getYMin() {
		return (this.yC - this.r);
	}

	public double getYMax() {
		return (this.yC + this.r);
	}

	public boolean contains(Circle c)
	{
		boolean contiene = false;
		if((this.getXMin() <= c.getXMin()) && 
				(this.getYMin() <= c.getYMin()) &&
				(c.getXMax() <= this.getXMax()) &&
				(c.getYMax() <= this.getYMax()))
			contiene = true;
		return contiene;
	}

	@Override
	public String toString() {
		return "Circle [xC=" + xC + ", yC=" + yC + ", r=" + r + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(r);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Circle))
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(r) != Double.doubleToLongBits(other.r))
			return false;
		if (Double.doubleToLongBits(xC) != Double.doubleToLongBits(other.xC))
			return false;
		if (Double.doubleToLongBits(yC) != Double.doubleToLongBits(other.yC))
			return false;
		return true;
	}
}