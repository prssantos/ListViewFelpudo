package br.com.felpudo.cardsfelpudo.Adapter;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.felpudo.cardsfelpudo.Model.DadosDoPersonagem;
import br.com.felpudo.cardsfelpudo.R;
import br.com.felpudo.cardsfelpudo.View.ViewPersonagem;

public class PersonagemAdapter extends ArrayAdapter {


    public PersonagemAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @Override
    public void addAll(Object[] items) {
        super.addAll(items);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View minhaView;
        minhaView = convertView;
        ViewPersonagem viewPersonagem;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            minhaView = inflater.inflate(R.layout.meu_item, parent, false);

            viewPersonagem = new ViewPersonagem();

            viewPersonagem.imagem = (ImageView) minhaView.findViewById(R.id.imageViewIcone);
            viewPersonagem.titulo = (TextView) minhaView.findViewById(R.id.textViewTitulo);
            viewPersonagem.descricao = (TextView) minhaView.findViewById(R.id.textViewDescricao);

            minhaView.setTag(viewPersonagem);
        } else {
            viewPersonagem = (ViewPersonagem) minhaView.getTag();
        }

        DadosDoPersonagem dadosDoPersonagem;
        dadosDoPersonagem = (DadosDoPersonagem) this.getItem(position);

        viewPersonagem.imagem.setImageResource(dadosDoPersonagem.getImagem());
        viewPersonagem.titulo.setText(dadosDoPersonagem.getTitulo());
        viewPersonagem.descricao.setText(dadosDoPersonagem.getDescricao());

        return minhaView;
    }
}
