package br.com.pontes.jogodamemoria;

import java.util.ArrayList;
import java.util.List;

public class Controle {

    private final int totalDeCartas = 24;
    List<Carta> listaCartasTemporarias = new ArrayList<Carta>();
    List<Carta> listaCartasTemporarias_copia = new ArrayList<Carta>();
    private Carta[] vetorCartas = new Carta[totalDeCartas];

    public void popularlista(){
        this.listaCartasTemporarias.add(new Carta(R.drawable.alisson));
        this.listaCartasTemporarias.add(new Carta(R.drawable.arrascaeta));
        this.listaCartasTemporarias.add(new Carta(R.drawable.cristiano_ronaldo));
        this.listaCartasTemporarias.add(new Carta(R.drawable.de_bruyne));
        this.listaCartasTemporarias.add(new Carta(R.drawable.lewandowski));
        this.listaCartasTemporarias.add(new Carta(R.drawable.mbappe));
        this.listaCartasTemporarias.add(new Carta(R.drawable.messi));
        this.listaCartasTemporarias.add(new Carta(R.drawable.modric));
        this.listaCartasTemporarias.add(new Carta(R.drawable.neymar));
        this.listaCartasTemporarias.add(new Carta(R.drawable.ochoa));
        this.listaCartasTemporarias.add(new Carta(R.drawable.son));
        this.listaCartasTemporarias.add(new Carta(R.drawable.vinicius_jr));
    }

    public void setVetorCartas(Carta carta, int i) {
        this.vetorCartas[i] = carta;
    }

    public Carta getVetorCartas(int i) {
        return vetorCartas[i];
    }

    public Carta sortear(){
        int indice;
        Carta c;

        if (listaCartasTemporarias.size > 0) {
            indice = (int) (Math.random()*this.listaCartasTemporarias.size());
            c = listaCartasTemporarias.get(indice);
            listaCartasTemporarias_copia.add(c)
            listaCartasTemporarias.remove(indice);
        } else {
            indice = (int) (Math.random()*this.listaCartasTemporarias_copia.size());
            c = listaCartasTemporarias_copia.get(indice);
            listaCartasTemporarias_copia.remove(indice);
        }
        
        return c;
    }
}
