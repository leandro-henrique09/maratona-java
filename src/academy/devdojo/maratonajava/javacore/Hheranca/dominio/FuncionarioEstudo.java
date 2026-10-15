package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class FuncionarioEstudo extends PessoaEstudo{
    private int matricula;
    private String departamento;
    private String funcao;

    public void identificacaoUsuario() {
        System.out.println("Os dados abaixos pertencem ao funcionario: "+this.nome+"\nCom a matricula: "+this.matricula);
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.matricula);
        System.out.println(this.departamento);
        System.out.println(this.funcao);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
