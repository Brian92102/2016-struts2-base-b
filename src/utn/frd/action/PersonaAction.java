package utn.frd.action;

import com.opensymphony.xwork2.ActionSupport;

import utn.frd.bean.Persona;
import utn.frd.db.PersistentManager;

import java.util.List;

public class PersonaAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String age;
	private String gender;
	private List<Persona> personas;
    
	
	
	public String save(){
		
		personas = PersistentManager.getInstance();
		int edad = 0;
		
		try{
			edad = Integer.parseInt(age);
		}
		catch(Exception e){
			addActionError("Ocurrió un error con la edad");
			return ERROR;
		}
		

		Persona p= new Persona(personas.size(), name, edad, gender);
		personas.add(p);
		
		name=" ";
		age=" ";
		gender=" ";

		return SUCCESS;
		
		}
	
	
	public String execute(){
		personas = PersistentManager.getInstance();
		return SUCCESS;
		}
	
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setAge(String age){
		this.age=age;
	}
	
	public void setGender(String gender){
		this.gender=gender;
	}
	
	public void setList(List<Persona> personas){
		this.personas=personas;
	}
	
	public String getName(){
		return name;
	}
	
	public String getAge(){
		return age;
	}
	
	public String getGender(){
		return gender;
	}
	
	public List<Persona> getList(){
		return personas;
	}
}
