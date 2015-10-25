package kalender;

import java.util.ArrayList;

public class Kalender {
	private GUI myGui = new GUI();
	private ArrayList<Termin> termine = new ArrayList<Termin>();

	public void show() {
		myGui.setVisible(true);
	}

	public void addTermin(Termin termin) {
		int index = 0;
		if (termine.size() > 0) {
			for (int i=0;i<termine.size();i++) {
				if (termin.before(termine.get(i))) {
					index = i;
					break;
				}
			}
		}
		termine.add(index, termin);
	}

}
