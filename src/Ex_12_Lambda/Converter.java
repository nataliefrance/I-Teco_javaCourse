package Ex_12_Lambda;

public interface Converter<T, R> {
    R convert(T o);
}
