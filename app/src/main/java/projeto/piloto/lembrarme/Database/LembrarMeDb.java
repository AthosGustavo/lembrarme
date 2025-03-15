package projeto.piloto.lembrarme.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.Objects;

import projeto.piloto.lembrarme.DAO.NotaDao;
import projeto.piloto.lembrarme.Model.Nota;

@Database(entities = {Nota.class}, version = 1)
public abstract class LembrarMeDb extends RoomDatabase {

  private static LembrarMeDb lembrarMeDb;
  public abstract NotaDao notaDao();

  public static LembrarMeDb getInstance(Context context) {
    synchronized (LembrarMeDb.class) {
      if (Objects.isNull(lembrarMeDb)) {
        lembrarMeDb = Room.databaseBuilder(
                context.getApplicationContext(),
                LembrarMeDb.class, "notas.db").build();

      }
    }
    return lembrarMeDb;
  }
}
