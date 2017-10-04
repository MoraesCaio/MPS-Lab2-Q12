package banco;

/**
 * Created by caiomoraes on 03/10/17.
 */
public class Cliente
{
    private String cpf;
    private String nome;

    public String getCpf()
    {
        return cpf;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Cliente()
    {
        this("123.456.789-90", "Nome e Sobrenome");
    }

    public Cliente(String cpf, String nome)
    {
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public String toString()
    {
        return "Nome: " + nome + "\nCpf: " + cpf;
    }
}
