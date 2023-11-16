package etc.lambda;
@FunctionalInterface
public interface GenericFunction<X,Y> {
    //x 에서 y 를 추출해 줄게
    Y apply(X x);
}
