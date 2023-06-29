package esercizio1;

public class Dipendente {

	public static int stipendioDiBase = 1000;

	private String matricola;
	private double stipendio, importoOrarioStraordinario;
	private LivelloDipendente livello;
	private Dipartimento dipartimento;

	public Dipendente(String matricola, Dipartimento dipartimento) {
		this.matricola = matricola;
		this.dipartimento = dipartimento;
		stipendio = stipendioDiBase;
		importoOrarioStraordinario = 30;
		livello = LivelloDipendente.OPERAIO;
	}

	public Dipendente(String matricola, double stipendio, double importoOrarioStraordinario, LivelloDipendente livello,
			Dipartimento dipartimento) {
		this(matricola, dipartimento);
		this.stipendio = stipendio;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		this.livello = livello;

	}

	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}

	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}

	public Dipartimento getDipartimento() {
		return dipartimento;
	}

	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}

	public String getMatricola() {
		return matricola;
	}

	public double getStipendio() {
		return stipendio;
	}

	public LivelloDipendente getLivello() {
		return livello;
	}

	public void stampaDati() {
		System.out.println(this);
	}

	public LivelloDipendente promuovi() {
		switch (this.livello) {
		case OPERAIO: {
			this.livello = LivelloDipendente.IMPIEGATO;
			this.stipendio = stipendioDiBase * 1.2;
			break;
		}
		case IMPIEGATO: {
			this.livello = LivelloDipendente.QUADRO;
			this.stipendio = stipendioDiBase * 1.5;
			break;
		}
		case QUADRO: {
			this.livello = LivelloDipendente.DIRIGENTE;
			this.stipendio = stipendioDiBase * 2;
			break;
		}
		case DIRIGENTE: {
			System.out.println("Il dipendente ha già il livello massimo.");
			break;
		}
		}

		return this.livello;
	}

	@Override
	public String toString() {
		return "Dipendente [matricola=" + matricola + ", stipendio=" + stipendio + ", importoOrarioStraordinario="
				+ importoOrarioStraordinario + ", livello=" + livello + ", dipartimento=" + dipartimento + "]";
	}

	public static double calcolaPaga(Dipendente d) {
		return d.getStipendio();
	}

	public static double calcolaPaga(Dipendente d, int os) {
		return d.getStipendio() + d.getImportoOrarioStraordinario() * os;
	}
}
