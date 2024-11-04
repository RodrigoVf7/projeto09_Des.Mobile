package br.edu.fateczl.cadastroatletas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

public class GeralFragment extends Fragment {
    private EditText nome, dataNascimento, bairro, academia, recorde;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_geral, container, false);
        nome = view.findViewById(R.id.editTextNome);
        dataNascimento = view.findViewById(R.id.editTextDataNascimento);
        bairro = view.findViewById(R.id.editTextBairro);
        academia = view.findViewById(R.id.editTextAcademia);
        recorde = view.findViewById(R.id.editTextRecorde);

        Button btnCadastrar = view.findViewById(R.id.buttonCadastrar);
        btnCadastrar.setOnClickListener(v -> {
            AtletaGeral atleta = new AtletaGeral(
                    nome.getText().toString(),
                    dataNascimento.getText().toString(),
                    bairro.getText().toString(),
                    academia.getText().toString(),
                    Double.parseDouble(recorde.getText().toString())
            );
            Toast.makeText(view.getContext(), atleta.toString(), Toast.LENGTH_LONG).show();
        });
        return view;
    }
}

