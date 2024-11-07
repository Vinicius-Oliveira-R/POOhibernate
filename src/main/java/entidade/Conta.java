package entidade;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Date dataAbertura;
    @Enumerated(EnumType.STRING)
    private TipoConta tipoConta;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getDataAbertura() {
        return dataAbertura;
    }
    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    public TipoConta getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }
    
}
