package projeto.piloto.lembrarme.Activities;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import projeto.piloto.lembrarme.R;
import projeto.piloto.lembrarme.databinding.ActivityListaNotasBinding;

public class NotaActivity extends AppCompatActivity {



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    EdgeToEdge.enable(this);
    setContentView(R.layout.activity_nota);
    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.notaActivity), (v, insets) -> {
      Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
      v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
      return insets;
    });
  }








}