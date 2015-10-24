package kalender;

import java.util.Date;
import java.util.GregorianCalendar;

public class Termin {
	private final Date erstellungsDatum;
	private Date terminDatum;
	private GregorianCalendar cal = new GregorianCalendar();

	public Termin() {
		this.erstellungsDatum = new Date();
		this.terminDatum = null;
	}
	
	public Date getErstellungsDatum() {
		return erstellungsDatum;
	}

	public void setTerminDatum(Date date) {
		this.terminDatum = date;
	}
	
	public boolean isInVergangenheit() {
		return terminDatum.before(new Date());
	}

	public boolean isInZukunft() {
		return terminDatum.after(new Date());
	}
	
	public boolean before(Termin termin) {
		return terminDatum.before(termin.terminDatum);
	}

}
