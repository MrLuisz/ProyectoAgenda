package Mi_agenda;

public class Agenda {
 
	Contacto[] lista;
  //Metodos constructores
 	public Agenda(int tamanio){
 		this.lista= new Contacto[tamanio];
 	}
 	
 	public Agenda(){
 		this.lista=new Contacto[10];
 	}
 	
 	//Metodos set
 	public void setContacto(Contacto c){
 		
 		if (this.lista ==null){
 		this.lista[0]=c;
 		}else{
 			int indice=busca_vacio_agenda();
 			this.lista[indice]=c;
 		}
 	}
 	private int busca_vacio_agenda(){
 	
 		int indice= 0;
 		while(this.lista[indice]!=null){
 			++indice;
 		}
 		return indice;
 		}
 	
 	public void listaContactos(){
 	
 			for(int i=0; i< (this.lista).length;i++){
 				
 				if (this.lista[i]==null){
 				}else{
 					System.out.println("");
 					System.out.println("Contacto: "+i);
 					(this.lista[i]).DatosContacto();
 					
 					
 				}
 			}
 		
 		
 				
 	}
 	
}
