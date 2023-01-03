package br.com.pontes.jogodamemoria;

import java.util.ArrayList;
import java.util.List;

public class Controle {

    private final int totalDeCartas = 24;
    private byte totalCartasUsadas = 0;
    private List<Carta> listaCartasTemporarias = new ArrayList<Carta>();
    private List<Carta> listaCartasTemporarias_copia = new ArrayList<Carta>();
    private Carta[] vetorCartas = new Carta[totalDeCartas];

    public void popularlista(){

        this.listaCartasTemporarias.add(new Carta(R.drawable.afeganistao));
        this.listaCartasTemporarias.add(new Carta(R.drawable.africa_do_sul));
        this.listaCartasTemporarias.add(new Carta(R.drawable.alemanha));
        this.listaCartasTemporarias.add(new Carta(R.drawable.andorra));
        this.listaCartasTemporarias.add(new Carta(R.drawable.angola));
        this.listaCartasTemporarias.add(new Carta(R.drawable.antigua));
        this.listaCartasTemporarias.add(new Carta(R.drawable.argelia));
        this.listaCartasTemporarias.add(new Carta(R.drawable.argentina));
        this.listaCartasTemporarias.add(new Carta(R.drawable.armenia));
        this.listaCartasTemporarias.add(new Carta(R.drawable.australia));
        this.listaCartasTemporarias.add(new Carta(R.drawable.bareine));
        this.listaCartasTemporarias.add(new Carta(R.drawable.belgica));
        this.listaCartasTemporarias.add(new Carta(R.drawable.brasil));
        this.listaCartasTemporarias.add(new Carta(R.drawable.burundi));
        this.listaCartasTemporarias.add(new Carta(R.drawable.camaroes));
        this.listaCartasTemporarias.add(new Carta(R.drawable.camboja));
        this.listaCartasTemporarias.add(new Carta(R.drawable.canada));
        this.listaCartasTemporarias.add(new Carta(R.drawable.catar));
        this.listaCartasTemporarias.add(new Carta(R.drawable.cazaquistao));
        this.listaCartasTemporarias.add(new Carta(R.drawable.ceorgia_do_sul));
        this.listaCartasTemporarias.add(new Carta(R.drawable.chade));
        this.listaCartasTemporarias.add(new Carta(R.drawable.chile));
        this.listaCartasTemporarias.add(new Carta(R.drawable.china));
        this.listaCartasTemporarias.add(new Carta(R.drawable.colombia));
        this.listaCartasTemporarias.add(new Carta(R.drawable.comores));
        this.listaCartasTemporarias.add(new Carta(R.drawable.coreia));
        this.listaCartasTemporarias.add(new Carta(R.drawable.costa_rica));
        this.listaCartasTemporarias.add(new Carta(R.drawable.croacia));
        this.listaCartasTemporarias.add(new Carta(R.drawable.cuadalupe));
        this.listaCartasTemporarias.add(new Carta(R.drawable.cuatemala));
        this.listaCartasTemporarias.add(new Carta(R.drawable.cuiana));
        this.listaCartasTemporarias.add(new Carta(R.drawable.cuine_equatorial));
        this.listaCartasTemporarias.add(new Carta(R.drawable.emirados_arabes));
        this.listaCartasTemporarias.add(new Carta(R.drawable.equador));
        this.listaCartasTemporarias.add(new Carta(R.drawable.espanha));
        this.listaCartasTemporarias.add(new Carta(R.drawable.estados_unidos));
        this.listaCartasTemporarias.add(new Carta(R.drawable.finlandia));
        this.listaCartasTemporarias.add(new Carta(R.drawable.franca));
        this.listaCartasTemporarias.add(new Carta(R.drawable.georgia));
        this.listaCartasTemporarias.add(new Carta(R.drawable.grecia));
        this.listaCartasTemporarias.add(new Carta(R.drawable.guam));
        this.listaCartasTemporarias.add(new Carta(R.drawable.guine));
        this.listaCartasTemporarias.add(new Carta(R.drawable.haiti));
        this.listaCartasTemporarias.add(new Carta(R.drawable.honduras));
        this.listaCartasTemporarias.add(new Carta(R.drawable.hong_kong));
        this.listaCartasTemporarias.add(new Carta(R.drawable.hungria));
        this.listaCartasTemporarias.add(new Carta(R.drawable.ilha_bouvet));
        this.listaCartasTemporarias.add(new Carta(R.drawable.ilha_do_homem));
        this.listaCartasTemporarias.add(new Carta(R.drawable.ilhas_cayman));
        this.listaCartasTemporarias.add(new Carta(R.drawable.ilhas_do_canal));
        this.listaCartasTemporarias.add(new Carta(R.drawable.ilhas_heard));
        this.listaCartasTemporarias.add(new Carta(R.drawable.ilhas_turks));
        this.listaCartasTemporarias.add(new Carta(R.drawable.ilhas_virgens));
        this.listaCartasTemporarias.add(new Carta(R.drawable.ilhas_wallis_e_futura));
        this.listaCartasTemporarias.add(new Carta(R.drawable.india));
        this.listaCartasTemporarias.add(new Carta(R.drawable.indonesia));
        this.listaCartasTemporarias.add(new Carta(R.drawable.ira));
        this.listaCartasTemporarias.add(new Carta(R.drawable.iraque));
        this.listaCartasTemporarias.add(new Carta(R.drawable.irlanda));
        this.listaCartasTemporarias.add(new Carta(R.drawable.islandia));
        this.listaCartasTemporarias.add(new Carta(R.drawable.israel));
        this.listaCartasTemporarias.add(new Carta(R.drawable.italia));
        this.listaCartasTemporarias.add(new Carta(R.drawable.jamaica));
        this.listaCartasTemporarias.add(new Carta(R.drawable.japao));
        this.listaCartasTemporarias.add(new Carta(R.drawable.jersey));
        this.listaCartasTemporarias.add(new Carta(R.drawable.jordania));
        this.listaCartasTemporarias.add(new Carta(R.drawable.kiribati));
        this.listaCartasTemporarias.add(new Carta(R.drawable.kuwait));
        this.listaCartasTemporarias.add(new Carta(R.drawable.laos));
        this.listaCartasTemporarias.add(new Carta(R.drawable.lemen));
        this.listaCartasTemporarias.add(new Carta(R.drawable.libano));
        this.listaCartasTemporarias.add(new Carta(R.drawable.liechtenstein));
        this.listaCartasTemporarias.add(new Carta(R.drawable.luxemburgo));
        this.listaCartasTemporarias.add(new Carta(R.drawable.marrocos));
        this.listaCartasTemporarias.add(new Carta(R.drawable.mauricio));
        this.listaCartasTemporarias.add(new Carta(R.drawable.mexico));
        this.listaCartasTemporarias.add(new Carta(R.drawable.nigeria));
        this.listaCartasTemporarias.add(new Carta(R.drawable.noruega));
        this.listaCartasTemporarias.add(new Carta(R.drawable.panama));
        this.listaCartasTemporarias.add(new Carta(R.drawable.paquistao));
        this.listaCartasTemporarias.add(new Carta(R.drawable.paraguai));
        this.listaCartasTemporarias.add(new Carta(R.drawable.peru));
        this.listaCartasTemporarias.add(new Carta(R.drawable.portugal));
        this.listaCartasTemporarias.add(new Carta(R.drawable.quenia));
        this.listaCartasTemporarias.add(new Carta(R.drawable.quirguistao));
        this.listaCartasTemporarias.add(new Carta(R.drawable.republica_dominicana));
        this.listaCartasTemporarias.add(new Carta(R.drawable.republica_pop));
        this.listaCartasTemporarias.add(new Carta(R.drawable.republica_unida_da_tanzania));
        this.listaCartasTemporarias.add(new Carta(R.drawable.romenia));
        this.listaCartasTemporarias.add(new Carta(R.drawable.saara_ocidental));
        this.listaCartasTemporarias.add(new Carta(R.drawable.samoa_ocidental));
        this.listaCartasTemporarias.add(new Carta(R.drawable.santa_lucia));
        this.listaCartasTemporarias.add(new Carta(R.drawable.sao_cristovao));
        this.listaCartasTemporarias.add(new Carta(R.drawable.sao_tome));
        this.listaCartasTemporarias.add(new Carta(R.drawable.sao_vicente));
        this.listaCartasTemporarias.add(new Carta(R.drawable.senegal));
        this.listaCartasTemporarias.add(new Carta(R.drawable.siria));
        this.listaCartasTemporarias.add(new Carta(R.drawable.sri_lanka));
        this.listaCartasTemporarias.add(new Carta(R.drawable.suazilandia));
        this.listaCartasTemporarias.add(new Carta(R.drawable.suecia));
        this.listaCartasTemporarias.add(new Carta(R.drawable.suica));
        this.listaCartasTemporarias.add(new Carta(R.drawable.suriname));
        this.listaCartasTemporarias.add(new Carta(R.drawable.svalbard));
        this.listaCartasTemporarias.add(new Carta(R.drawable.tadjiquistao));
        this.listaCartasTemporarias.add(new Carta(R.drawable.tailandia));
        this.listaCartasTemporarias.add(new Carta(R.drawable.taiwan));
        this.listaCartasTemporarias.add(new Carta(R.drawable.terras_austrais_francesas));
        this.listaCartasTemporarias.add(new Carta(R.drawable.territ_britan_oceano_indice));
        this.listaCartasTemporarias.add(new Carta(R.drawable.timor_leste));
        this.listaCartasTemporarias.add(new Carta(R.drawable.togo));
        this.listaCartasTemporarias.add(new Carta(R.drawable.tokelau));
        this.listaCartasTemporarias.add(new Carta(R.drawable.tonga));
        this.listaCartasTemporarias.add(new Carta(R.drawable.trinidad));
        this.listaCartasTemporarias.add(new Carta(R.drawable.tunisia));
        this.listaCartasTemporarias.add(new Carta(R.drawable.turcomenistao));
        this.listaCartasTemporarias.add(new Carta(R.drawable.turquia));
        this.listaCartasTemporarias.add(new Carta(R.drawable.tuvalu));
        this.listaCartasTemporarias.add(new Carta(R.drawable.ucrania));
        this.listaCartasTemporarias.add(new Carta(R.drawable.uganda));
        this.listaCartasTemporarias.add(new Carta(R.drawable.uruguay));
        this.listaCartasTemporarias.add(new Carta(R.drawable.uzbequistao));
        this.listaCartasTemporarias.add(new Carta(R.drawable.vanuatu));
        this.listaCartasTemporarias.add(new Carta(R.drawable.vaticano));
        this.listaCartasTemporarias.add(new Carta(R.drawable.venezuela));
        this.listaCartasTemporarias.add(new Carta(R.drawable.vietna));
        this.listaCartasTemporarias.add(new Carta(R.drawable.zambia));
        this.listaCartasTemporarias.add(new Carta(R.drawable.zimbabue));
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

        if (++totalCartasUsadas <= totalDeCartas/2) {
            indice = (int) (Math.random()*this.listaCartasTemporarias.size());
            c = listaCartasTemporarias.get(indice);
            listaCartasTemporarias_copia.add(c);
            listaCartasTemporarias.remove(indice);
        } else {
            indice = (int) (Math.random()*this.listaCartasTemporarias_copia.size());
            c = listaCartasTemporarias_copia.get(indice);
            listaCartasTemporarias_copia.remove(indice);
        }
        
        return c;
    }
}
