package br.edu.fateczl.cadastroatletas;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;

/*
 *@author: RODRIGO VINICIUS FERRAZ DA SILVA
 *@RA: 1110482313043
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu); // Inflate do menu aqui
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Fragment selectedFragment = null;

        switch (item.getItemId()) {
            case R.id.menu_juvenil:
                selectedFragment = new JuvenilFragment();
                break;
            case R.id.menu_senior:
                selectedFragment = new SeniorFragment();
                break;
            case R.id.menu_geral:
                selectedFragment = new GeralFragment();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        // Carrega o fragmento selecionado
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, selectedFragment)
                .commit();
        return true;
    }
}

