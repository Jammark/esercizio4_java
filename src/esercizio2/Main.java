package esercizio2;

import esercizio1.Dipartimento;
import esercizio1.Dipendente;
import esercizio1.LivelloDipendente;

public class Main {

	public static void main(String[] args) {
		Dipendente d1 = new Dipendente("A0P5", Dipartimento.PRODUZIONE);
		Dipendente d2 = new Dipendente("A0P4", Dipartimento.PRODUZIONE);
		Dipendente dirigente = new Dipendente("B0T7", 3000.00, 50, LivelloDipendente.DIRIGENTE, Dipartimento.VENDITE);
		Dipendente impiegato = new Dipendente("B0T8", 1400.00, 40, LivelloDipendente.IMPIEGATO,
				Dipartimento.AMMINISTRAZIONE);

		d2.promuovi();
		impiegato.promuovi();

		double total = 0.0;
		Dipendente[] dipendenti = new Dipendente[] { d1, d2, dirigente, impiegato };
		for (int i = 0; i < dipendenti.length; i++) {
			Dipendente d = dipendenti[i];
			d.stampaDati();
			total += Dipendente.calcolaPaga(d, 5);
		}
		System.out.printf("Toale degli stipendi ammonta a %.2f", total);
	}

}
