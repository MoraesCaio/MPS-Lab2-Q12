package banco;

import java.util.*;

/**
 * Created by caiomoraes on 03/10/17.
 */
public class Banco
{
    private Map<Conta, Cliente> cadastros;

    public Banco()
    {
        this.cadastros = new HashMap<Conta, Cliente>();
    }

    public void inserir(Conta conta, Cliente cliente)
    {
        cadastros.put(conta, cliente);
    }

    public Conta buscaConta(String numero)
    {
        for (Conta conta : cadastros.keySet())
        {
            if (conta.getNumero().equals(numero))
            {
                return conta;
            }
        }
        return null;
    }

    public Cliente buscaCliente(String cpf)
    {
        for (Cliente cliente : cadastros.values())
        {
            if (cliente.getCpf().equals(cpf))
            {
                return cliente;
            }
        }
        return null;
    }

    public List<Conta> buscaContasDeUmCliente(String cpf)
    {
        List<Conta> contas = new ArrayList<Conta>();
        for (Map.Entry<Conta, Cliente> cadastro : cadastros.entrySet())
        {
            Cliente cliente = cadastro.getValue();
            if (cliente.getCpf().equals(cpf))
            {
                contas.add(cadastro.getKey());
            }
        }
        return contas;
    }
}
