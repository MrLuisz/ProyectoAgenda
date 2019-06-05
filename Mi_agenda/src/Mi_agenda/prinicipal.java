package Mi_agenda;

public class prinicipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//USAR IMPORT SOLO CUANDO ES DE OTRO PAQUETE
		Contacto usuario=new Contacto("Pepito","941375067","pepito@gmail.com");
		
		
		System.out.println(usuario.getNombre());
		
		usuario.setNombre("Juanito");
		System.out.println(usuario.getNombre());
		
		Contacto usuario2=new Contacto("Margarita","942375067","margarita@gmail.com");
		System.out.println(usuario2.getNombre());
		System.out.println(usuario2.getNumero());
		System.out.println(usuario2.getEmail());
		
	
		
	}
	

}
