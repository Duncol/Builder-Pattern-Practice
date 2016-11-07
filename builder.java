public enum Ingredients{
    EXTRA_CHEESE, RED PEPPER, GREEN PEPPER, HAM, MUSHROOMS, PINEAPPLE, FETA, OLIVES, SALAMI, CHICKEN
public class Pizza{
    private final String cakeType;
    private final int diameter;
    private final Ingredients ingredientOne;
    private final Ingredients ingredientTwo;
    private final Ingredients ingredientThree;
    private final Ingredients ingredientFour;
    private final Ingredients ingredientFive;
    
    public Pizza(PizzaBuilder builder){
        this.cakeType = builder.cakeType;
        this.diameter = builder.diameter;
        this.ingredientOne = builder.ingredientOne;
        this.ingredientTwo = builder.ingredientTwo;
        this.ingredientThree = builder.ingredientThree;
        this.ingredientFour = builder.ingredientFour;
        this.ingredientFive = builder.ingredientFive;
        
    private class PizzaBuilder{
        String cakeType;
        int diameter;
        Ingredients ingredientOne;
        Ingredients ingredientTwo;
        Ingredients ingredientThree;
        Ingredients ingredientFour;
        Ingredients ingredientFive;
        
        PizzaBuilder(String cakeType, int diameter){
            this.cakeType = cakeType;
            this.diameter = diameter;
            
        PizzaBuilder ingredientOne(Ingredients i1){
            this.ingredientOne = i1;
            return this;
        }
        PizzaBuilder ingredientTwo(Ingredients i2){
            this.ingredientTwo = i2;
            return this;
        }
        PizzaBuilder ingredientThree(Ingredients i3){
            this.ingredientThree = i3;
            return this;
        }
        PizzaBuilder ingredientFour(Ingredients i4){
            this.ingredientFour = i4;
            return this;
        }
        PizzaBuilder ingredientFive(Ingredients i5){
            this.ingredientFive = i5;
            return this;
        }
        Pizza build(){
            return new Pizza(this);
    }
    
    Pizza makePizza(){
            return new Pizza.PizzaBuilder("extra thin", 50)
                            .ingredientOne(RED_PEPPER)
                            .ingredientTwo(MUSHROOMS)
                            .ingredientThree(HAM)
                            .makePizza()
    }
}
        
