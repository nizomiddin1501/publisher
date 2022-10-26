public class Main {
    public static void main(String[] args) {

        Pen pen = new Pen();
        pen.setInq(60);
        pen.setInqColor("qora");
        pen.setInqConsumption(10);
        pen.clicButton();
        System.out.println(pen.getInq());
        pen.write("hello OOPP");
        System.out.println(pen.getInq());
        pen.write("O");

    }
}
