package entidade;

import javax.persistence.*;


@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;

    public long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String cpf(){
        return cpf;
    }
    public void Setcpf(String cpf){
        this.cpf = cpf;
    }
}
