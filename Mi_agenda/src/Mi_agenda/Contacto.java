package Mi_agenda;

public class Contacto {
	
	//Atributos:
	String nombre;
	String numero; //Puede ser int para no usar tanta memoria (PUEDEN IR EN ARRAY)
	String email;
	
	//Metodo constructor
	public Contacto(String _nombre, String _numero, String _email){ //PARAMETROS PARA MODIFICAR COMO ABAJO
		
		this.nombre=_nombre;  //RELACIONO EL STRING CON EL METODO
		this.numero=_numero;
		this.email=_email;
	
	}
	
	public Contacto (String _nombre){
		
	}
	public Contacto (String _nombre, String _numero){				//NO SE LE METE VOID PORQUE ES CONSTRUCTOR
		
		this.nombre=_nombre;										// CONTACTO EN TODOS, SOBRE CARGA DEL METODO CONSTRUCTOR.
		this.numero="Vacio";
		this.email="Vacio";
	}
	
	//Metodos
	public String getNombre(){
	return this.nombre;
	}
	
	public void setNombre(String _nombre){
		this.nombre=_nombre;
	}
	public String getNumero(){
	return this.numero;
	}
	
	public void setNumero(String _numero){
	this.nombre=_numero;}
	
	public String getEmail(){
		return this.email;
	}
			
	public void setEmail(String _email){
		this.nombre=_email;
	}	
	public void DatosContacto(){
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Numero: "+getNumero());
		System.out.println("Email: "+this.getEmail());
	}
		
	public static float suma(float a, float b){
	
		return a+b;
	}
	
	}


	

