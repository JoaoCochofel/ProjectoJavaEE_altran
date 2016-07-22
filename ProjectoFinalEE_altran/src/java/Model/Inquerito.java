package Model;

//
// This file was generated by the JPA Modeler
//

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inquerito implements Serializable {

    @Column(unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdInquerito;

    @Basic
    private String DataInicio;

    @Basic
    private String DataFim;

    @Basic
    private String TituloInquerito;

    public Inquerito() {

    }

    public Long getIdInquerito() {
        return this.IdInquerito;
    }

    public void setIdInquerito(Long IdInquerito) {
        this.IdInquerito = IdInquerito;
    }

    public String getDataInicio() {
        return this.DataInicio;
    }

    public void setDataInicio(String DataInicio) {
        this.DataInicio = DataInicio;
    }

    public String getDataFim() {
        return this.DataFim;
    }

    public void setDataFim(String DataFim) {
        this.DataFim = DataFim;
    }

    public String getTituloInquerito() {
        return this.TituloInquerito;
    }

    public void setTituloInquerito(String TituloInquerito) {
        this.TituloInquerito = TituloInquerito;
    }
}
