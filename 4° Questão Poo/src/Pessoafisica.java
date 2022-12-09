
public class Pessoafisica extends Pessoa{
    
    protected String cpf;
    protected String sobrenome;

    public Pessoafisica(String nome, String cpf, String sobrenome){
    super(nome);
    this.cpf = cpf;
    this.sobrenome = sobrenome;
    }
    public String getcpf(){
        return cpf;
    }
    public void setcpf(String cpf) {
        this.cpf = cpf;
    }
    public String getsobrenome() {
        return sobrenome;
    }
    public void setsobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String toString() {
        return this.getNome();
    }
}
