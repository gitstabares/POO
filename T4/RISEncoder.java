import java.util.List;

public class RISEncoder<T> implements Encodable<T> {
    @Override
    public String encode(T type) {
        String output = createType()+
                        createTitle(getFieldValues(type)[0])+
                        createAuthor(getFieldValues(type)[1])+
                        createJournal(getFieldValues(type)[3])+
                        createYear(getFieldValues(type)[2]);
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
    private String createAuthor(List<String> authors)
    {
        String output = "";
        for (String author : authors) {
            output += createAuthor(author);
        }
        return output;
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
    private String createDOI(String doi)
    {
        return createField("DO", doi);
    }
    private String createAbstractText(String abstractText)
    {
        return createField("AB", abstractText);
    }
    private String createEnd()
    {
        return createField("ER", "");
    }
    @Override
    public String[] getFieldValues(T item) {
        String[] fields = {item.getTitle(), item .};
        return fields;
    }
}