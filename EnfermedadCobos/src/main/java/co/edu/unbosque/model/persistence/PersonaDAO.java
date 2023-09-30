package co.edu.unbosque.model.persistence;

import java.sql.SQLException;
import java.util.ArrayList;

import co.edu.unbosque.controller.DBconnection;
import co.edu.unbosque.model.PersonaDTO;

public class PersonaDAO implements CRUDoperation {
	private ArrayList<PersonaDTO> users;
	private DBconnection dbcon;

	public PersonaDAO() {
		users = new ArrayList<PersonaDTO>();
		dbcon = new DBconnection();
	}

	@Override
	public void create(Object o) {
		// OBJECTS SE PUEDE GUARDAR CUALQUIER TIPO DE CLASE
		PersonaDTO temporal = (PersonaDTO) o;
		dbcon.initConnection();
		try {
			dbcon.setPreparedStatement(dbcon.getConnect().prepareStatement("INSERT INTO usuario VALUES(?,?,?,?);"));
			// SIGNOS DE PREGUNTA COMODINES, SE PUEDE PONER DATOS.
			dbcon.getPreparedStatement().setString(1, temporal.getName());
			dbcon.getPreparedStatement().setDate(2, temporal.getBirthDate());
			dbcon.getPreparedStatement().setFloat(3, temporal.getId());
			dbcon.getPreparedStatement().setString(4, temporal.getNationality());
			dbcon.getPreparedStatement().setEnfermedadDTO(5, temporal.getEnfermedades());
			dbcon.getPreparedStatement().executeUpdate();
			dbcon.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		users.add((PersonaDAO) o);

	}

	@Override
	public void create(String... args) {

		PersonaDAO newPersona = new PersonaDTO(args[0], args[1], args[2], args[3]);
		dbcon.initConnection();
		users.add(newPersona);
	}

	@Override
	public String readAll() {
		String salida = "";
		users.clear();
		dbcon.initConnection();
		try {
			dbcon.setStatement(dbcon.getConnect().createStatement());
			dbcon.setResultSet(dbcon.getStatement().executeQuery("SELECT * FROM usuario;"));
			while (dbcon.getResultSet().next()) {
				String name = dbcon.getResultSet().getString("name");
				Date date = dbcon.getResultSet().getDate("birth date");
				float id = dbcon.getResultSet().getFloat("id");
				String nationality = dbcon.getResultSet().getString("nationality");
				String EnfermedadDTO = dbcon.getResultSet().getEnfermedadDTO("enfermedades");

				users.add(new PersonaDAO(name, date, id, nationality, EnfermedadDTO);

			}
			dbcon.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (PersonaDTO user : users) {
			salida += user.toString();

		}
		return salida;
	}

	@Override
	public String readByName(String name) {
		String salida = "";
		for (PersonaDTO user : users) {
			if (user.getName().equals(name)) {
				salida += user.toString();
			}
		}
		return salida;

	}

	@Override
	public int updateById(int id, String... args) {
		dbcon.initConnection();
		try {
			dbcon.setPreparedStatement(dbcon.getConnect().prepareStatement(
					"UPDATE usuario SET id =?,nombre = ?, nombreUsuario = ?, contrasena = ? WHERE id=?;"));
			// SIGNOS DE PREGUNTA COMODINES, SE PUEDE PONER DATOS.
			dbcon.getPreparedStatement().setInt(1, id);
			dbcon.getPreparedStatement().setString(2, args[0]);
			dbcon.getPreparedStatement().setString(3, args[1]);
			dbcon.getPreparedStatement().setString(4, args[2]);
			dbcon.getPreparedStatement().setInt(5, id);
			dbcon.getPreparedStatement().executeUpdate();
			dbcon.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getId() == id) {
				users.get(i).setName(args[0]);
				users.get(i).setPersonaName(args[1]);
				users.get(i).setPassword(args[0]);
				return 0;
			}
		}

		return 1;

	}

	@Override
	public int deleteById(int id) {
		dbcon.initConnection();
		try {
			dbcon.setPreparedStatement(dbcon.getConnect().prepareStatement("DELETE FROM usuario WHERE id =?;"));
			// SIGNOS DE PREGUNTA COMODINES, SE PUEDE PONER DATOS.
			dbcon.getPreparedStatement().setInt(1, id);
			dbcon.getPreparedStatement().executeUpdate();
			dbcon.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getId() == id) {
				users.remove(i);
				return 0;
			}
		}
		return 1;
	}

}