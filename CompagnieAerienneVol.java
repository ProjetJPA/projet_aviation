package JPAClass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CompagnieAerienneVol {
	
	@Id
	@GeneratedValue
	private Long id_CompagnieAerienneVol;
	
	private String numero;
	
	@ManyToOne
	@JoinColumn(name="CompagnieAerienne_ID")
	private CompagnieAerienne compagnieAerienne;

	@ManyToOne
	@JoinColumn(name="Vol_ID")
	private Vol vol;
	
	public CompagnieAerienneVol(){
		
	}

	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public CompagnieAerienne getCompagnieAerienne() {
		return compagnieAerienne;
	}


	public void setCompagnieAerienne(CompagnieAerienne compagnieAerienne) {
		this.compagnieAerienne = compagnieAerienne;
	}


	public Vol getVol() {
		return vol;
	}


	public void setVol(Vol vol) {
		this.vol = vol;
	}
}
