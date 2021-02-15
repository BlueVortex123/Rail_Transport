
public class Tren {
	
	public String nume;
	public int numar;
	public String tip;
	public double bilet;
	public String destinatie;
	public  String ora_plecare;
	public String ora_venire;
	public String clasa;
	
	
	public Tren(String nume, int numar, String tip, double bilet, String destinatie, String ora_plecare,
			String ora_venire, String clasa) {
		super();
		this.nume = nume;
		this.numar = numar;
		this.tip = tip;
		this.bilet = bilet;
		this.destinatie = destinatie;
		this.ora_plecare = ora_plecare;
		this.ora_venire = ora_venire;
		this.clasa = clasa;
	}
		
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getNumar() {
		return numar;
	}

	public void setNumar(int numar) {
		this.numar = numar;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public double getBilet() {
		return bilet;
	}

	public void setBilet(double bilet) {
		this.bilet = bilet;
	}

	public String getDestinatie() {
		return destinatie;
	}

	public void setDestinatie(String destinatie) {
		this.destinatie = destinatie;
	}

	public String getOra_plecare() {
		return ora_plecare;
	}

	public void setOra_plecare(String ora_plecare) {
		this.ora_plecare = ora_plecare;
	}

	public String getOra_venire() {
		return ora_venire;
	}

	public void setOra_venire(String ora_venire) {
		this.ora_venire = ora_venire;
	}

	public String getClasa() {
		return clasa;
	}

	public void setClasa(String clasa) {
		this.clasa = clasa;
	}

	
	public String toString() {
		return "Tren [nume=" + nume + ", numar=" + numar + ", tip=" + tip + ", bilet=" + bilet + ", destinatie="
				+ destinatie + ", ora_plecare=" + ora_plecare + ", ora_venire=" + ora_venire + ", clasa=" + clasa + "]";
	}



	
}
