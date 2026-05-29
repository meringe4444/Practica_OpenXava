package com.tuempresa.facturacion.run;

import org.openxava.util.*;

/**
 * Ejecuta esta clase para arrancar la aplicación.
 */

public class facturacion {

	public static void main(String[] args) throws Exception {
		DBServer.start("facturacion-db");
		AppServer.run("facturacion");
	}

}
