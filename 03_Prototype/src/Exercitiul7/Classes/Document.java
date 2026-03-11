package Exercitiul7.Classes;

public class Document implements IDocument{

    private String titlu;
    private String continut;
    private String autor;

    public Document(String titlu, String continut, String autor) {
        this.titlu = titlu;
        this.continut = continut;
        this.autor = autor;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public Document() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Document{");
        sb.append("titlu='").append(titlu).append('\'');
        sb.append(", continut='").append(continut).append('\'');
        sb.append(", autor='").append(autor).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IDocument clone() {
        IDocument clona = new Document();
        ((Document)clona).titlu = this.titlu;
        ((Document)clona).continut = this.continut;
        ((Document)clona).autor = this.autor;
        return  clona;
    }
}
