public class classes {
    
    String className;
    String programminglanguage;

    public classes(String name, String theprogramminglanguage) {
        className = name;
        programminglanguage = theprogramminglanguage;
    }
    public static void main(String[] args) {
        classes Myclass = new classes("New class", "Java programming");
        System.out.println(Myclass.className);
        System.out.println("Classes in " + Myclass.programminglanguage);
    }
}