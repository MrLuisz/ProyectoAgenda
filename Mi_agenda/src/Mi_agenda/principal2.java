package Mi_agenda;
import java.util.Scanner;
public class principal2 {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
	}
		// TODO Auto-generated method stub
		Scanner reader=new Scanner (System.in);
		Contacto mi_contacto;
		String nombre, telefono, email;
		boolean band=true;
		int opcion, lenght;

		System.out.print("Tamaño de la agenda: "){
		
		
		lenght=reader.nextInt();
		Agenda mi_agenda=new Agenda(lenght){
		
		while(band==true);
		menul();
		System.out.println("> Elegir opcion: ");
		opcion = reader.nextInt();

		
			switch(opcion){
			
			case 1:
				
				System.out.println("Ingresar nombre contacto");
				nombre=reader.next();
				System.out.println("Ingresar telefono contacto");
				telefono=reader.next();
				System.out.println("Ingresar email contacto: ");
				email=reader.next();
				
				mi_contacto=new Contacto(nombre, telefono, email);
				libreta.setContacto(mi_contacto);
				break;
			case 2:
				break;
			
			case 3:
				break;
				
			case 4:
				break;
				
			case 5:
			Mi_agenda.listaContactos();
				break;
			
			case 0:
			band=false;
				break;
					
			default:
				break;
				
			}
		}
	




public static void menu1() {
			System.out.println("");
			System.out.println("==========MENU AGENDA TELEFONICA==========");
			System.out.println("[1] Añadir Contacto");
			System.out.println("[2] Editar Contacto");
			System.out.println("[3] Buscar Contacto");
			System.out.println("[4] Eliminar Contacto");
			System.out.println("[5] Listar Contacto");
			System.out.println("[0] Finalizar Contacto");
			
			
}
		}


