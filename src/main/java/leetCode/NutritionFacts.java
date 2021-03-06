package leetCode;

/**
 * 构建器demo:产生的对象都是单独存在的
 * Created by Dave on 2017/4/19.
 */
public class NutritionFacts {
    private final int servingSize;  //(ml)  required
    private final int servings;    //(per container) required
    private final int calories;   //   optional
    private final int fat;        //   (g)optional
    private final int sodium;     //   (mg)optional
    private final int carbohydrate;    //(g)optional

    public static class Builder{
       private final int servingSize;
       private final int servings;

       private int calories = 0;
       private int fat = 0;
       private int sodium = 0;
       private int carbohydrate = 0;

       public Builder(int servingSize,int servings){
           this.servingSize = servingSize;
           this.servings = servings;
       }

       public Builder calories(int val){
           calories = val;
           return this;
       }

       public Builder fat(int val){
           fat = val;
           return this;
       }

       public Builder sodium(int val){
           sodium = val;
           return this;
       }

       public Builder carbohydrate(int val){
           carbohydrate = val;
           return this;
       }

       public NutritionFacts build(){
           return new NutritionFacts(this);
       }

   }

    private NutritionFacts(Builder builder){
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

}
