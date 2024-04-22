public class GenericClass<T> {

    public T someMethod() {
        return (T) new Object();
    }
}
