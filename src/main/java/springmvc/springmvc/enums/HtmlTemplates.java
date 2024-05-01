package springmvc.springmvc.enums;

public enum HtmlTemplates {
    HELLO("hello"), HELLO_BACKUP("hello_backup");
    private final String template;

    HtmlTemplates(String template) {
        this.template = template;
    }

    public String getTemplate() {
        return template;
    }
}
