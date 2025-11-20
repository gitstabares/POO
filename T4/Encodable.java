import java.util.List;

public interface Encodable<T> {
    public abstract String[] getFieldNames();
    public abstract Object[] getFieldValues(T item);
    public abstract String createField(String name, Object value);
    public abstract String[] getFields(T item);
    public abstract String encode(T item);
    public abstract String encode(List<T> list);
}