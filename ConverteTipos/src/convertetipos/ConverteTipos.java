package convertetipos;

public class ConverteTipos {

    public static void main(String[] args) {
        
        String precoSTR = "9.99";
        System.out.println(precoSTR); 
        float preco = Float.parseFloat(precoSTR);//converte String p/ float
        System.out.println(preco);
        
        String idadeSTR = "30";
        System.out.println(idadeSTR);
        int idade = Integer.parseInt(idadeSTR);//converte String p/ inteiro
        System.out.println(idade);
        
        double preco2 = Double.parseDouble(precoSTR);//converte String p/ double
        System.out.println(preco2);
        
        
        
        
        
    }
    
}
