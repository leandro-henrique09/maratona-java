package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class ClienteEstudo extends PessoaEstudo{
    private int idIdentificacao;

    public ClienteEstudo(int idIdentificacao) {
        this.idIdentificacao = idIdentificacao;
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.idIdentificacao);
    }

    public int getIdIdentificacao() {
        return idIdentificacao;
    }

    public void setIdIdentificacao(int idIdentificacao) {
        this.idIdentificacao = idIdentificacao;
    }
}
