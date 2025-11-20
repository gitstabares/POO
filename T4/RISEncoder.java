import java.util.List;

public abstract class RISEncoder<T> implements Encodable<T> {
    @Override
    public String[] getFieldNames() {
        return null;
    }
    @Override
    public Object[] getFieldValues(T item) {
        return null;
    }
    @Override
    public String encode(T item) {
        String[] fields = getFields(item);
        StringBuilder sb = new StringBuilder();
        for (String field : fields) {
            sb.append(field);
        }
        return sb.toString();
    }
    @Override
    public String encode(List<T> list) {
        String output = "";
        for (T record : list) {
            output += encode(record) + "\n";
        }
        return output.trim();
    }
    @Override
    public String createField(String name, Object value) {
        if (value.toString().isEmpty() && !name.equals("ER")) {
            return "";
        }
        return name + "  - " + value.toString() + "\n";
    }
    public String createType()
    {
        return createField("TY", "JOUR");
    }
    public String createTitle(Object item)
    {
        return createField("TI", item);
    }
    public String createAuthor(Object item)
    {
        return createField("AU", item);
    }
    public String createYear(Object item)
    {
        return createField("PY", item);
    }
    public String createJournal(Object item)
    {
        if (item.toString().length() > 5) return createField("JF", item);
        else return createField("JA", item);
    }
    public String createDOI(Object item)
    {
        return createField("DO", item);
    }
    public String createAbstractText(Object item)
    {
        return createField("AB", item);
    }
    public String createEnd()
    {
        return createField("ER", "");
    }
}