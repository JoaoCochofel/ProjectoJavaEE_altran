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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "ProjFinEE")
public class User implements Serializable {

    @Column(unique = true)
    @Basic
    private String Mail;

    @ManyToOne(targetEntity = TipoUser.class)
    private TipoUser tipoUser;

    @Basic
    private long Telefone;

    @Basic
    private String Nome;

    @Column(unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdUser;

    public User() {

    }

    public String getMail() {
        return this.Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public TipoUser getTipoUser() {
        return this.tipoUser;
    }

    public void setTipoUser(TipoUser tipoUser) {
        this.tipoUser = tipoUser;
    }

    public long getTelefone() {
        return this.Telefone;
    }

    public void setTelefone(long Telefone) {
        this.Telefone = Telefone;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Long getIdUser() {
        return this.IdUser;
    }

    public void setIdUser(Long IdUser) {
        this.IdUser = IdUser;
    }
}
