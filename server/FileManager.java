/*
	This class is the interface between the server application and database.
	The database for this project will be a collection of text files. This decision is due to the fact that
	I am not certain what the eventual structure of tha data will be and I don't want to add dependencies by using
	a NoSQL database. Text files are simple to use and quite robust when some safety precautions are taken.
*/

package server;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FileManager{
	public FileManager(){}
	String cwd = Path.of("").toAbsolutePath().toString();

	public String userChats(int userID){
		/**
		 * A method to return all chats of a user
		 * @param	userID	Unique ID of a user
		 * @return	String containing all chats a user belongs to
		 */
		return null;
	}
	public String fetchChat(int chatID){
		/**
		 * A method to fetch all data in a chat
		 * @param	chatID	Unique ID of a chat
		 * @return	String containing all data in a chat
		 */
		return null;
	}

	public String fetchLines(int chatID, int lines){
		/**
		 * A method to return the most recent n lines from a chat
		 * @param	chatID	Unique ID of a chat
		 * @param	lines	Number of lines to fetch
		 * @return	String containing the latest n lines from specified chat
		 */
		return null;
	}

	public boolean createChat(int[] userID){
		/**
		 * Method to create a data block for a new chat
		 * @param	userID	Array of users who will be in the new chat
		 * @return	boolean signifying successful creation
		 */
		return false;
	}

	public boolean deleteChat(int chatID){
		/**
		 * Method to delete a given chat
		 * @param	chatID	Unique ID of a chat
		 * @return	boolean signifying successful deletion
		 */
		return false;
	}

	public boolean writeToChat(int chatID, int userID, String message){
		/**
		 * Method to write a message to a chat i.e. append message to datatbase
		 * @param	chatID	Unique ID of a chat
		 * @param	userID	Unique ID of a user
		 * @param	message	String containing the message to be appended
		 * @return	boolean signifying successful write
		 */
		return false;
	}

}
