	package SO;
	import javax.swing.JOptionPane;

	import controller.KillController;;

	public class Main {
	    public static void main(String[] args) {
	        KillController killer = new KillController();
	        killer.listaProcessos();
	        String option = JOptionPane.showInputDialog(null, "Coloque o PID do processo que vai ser finalizado:");
	        if (option != null) {
	            try {
	                int pid = Integer.parseInt(option);
	                System.out.println("Finalizando processo por PID.");
	                killer.mataPid(pid);
	            }catch(NumberFormatException e) {
	                System.out.println("Finalizando processo por nome.");
	                killer.mataNome(option);
	            }
	        }
	        System.out.println("ENCERRANDO.");
	    }
	}

