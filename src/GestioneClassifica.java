public class GestioneClassifica {
    int num_Max = 10;
    Persona[] gestione = new Persona[num_Max];

    public GestioneClassifica() {
    }

    public GestioneClassifica(Persona[] g) {
        for (int i = 0; i < g.length; i++) {
            if (g[i] != null) {
                gestione[i] = new Persona(g[i].getNome(), g[i].getPunti());
            }
        }
        gestione = riordina(); 
    }

    private Persona[] riordina() {
        Persona[] t = new Persona[num_Max];
        int pos = 0;
        for (int i = 0; i <= 10; i++) {
            for (int r = 0; r < num_Max; r++) {
                if (gestione[r] != null) {
                    if (gestione[r].getPunti() == i) {
                        t[pos] = gestione[r];
                        pos++;
                    }
                }

            }

        }

        return t;
    }

    private int quantePersoneCiSono() {
        int quante = 0;
        for (int index = 0; index < num_Max; index++) {
            if (gestione[index] != null) {
                quante++;
            }
        }
        return quante;
    }

    public int InserisciPersona(Persona p) {
        int ce = -1;
        if (quantePersoneCiSono() < num_Max) {
            gestione[num_Max - 1] = p;
            gestione = riordina();
            ce = 1;

        }
        return ce;
    }

    public int CancellaPersona(String nome) {
        int fatto = -1;
        int i = 0;
        while (fatto == -1 && i < num_Max) {
            if (gestione[i].getNome().equals(nome)) {
                gestione[i] = null;
                gestione = riordina();
                fatto = i;
            } else {
                i++;
            }
        }
        return fatto;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < num_Max; i++) {
            if (gestione[i] != null) {
                s += gestione[i].toString() + "\n";
            }
            
        }
        return s;
    }

    public int CalcoloMedia() {
        int media = 0;
        for (int i = 0; i < num_Max; i++) {
            if (gestione[i]!=null ) {
                media += gestione[i].getPunti();
            }
        }
        media = media / quantePersoneCiSono();
        return media;
    }

    public GestioneClassifica estrazionePersoneconPunteggioInferiore(int punteggio){
        gestione = riordina();
        GestioneClassifica g = new GestioneClassifica();
        int i =0;
        while (this.gestione[i].getPunti() <= punteggio){
            g.gestione[i] = this.gestione[i];
            i++;
        }
        g.gestione = g.riordina();

        return g;
    }


}
