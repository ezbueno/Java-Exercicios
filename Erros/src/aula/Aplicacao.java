package aula;

public class Aplicacao {

    public static void main(String[] args) {
        
//        ContatoPF c1 = new ContatoPF();
        
        ContatoPJ c1 = new ContatoPJ();
        
        c1.setNome("Ezandro");
//        c1.setCpf("312.236.168-00");

        c1.setCnpj("05.006.456/0001-45");
        
//        c1.setEndereco(new Endereco());
        
        c1.getEndereco().setRua("Rua Felisberto Pereira Santiago");
        c1.getEndereco().setNumero("116");
        c1.getEndereco().setCidade("Carapicuíba");
        c1.getEndereco().setEstado("São Paulo");
        
        Agenda a = new Agenda();
        
        a.setContato1(c1);
        
        imprimirNomes(a);
        imprimirCnpj(a);
        
        System.out.println("Contato definido.");
        
    }
    
    private static void imprimirNomes(Agenda a){
        
        if (a.getContato1() != null){
            System.out.println(a.getContato1().getNome());
        }
        
        if (a.getContato2() != null){
            System.out.println(a.getContato2().getNome());
        }
      
        if (a.getContato3() != null){
            System.out.println(a.getContato3().getNome());
        }
    }
    
    private static void imprimirCnpj(Agenda a){
        
        if (a.getContato1() != null && a.getContato1() instanceof ContatoPJ){
            ContatoPJ c = (ContatoPJ) a.getContato1();
            System.out.println(c.getCnpj());
        }
        
        if (a.getContato2() != null && a.getContato2() instanceof ContatoPJ){
            ContatoPJ c = (ContatoPJ) a.getContato2();
            System.out.println(c.getCnpj());            
        }
      
        if (a.getContato3() != null && a.getContato3() instanceof ContatoPJ){
            ContatoPJ c = (ContatoPJ) a.getContato3();
            System.out.println(c.getCnpj());            
        }
    }    
}
