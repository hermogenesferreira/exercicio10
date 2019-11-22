public class TestaConversor {
    
        public static void main(String[] args){
            try{
        
            ConversorDeTemperatura c1 = new ConversorDeTemperatura();
            
            c1.converterParaCelsius(-600);
            c1.converterParaFarenheit(-280);
            
        }catch(MenorQueZeroAbsolutoException ex){
            //Fazer algum tratamento de exceção
            
            System.out.println(ex.getMessage());
        }
        }
    
}
