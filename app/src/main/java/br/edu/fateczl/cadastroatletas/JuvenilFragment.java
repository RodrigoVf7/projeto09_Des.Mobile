package br.edu.fateczl.cadastroatletas;

/*
 *@author: Seu Nome
 */
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

public class JuvenilFragment extends Fragment {
    private EditText nome, dataNascimento, bairro, anosPratica;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_juvenil, container, false);
        nome = view.findViewById(R.id.editTextNome);
        dataNascimento = view.findViewById(R.id.editTextDataNascimento);
        bairro = view.findViewById(R.id.editTextBairro);
        anosPratica = view.findViewById(R.id.editTextAnosPratica);

        Button btnCadastrar = view.findViewById(R.id.buttonCadastrar);
        btnCadastrar.setOnClickListener(v -> {
            AtletaJuvenil atleta = new AtletaJuvenil(
                    nome.getText().toString(),
                    dataNascimento.getText().toString(),
                    bairro.getText().toString(),
                    Integer.parseInt(anosPratica.getText().toString())
            );
            Toast.makeText(view.getContext(), atleta.toString(), Toast.LENGTH_LONG).show();
        });
        return view;
    }
}

