public class Material {
    
    private String nome;
    private double quantidade;
    
    public Material(String n, double q)throws QuantidadeInvalidaException{
        this.setNome(n);
        this.setQuantidade(q);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade)throws QuantidadeInvalidaException {
        
        if(quantidade < 0){
            throw new QuantidadeInvalidaException("Quantidade Invalida!");
        }
        
        this.quantidade = quantidade;
    }
    

}
