public class Main {
    public static void main(String[] args) {
        Triangolo triangolo = new Triangolo(1.6,5.2);
                Rettangolo rettangolo = new Rettangolo(4.7,6.2);

                System.out.println("Area triangolo è: " + triangolo.calcolaArea());
                System.out.println("Area Rettangolo è: " + rettangolo.calcolaArea());

    }
}