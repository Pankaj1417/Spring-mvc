package springmvc.springmvc.enums;

public enum HtmlTemplates {
    HELLO("hello");
    private final String template;
    HtmlTemplates(String template){
        this.template=template;
    }
    public String getTemplate(){
        return template;
    }
}
