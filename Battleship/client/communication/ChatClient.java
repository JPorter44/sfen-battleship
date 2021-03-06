package client.communication;

import ocsf.client.AbstractClient;
import client.controller.CreateAccountControl;
import client.controller.LoginControl;
import client.controller.StartGameControl;

public class ChatClient extends AbstractClient
{
	// Private data fields for storing the GUI controllers.
	private LoginControl loginControl;
	private CreateAccountControl createAccountControl;
	private StartGameControl startGameControl;

	public ChatClient()
	{
		super("localhost", 8300);
	}
	
	public ChatClient(String ipaddress)
	{
		super(ipaddress, 8300);
	}

	// Setters for the GUI controllers.
	public void setLoginControl(LoginControl loginControl)
	{
		this.loginControl = loginControl;
	}

	public void setCreateAccountControl(CreateAccountControl createAccountControl)
	{
		this.createAccountControl = createAccountControl;
	}
	
	public void setStartGameControl(StartGameControl startGameControl)
	{
		this.startGameControl = startGameControl;
	}

	@Override
	// Method that handles messages from the server.
	public void handleMessageFromServer(Object arg0)
	{
		// If we received a String, figure out what this event is.
		if (arg0 instanceof String)
		{
			// Get the text of the message.
			String message = (String) arg0;

			// If we successfully logged in, tell the login controller.
			if (message.equals("LoginSuccessful"))
			{
				loginControl.loginSuccess();
			}

			// If we successfully created an account, tell the create account controller.
			else if (message.equals("CreateAccountSuccessful"))
			{
				createAccountControl.createAccountSuccess();
			}
			
			//delegate which client to send which message to 
		}

		// If we received an Error, figure out where to display it.
		else if (arg0 instanceof Error)
		{
			// Get the Error object.
			Error error = (Error) arg0;

			// Display login errors using the login controller.
			if (error.getType().equals("Login"))
			{
				loginControl.displayError(error.getMessage());
			}

			// Display account creation errors using the create account controller.
			else if (error.getType().equals("CreateAccount"))
			{
				createAccountControl.displayError(error.getMessage());
			}
		}
	}

	public void connectionException(Throwable exception)
	{
		// Add your code here
		exception.printStackTrace();
	}

	public void connectionEstablished()
	{
		// Add your code here
	}

}
