package projeto.piloto.lembrarme.Activities;

import android.os.Bundle;

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

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    activityListaNotasBinding = ActivityListaNotasBinding.inflate(getLayoutInflater());
    setContentView(activityListaNotasBinding.getRoot());

    LembrarMeDb appDb = LembrarMeDb.getInstance(this);
    notaDao = appDb.notaDao();

    RecyclerView recyclerView = activityListaNotasBinding.recyclerViewListaNotas;
    ListaNotasAdapter listaNotasAdapter = new ListaNotasAdapter(this,notaDao.getAll());
    recyclerView.setAdapter(listaNotasAdapter);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));





  }




}