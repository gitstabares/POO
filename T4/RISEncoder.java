import java.util.List;

public class RISEncoder<T> implements Encodable<T> {
    @Override
    public String encode(T type) {
        String output = createType()+
                        createTitle(getFields(type)[0])+
                        createAuthor(getFields(type)[1])+
                        createYear(getFields(type)[2])+
                        createJournal(getFields(type)[3])+
                        createEnd();
        return output;
    }
    @Override
    public String encode(List<T> list) {
        String output = "";
        for (T record : list) {
            output += encode(record) + "\n";
        }
        return output;
    }
    @Override
    public String createField(String name, Object value) {
        return name + "  - " + value.toString() + "\n";
    }
    private String createType()
    {
        return createField("TY", "JOUR");
    }
    private String createTitle(String title)
    {
        return createField("TI", title);
    }
    private String createAuthor(String author)
    {
        return createField("AU", author);
    }
    private String createYear(String year)
    {
        return createField("PY", year);
    }
    private String createJournal(String journal)
    {
        if (journal.length() > 5) return createField("JF", journal);
        else return createField("JA", journal);
    }
    private String createEnd()
    {
        return createField("ER", "");
    }
}