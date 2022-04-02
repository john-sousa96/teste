package entities;

public class Notas {
	
	public double n1, n2, n3;
	public double media;
	public String result;
	
	public double Media() {
		
		
		media = ((n1 * 100 / 30) + (n2 * 100 / 35) + (n3 * 100 / 35))/ 3;
		
		return media;
	}
	
	public String Result () {
		if (media >= 60) {
			result = "Pass";
		}else {
			result = "Failed: " 
					+ "Missing "
					+ String.valueOf(100.00 - media)
					+ " Points";
		}
		
		return result;
	}
	
	public String toString() {
		return "Final Grade "
				+ media
				+ " "
				+ result;
	}

	
}
