public class ConversorDeTemperatura {
    
    public double converterParaCelsius(double celsius)throws MenorQueZeroAbsolutoException{
        if(celsius < -459.67){
        throw new MenorQueZeroAbsolutoException("Zero Absoluto!");
    }
        celsius = (celsius-32) * (5/9);
        return  celsius;
    }
    
    public double converterParaFarenheit(double f)throws MenorQueZeroAbsolutoException{
        
        
        if(f < -273.15){
            throw new MenorQueZeroAbsolutoException("Zero Absoluto");
        }
        f =  (f*9/5) + 32;
        
        return f;
    }
}
