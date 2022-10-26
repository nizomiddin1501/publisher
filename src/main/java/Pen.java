public class Pen {

    boolean button;
    private double inq;
    private String inqColor;
    private double inqConsumption;

    public Pen() {
    }

    public Pen(double inq, String inqColor, double inqConsumption) {
        this.inq = inq;
        this.inqColor = inqColor;
        this.inqConsumption = inqConsumption;
    }

    public Pen(boolean button, double inq, String inqColor, double inqConsumption) {
        this.button = button;
        this.inq = inq;
        this.inqColor = inqColor;
        this.inqConsumption = inqConsumption;
    }

    public boolean isButton() {
        return button;
    }

    public void setButton(boolean button) {
        this.button = button;
    }

    public double getInq() {
        return inq;
    }

    public void setInq(double inq) {
        if (inq > 0) {
            this.inq = inq;
        }
    }

    public String getInqColor() {
        return inqColor;
    }

    public void setInqColor(String inqColor) {
        this.inqColor = inqColor;
    }

    public double getInqConsumption() {
        return inqConsumption;
    }

    public void setInqConsumption(double inqConsumption) {
        if (inqConsumption > 0) {
            this.inqConsumption = inqConsumption;
        }
    }

    void clicButton() {
        button = !button;
    }

    //  System.out.println(Character.isUpperCase('A'));
    //  System.out.println(Character.isUpperCase('a'));
    //  System.out.println(Character.isUpperCase(65));
//    String name = "Nizomjon";
//        for (int i = 0; i < name.length(); i++) {
//        char oneSymbol = name.charAt(0);
//        if (oneSymbol == ' '){
//        }
//    }
//    for (int i = 0; i < word.length(); i++) {
//        if (ink > 0) {
//            char oneSymbol = word.charAt(i);
//            if (Character.isUpperCase(oneSymbol)) {
//                ink -= 2 * inkConsumption;
//            } else if (oneSymbol == ' ') {
//                ink = ink;
//            } else {
//                ink -= inkConsumption;
//            }
//            System.out.print(oneSymbol);
//        }
//    }
    void write(String word) {
        if (button) {
            if (inq > 0) {
                for (int i = 0; i < word.length(); i++) {
                    char oneSymbol = word.charAt(i);
                    System.out.println(word);
                    if (Character.isUpperCase(oneSymbol))
                        inq -= 2 * inqConsumption;
                    if (oneSymbol==' ')
                        inq=inq;
                     if (inq / inqConsumption > word.length())//
                        inq -= word.length() * inqConsumption;
                    else inq = 0;
                    break;
                }
            } else {
                System.out.println("Ruchkada siyoh qolmagan, sterjenni almashtirin");
            }
        } else {
            System.out.println("yozishtan oldin tugmani bosin");
        }
    }

    void changeSterjen(double inq) {
        inq = inq;

    }


}
