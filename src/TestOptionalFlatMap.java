import java.util.Optional;

public class TestOptionalFlatMap {
    private class Augment<T>{
        Integer priceAug = 10;
        Augment(Integer i ){
            priceAug = i;
        }
        Optional<Integer> increase (){
            return  Optional.of(priceAug +10);
        }
        void sm(){
            Optional<Integer> pi = Optional.of(new Augment<Integer>(10)).flatMap(Augment::increase);;
        }


    }
    public  void main (String args[]){
            new TestOptionalFlatMap().sm();

        }
}
