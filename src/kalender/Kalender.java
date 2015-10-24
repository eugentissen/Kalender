package kalender;

import java.util.ArrayList;

public class Kalender {
	private GUI myGui = new GUI();
	private ArrayList<Termin> termine = new ArrayList<Termin>();

	public void show() {
		myGui.showWindow();
	}

	public void addTermin(Termin termin) {
		if (termine.size() > 0) {
			for (int i=0;i<termine.size();i++) {
				//if (termine.get(i).) TODO
			}
		}
		else {
			termine.add(termin);
		}
	}

}
