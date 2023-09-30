import co.edu.unbosque.view.Console;
import co.edu.unbosque.model.*;

public class Controller {
	private Console con;
	private PersonaDTO udao;

	public Controller() {
		con = new Console();
		udao = new PersonaDTO();
		run();
	}
	
	public void run() {
		while(true) {
			con.printWithJump("What do you wish to do?");
			con.printWithJump("1.) Create user. \n2.) Show all users \n3.) Update user by ID \4.) Delete user by ID.");
			int cn = con.readInt();
			switch (cn) {
			case 1: {
				con.printWithJump("Create user, please add the following: \n User id.");
				int id = con.readInt();
				con.printWithJump("Name:");
				String name = con.readWholeChain();
				con.printWithJump("Username:");
				String username = con.readWholeChain();
				con.printWithJump("Password:");
				String password = con.readWholeChain();
				udao.create(new UserDTO(id, name, username, password));
					
				break;
			}
			case 2: {
				con.printWithJump("Show all users.");
				con.printWithJump(udao.readAll());			
				break;
			}
			
			case 3: {
				con.printWithJump("Update user by ID");
				con.printWithJump("Enter your user ID");
				int id = con.readInt();
				con.printWithJump("Name:");
				String name = con.readWholeChain();
				con.printWithJump("Username:");
				String username = con.readWholeChain();
				con.printWithJump("Password:");
				String password = con.readWholeChain();
				udao.updateById(id, name, username, password);
				
				break;
			}
			case 4: {
				con.printWithJump("Delete user by ID");
				con.printWithJump("Enter your user ID");
				int id = con.readInt();
				udao.deleteById(id);
			}

			default:
				break;
			}
		}
	}

}
