package Work3;

public class Greeter {
    private String formality;

    public String greet() {
        switch (this.formality) {
            case "formal":
                return "Good evening, sir.";
            case "casual":
                return "Sup bro?";
            case "intimate":
                return "Hello Darling!";
            default:
                return "Hello.";
        }
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}

/**
 * В данном случае нарушен Принцип единственной ответственности.
 * В классе Greeter содержатся две ответственности:
 * определение формы приветствия (формальное, неформальное, интимное) и само приветствие.
 * Для исправления нарушения принципа необходимо разделить класс Greeter на два класса:
 * один - для определения формы приветствия, другой - для вывода приветствия.
 */