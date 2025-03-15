package projeto.piloto.lembrarme.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import projeto.piloto.lembrarme.Model.Nota;

@Dao
public interface NotaDao {
  @Query("SELECT * FROM nota")
  List<Nota> getAll();

  @Query("SELECT * FROM nota WHERE id = :notaId")
  List<Nota> loadAllById(int notaId);

  @Insert
  void insert(Nota nota);

  @Delete
  void delete(Nota nota);
}
