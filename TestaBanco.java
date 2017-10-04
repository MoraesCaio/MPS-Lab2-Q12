import banco.*;

/**
 * Created by caiomoraes on 03/10/17.
 */
public class TestaBanco
{
    public static void main(String[] args)
    {
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("111.111.111-11", "Abelha");
        Cliente cliente2 = new Cliente("222.222.222-22", "Baleia");
        Cliente cliente3 = new Cliente("333.333.333-33", "Cachorro");

        Conta conta1 = new Conta("11111", 1.00);
        Conta conta2 = new Conta("22222", 2.00);
        Conta conta3 = new Conta("33333", 3.00);
        Conta conta4 = new Conta("44444", 4.00);
        Conta conta5 = new Conta("55555", 5.00);

        banco.inserir(conta1, cliente1);
        banco.inserir(conta2, cliente1);
        banco.inserir(conta3, cliente2);
        banco.inserir(conta4, cliente2);
        banco.inserir(conta5, cliente3);

        //Buscando conta
        {
            Conta conta = banco.buscaConta("11111");
            System.out.println("Buscando conta");
            System.out.println(conta + "\n");
        }

        //Buscando conta inexistente
        {
            Conta conta = banco.buscaConta("00000");
            System.out.println("Buscando conta inexistente");
            System.out.println(conta + "\n");
        }

        //Buscando cliente
        {
            Cliente cliente = banco.buscaCliente("333.333.333-33");
            System.out.println("Buscando cliente");
            System.out.println(cliente + "\n");
        }

        //Buscando cliente inexistente
        {
            Cliente cliente = banco.buscaCliente("000.000.000-00");
            System.out.println("Buscando cliente inexistente");
            System.out.println(cliente + "\n");
        }

        //Buscando contas de um cliente
        {
            System.out.println("Buscando contas de um cliente");
            System.out.println(banco.buscaCliente("111.111.111-11"));
            for (Object conta : banco.buscaContasDeUmCliente("111.111.111-11"))
            {
                System.out.println(conta);
            }
            System.out.println();
        }

        //Buscando contas de um cliente inexistente
        {
            System.out.println("Buscando contas de um cliente inexistente");
            System.out.println(banco.buscaCliente("000.000.000-00"));
            for (Conta conta : banco.buscaContasDeUmCliente("000.000.000-00"))
            {
                System.out.println(conta);
            }
            System.out.println();
        }
    }
}
