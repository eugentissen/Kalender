package kalender;

import java.util.GregorianCalendar;

public class Termin {
	private final GregorianCalendar erstellungsDatum;
	private GregorianCalendar terminDatum;

	public Termin() {
		erstellungsDatum = new GregorianCalendar();
		terminDatum = null;
	}
	
	public GregorianCalendar getErstellungsDatum() {
		return erstellungsDatum;
	}

	public GregorianCalendar getTerminDatum() {
		return terminDatum;
	}

	public void setTerminDatum(GregorianCalendar date) {
		terminDatum = date;
	}
	
	public boolean isInVergangenheit() {
		return terminDatum.before(new GregorianCalendar());
	}

	public boolean isInZukunft() {
		return terminDatum.after(new GregorianCalendar());
	}
	
	public boolean before(Termin termin) {
		return terminDatum.before(termin.terminDatum);
	}

}
