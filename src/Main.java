/**
 * simple client
 * sending json
 * over tcp/ip protocol
 */

import jdk.nashorn.api.scripting.JSObject;

import java.io.BufferedReader;
import java.io.PrintWriter;
//test
public class Main {

    class Client implements Runnable {
        JSObject packet;

        public static final String SERVER_IP = "192.168.0.2";
 d       public static final int SERVER_PORT = 5678;

        private String mServerMessage;

        //this is thread that has to be put on 'sleep' state
        //after sending message in run() method
        Thread backgroundThread;

        private boolean mRun = false;
        private PrintWriter mBufferOut;
        private BufferedReader mBufferIn;

        // this is constructor
        public Client(JSObject packet) { this.packet = packet; }

        //todo implement this
        public void sendMessage(String message) {
            if (mBufferOut!=null && mBufferOut.checkError()){
            	mBufferOut.printLn(message);
            	mBufferOut.flush();
            }
        }

        //todo implement this
        public void stopClient() {
            if ()
            /*
            if buffer is not null then close it
            change values of buffers and server message
             */
        }

        //todo implement this
        @Override
        public void run() {

            /*
            1. get server address
            2. create socket
            3. send message
             */
        }
    }

    public static void main(String[] args) {}
}
