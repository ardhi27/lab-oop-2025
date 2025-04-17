 public class Main {

    public static void main(String[] args) {

        Link link = new Link(30, 15, 12);
        Ganondorf ganondorf = new Ganondorf("Ganondorf Dragmire", 120, 25);

        System.out.println("\n===== STATUS AWAL =====");
        System.out.println(link.cekStatus());
        System.out.println(ganondorf.getStatus());

        System.out.println("\n===== LINK MENCABUT PEDANG =====");
        link.cabutMasterSword();

        System.out.println("\n===== PERTEMPURAN DIMULAI =====");
        int ronde = 1;

        while (link.getHealth() > 0 && ganondorf.getHealth() > 0) {
            System.out.println("\n-- Ronde " + ronde + " --");

            // Link menyerang
            link.serangGanondorf(ganondorf);
            if (ganondorf.getHealth() <= 0) {
                break;
            }

            // Ganondorf membalas
            ganondorf.serang(link);
            if (link.getHealth() <= 0) {
                break;
            }

            ronde++;
        }
        System.out.println();

        System.out.println("\n===== HASIL AKHIR =====");
        System.out.println(link.cekStatus());
        System.out.println(ganondorf.getStatus());

        ganondorf.getWinStatus();
       
    }
}
