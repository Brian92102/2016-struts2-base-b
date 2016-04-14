package utn.frd.db;

import java.util.ArrayList;
import utn.frd.bean.Persona;
import java.util.List;

public class PersistentManager {
	
	private static List<Persona> data = new ArrayList<Persona>();

	public static List<Persona> getInstance(){
		return data;
		}
}