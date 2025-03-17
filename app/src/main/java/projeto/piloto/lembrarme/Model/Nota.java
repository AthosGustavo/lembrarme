package projeto.piloto.lembrarme.Model;

import android.widget.ImageView;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.sql.Date;

@Entity
public class Nota {
  @PrimaryKey
  private Long id;
  private String titulo;
  private String descNota;
  private String imgNota;
  //private Date dtNota;

  public Nota(String titulo, String descNota, String imgNota) {
    this.titulo = titulo;
    this.descNota = descNota;
    this.imgNota = imgNota;
  }

  public Nota() {

  }

  public String getDescNota() {
    return descNota;
  }

  public void setDescNota(String descNota) {
    this.descNota = descNota;
  }

  public String getImgNota() {
    return imgNota;
  }

  public void setImgNota(String imgNota) {
    this.imgNota = imgNota;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  //public Date getDtNota() {
    //return dtNota;
 // }

  //public void setDtNota(Date dtNota) {
    //this.dtNota = dtNota;
  //}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
