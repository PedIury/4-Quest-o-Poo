public class Pessoajuridica extends Pessoa{
   
    protected String cnpj; 
    protected String razaosocial; 

    public Pessoajuridica(String nome, String cnpj, String razaosocial){
        super(nome);
        this.cnpj = cnpj;
        this.razaosocial = razaosocial;
    }
    public String getcnpj() {
        return cnpj;
    }
    public void setcnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public String getrazaosocial(){
        return razaosocial;
    }
    public void setrazaoSocial(String razaosocial){
        this.razaosocial = razaosocial;
    }
    public String toString() {
        return this.getNome()
        +this.getcnpj()
        +this.getrazaosocial();
    }

}