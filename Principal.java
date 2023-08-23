import java.util.Scanner;

public class Principal
{
    public static void main(String args[])
    {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("### Empresa XPTO ###");
        
        System.out.println("Informe o nome da empresa: ");
        Empresa emp = new Empresa();
        emp.setNome( leia.next() );
        
        System.out.println("# empresa :: "+emp.getNome());
        
        //Ler os Funcionarios
        while(true)
        {
            Funcionario f = new Funcionario();
            System.out.println("## Nome do Funcionario: ");
            f.setNome( leia.next() );
            System.out.println("## Salario Bruto: ");
            f.setSalarioBruto( leia.nextDouble() );
            System.out.println("## Qtd de filhos: ");
            f.setQtdFilhos( leia.nextInt() );
            System.out.println("## Usa vale transporte? (true/false): ");
            f.setUsaValeTransporte( leia.nextBoolean() );
            System.out.println("## Eh gerente? (true/false): ");
            f.setEhGerente( leia.nextBoolean() );
            
            System.out.println("## Nome"+f.getNome()+" Salario R$"+f.salarioLiquido());
            System.out.println("Deseja cadastrar outro? (S/N): ");
            if ( leia.next().equalsIgnoreCase("N") )
            {
                break;
            }
        }
        
    }
}
