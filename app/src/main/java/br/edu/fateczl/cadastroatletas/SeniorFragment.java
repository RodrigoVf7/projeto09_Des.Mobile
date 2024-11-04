package br.edu.fateczl.cadastroatletas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

public class SeniorFragment extends Fragment {
    private EditText nome, dataNascimento, bairro;
    private CheckBox problemasCardiacos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_senior, container, false);
        nome = view.findViewById(R.id.editTextNome);
        dataNascimento = view.findViewById(R.id.editTextDataNascimento);
        bairro = view.findViewById(R.id.editTextBairro);
        problemasCardiacos = view.findViewById(R.id.checkboxProblemasCardiacos);

        Button btnCadastrar = view.findViewById(R.id.buttonCadastrar);
        btnCadastrar.setOnClickListener(v -> {
            AtletaSenior atleta = new AtletaSenior(
                    nome.getText().toString(),
                    dataNascimento.getText().toString(),
                    bairro.getText().toString(),
                    problemasCardiacos.isChecked()
            );
            Toast.makeText(view.getContext(), atleta.toString(), Toast.LENGTH_LONG).show();
        });
        return view;
    }
}
