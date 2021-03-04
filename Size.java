public enum Size {

    SMALL(32, 36, "Pequeno",'S'),

    MEDIUM(37, 44, "Médio",'M'),

    LARGE(45, 52, "Grande",'L');
    
    //Atributos
    private final String description;
    private final int minValue;
    private final int maxValue;
    private final char code;
    
    /**
     *  Construtor do Enum Size.
     *  
     *  @param minValue     Representa o valor minimo
     *  @param maxValue     Representa o valor máximo
     *  @param description  Representa o tamanho em string
     *  @param code         Representa o tamanho em char
     */
    private Size(int minValue, int maxValue, String description, char code){
        this.description=description;
        this.minValue=minValue;
        this.maxValue=maxValue;
        this.code=code;
    }

    /**
     *  Converte o enumerado em string.
     * 
     *  @return  Retorna o enumerado em string 
     */
    @Override
    public String toString() {
        return this.description;
    }
    
    /**
     *  Serve para ler a descrição.
     *    
     *  @return  Retorna a descrião da bebida
     */
    public String getDescription() {
        return description;
    }

    /**
     *  Serve para ler o valor minimo.
     *    
     *  @return  Retorna o valor minimo da bebida
     */
    public int getMinValue() {
        return minValue;
    }

    /**
     *  Serve para ler o valor máximo.
     *    
     *  @return  Retorna o valor maximo da bebida
     */
    public int getMaxValue() {
        return maxValue;
    }

    /**
     *  Serve para ler o código.
     *    
     *  @return  Retorna o código da bebida
     */
    public char getCode() {
        return code;
    }

}
