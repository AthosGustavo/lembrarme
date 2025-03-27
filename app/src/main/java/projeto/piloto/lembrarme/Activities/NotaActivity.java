package projeto.piloto.lembrarme.Activities;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import projeto.piloto.lembrarme.R;
import projeto.piloto.lembrarme.databinding.ActivityListaNotasBinding;
import projeto.piloto.lembrarme.databinding.ActivityNotaBinding;

public class NotaActivity extends AppCompatActivity {

  private ActivityNotaBinding activityNotaBinding;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    activityNotaBinding = ActivityNotaBinding.inflate(getLayoutInflater());
    setContentView(activityNotaBinding.getRoot());
    setSupportActionBar(activityNotaBinding.notaToolbar);

  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.menu_criar_nota_toolbar,menu);
    return super.onCreateOptionsMenu(menu);

  }

  @Override
  public boolean onOptionsItemSelected(@NonNull MenuItem item) {

    if (item.getItemId() == R.id.form_nota_menu_remover){
      System.out.println("remover");
    }else{
      System.out.println("salvar");
    }



    return super.onOptionsItemSelected(item);
  }
}