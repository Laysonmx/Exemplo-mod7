public class PrimeiraClasse {

    public static void main(String[] args) {
        System.out.println("Olá Layson");
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua 5, Jardim Alcantara");
        cliente.setCodigo(1);
        System.out.println(cliente.getCodigo());
        System.out.println(cliente.getEndereco());
        System.out.println(cliente.retornarNomeCliente());
        System.out.println(cliente.retornarProdutosCliente());
        System.out.println(cliente.retornarProdutosCliente2());
        System.out.println(cliente.getValorTotal());
    }
}

/*
* Oi professor, Tudo bem ?
*  fiz só esse comentário simples.
 */