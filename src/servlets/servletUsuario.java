package servlets;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Usuario;

@WebServlet("/servletUsuario")
public class servletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public servletUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//FALTA TODA LA LÓGICA DEL DAO
		int filas=0;
		if(request.getParameter("btnGuardarCliente")!= null)
		{
			Usuario u = new Usuario();
			u.setNombre(request.getParameter("txtNombre"));
			u.setApellido(request.getParameter("txtApellido"));
			u.setDni(request.getParameter("txtDni"));
			u.setCuil(request.getParameter("txtCuil"));
			u.setSexo(request.getParameter("Sexo"));
			u.setNacionalidad(request.getParameter("txtNacionalidad"));
			LocalDate a = LocalDate.parse(request.getParameter("txtFechaNac"));
			u.setFechaNac(a);
			u.setDirec(request.getParameter("txtDireccion"));
			u.setLocalidad(request.getParameter("txtLocalidad"));
			u.setProvincia(request.getParameter("Provincia"));
			u.setMail(request.getParameter("txtEmail"));
			u.setTelefono(request.getParameter("txtTelefono"));
			u.setUsuario(request.getParameter("txtUsuario"));
			u.setPassword(request.getParameter("txtPassword"));
		}
				
		request.setAttribute("Datos", filas);
				
		RequestDispatcher rd = request.getRequestDispatcher("/AgregarUsuario.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("btnGuardarCliente")!= null)
		{
			String nombre = request.getParameter("txtNombre");
			String apellido = request.getParameter("txtApellido");
			String dni= request.getParameter("txtDni");
			String cuil = request.getParameter("txtCuil");
			String sexo = request.getParameter("Sexo");
			String nacionalidad = request.getParameter("txtNacionalidad");
			String fechaNac = request.getParameter("txtFechaNac");
			String direc = request.getParameter("txtDireccion");
			String localidad = request.getParameter("txtLocalidad");
			String provincia = request.getParameter("Provincia");
			String mail = request.getParameter("txtEmail");
			String tel = request.getParameter("txtTelefono");
			String usuario = request.getParameter("txtUsuario");
			String pass = request.getParameter("txtPassword");
			
			String resultado = "";
			resultado += "Nombre: "+nombre+"<br>Apellido: "+apellido+"<br>DNI: "+dni+ "<br>CUIL: "+cuil+"<br>Sexo: "+sexo+"<br>Nacionalidad: "+nacionalidad+
			"<br>Fecha de Nacimiento: "+fechaNac+"<br>Dirección: "+direc+"<br>Localidad: "+localidad+"<br>Provincia: "+provincia+"<br>Correo Electrónico: "+mail+
			"<br>Teléfono: "+tel+"<br>Usuario: "+usuario+"<br>Contraseña: "+pass;
			request.setAttribute("Datos", resultado);
					
			RequestDispatcher rd = request.getRequestDispatcher("/AgregarUsuario.jsp");
			rd.forward(request, response);
		}
		
	}

}
