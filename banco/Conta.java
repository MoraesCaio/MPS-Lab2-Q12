package banco;

/**
 * Created by caiomoraes on 03/10/17.
 */
public class Conta
{
    private String numero;
    private double saldo;

    public String getNumero()
    {
        return numero;
    }

    public void setNumero(String numero)
    {
        this.numero = numero;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void debitar(double valor)
    {
        this.saldo -= valor;
    }

    public void creditar(double valor)
    {
        this.saldo += valor;
    }

    public Conta()
    {
        this("7777", 1_000_000.00);
    }

    public Conta(String numero, double saldo)
    {
        this.numero = numero;
        this.saldo = saldo;
    }

    @Override
    public String toString()
    {
        return "Número da conta: " + numero + "\nSaldo: " + saldo;
    }
}
