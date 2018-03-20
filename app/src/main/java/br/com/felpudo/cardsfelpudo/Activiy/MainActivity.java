package br.com.felpudo.cardsfelpudo.Activiy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import br.com.felpudo.cardsfelpudo.Adapter.PersonagemAdapter;
import br.com.felpudo.cardsfelpudo.Model.DadosDoPersonagem;
import br.com.felpudo.cardsfelpudo.R;

public class MainActivity extends AppCompatActivity {

    String[] listaNomes = {"Felpudo", "Fofura", "Lesmo", "Bugado", "Uruca", "Racing", "iOS", "Android", "RealidadeAumentada", "Sound FX", "3D Studio Max", "Games"};
    String[] listaDescricao = {"Felpudo", "Fofura", "Lesmo", "Bugado", "Uruca", "Racing", "iOS", "Android", "RealidadeAumentada", "Sound FX", "3D Studio Max", "Games"};
    int[] listaImagem = {R.drawable.bugado, R.drawable.bugado, R.drawable.bugado, R.drawable.bugado, R.drawable.bugado, R.drawable.bugado, R.drawable.bugado, R.drawable.bugado, R.drawable.bugado, R.drawable.bugado, R.drawable.bugado, R.drawable.bugado, R.drawable.bugado,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView minhalista = findViewById(R.id.minhaLista);
        PersonagemAdapter meuAdaptador = new PersonagemAdapter(getApplicationContext(), R.layout.meu_item);

        int i =0;
        for(String nome: listaNomes){
            DadosDoPersonagem dadosDoPersonagem = new DadosDoPersonagem(listaImagem[i], nome, listaDescricao[i]);
            meuAdaptador.add(dadosDoPersonagem);
            i++;
        }

        minhalista.setAdapter(meuAdaptador);

    }
}
