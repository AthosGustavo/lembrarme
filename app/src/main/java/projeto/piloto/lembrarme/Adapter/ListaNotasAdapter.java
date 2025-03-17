package projeto.piloto.lembrarme.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import projeto.piloto.lembrarme.Model.Nota;
import projeto.piloto.lembrarme.R;

public class ListaNotasAdapter extends RecyclerView.Adapter<ListaNotasAdapter.ViewHolder> {

  private Context context;
  private List<Nota> notas;

  public ListaNotasAdapter(Context context, List<Nota> notas) {
    this.context = context;
    this.notas = notas;
  }

  @NonNull
  @Override
  public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    LayoutInflater layoutInflater = LayoutInflater.from(this.context);
    View view = layoutInflater.inflate(R.layout.item_nota, parent, false);
    return new ViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.vincula(notas.get(position));
  }

  @Override
  public int getItemCount() {
    return 0;
  }

  public class ViewHolder extends RecyclerView.ViewHolder{
    private TextView titulo;
    private TextView descNota;
    private TextView dtNota;

    public ViewHolder(View nota){
      super(nota);
      this.titulo = nota.findViewById(R.id.titulo_nota);
      this.descNota = nota.findViewById(R.id.descricao_nota);
      this.dtNota = nota.findViewById(R.id.data_nota);
    }

    public void vincula(Nota nota){
      this.titulo.setText(nota.getTitulo());
      //this.descNota.setText(nota.getDtNota().toString());
      this.descNota.setText(nota.getDescNota());
    }

  }

}
