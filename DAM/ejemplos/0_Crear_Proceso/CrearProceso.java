/* Clases necesarias para poder crear procesos. */
import java.lang.Process;
import java.lang.Runtime;

/**/

@Action
public void crearNuevoEditor() {
	Process nuevoProceso; //Definimos una variable de tipo Process
	try{
		//Obtenemos el nombre del SO
		String osName = System.getProperty("os.name");
		
		if (osName.toUpperCase().contains("WIN")){ //Windows
			nuevoProceso = Runtime.getRuntime().exec("java -jar "+
				"C:\\Users\\usuario\\Documents\\NetBeansProjects"+
				"\\Editor\\dist\\DocumentEditor.jar");
		}else{                                      //Linux
		  nuevoProceso = Runtime.getRuntime().exec("java -jar "+
		  "/home/usuario/NetBeansProjects/Editor/dist/DocumentEditor.jar");
		}
	   
	}catch (SecurityException ex){
		System.out.println("Ha ocurrido un error de Seguridad."+
				"No se ha podido crear el proceso por falta de permisos.");
	}catch (Exception ex){
		System.out.println("Ha ocurrido un error, descripción: "+
				ex.toString());
	}
}