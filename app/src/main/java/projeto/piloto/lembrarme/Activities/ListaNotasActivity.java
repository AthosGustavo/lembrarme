package projeto.piloto.lembrarme.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import projeto.piloto.lembrarme.Adapter.ListaNotasAdapter;
import projeto.piloto.lembrarme.DAO.NotaDao;
import projeto.piloto.lembrarme.Database.LembrarMeDb;
import projeto.piloto.lembrarme.R;
import projeto.piloto.lembrarme.databinding.ActivityListaNotasBinding;

public class ListaNotasActivity extends AppCompatActivity {

  private ActivityListaNotasBinding activityListaNotasBinding;
  private NotaDao notaDao;
  private LembrarMeDb appDb;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    activityListaNotasBinding = ActivityListaNotasBinding.inflate(getLayoutInflater());
    setContentView(activityListaNotasBinding.getRoot());

    appDb = LembrarMeDb.getInstance(this);
    notaDao = appDb.notaDao();

    configuraRecyclerView();
    configuraBtnCriarNota();
  }

  private void configuraRecyclerView(){
    RecyclerView recyclerView = activityListaNotasBinding.recyclerViewListaNotas;
    new Thread(new Runnable() {
      @Override
      public void run() {
        ListaNotasAdapter listaNotasAdapter = new ListaNotasAdapter(ListaNotasActivity.this, notaDao.getAll());
        recyclerView.setAdapter(listaNotasAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(ListaNotasActivity.this));
      }
    }).start();


  }

  private void configuraBtnCriarNota(){
    activityListaNotasBinding.btnFab.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(ListaNotasActivity.this, NotaActivity.class);
        startActivity(intent);
      }
    });
  }


}