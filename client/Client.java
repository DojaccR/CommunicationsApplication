/*
    This class connects to the server and manages communication between server and GUI.
*/
package client;

public class Client{
    public static final int SCREEN_HEIGHT = 720;
    public static final int SCREEN_WIDTH = 1280;
    public static void main(String[] args) {

        GUI gui = new GUI(SCREEN_HEIGHT, SCREEN_WIDTH);
    }
}