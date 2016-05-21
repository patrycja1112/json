import jdk.nashorn.api.scripting.JSObject;

import java.io.BufferedReader;
import java.io.PrintWriter;

public class Main {

    class Client implements Runnable {
        JSObject packet;

        public static final String SERVER_IP = "192.168.0.2";
        public static final int SERVER_PORT = 5678;

        private String mServerMessage;
        Thread backgroundThread;

        private boolean mRun = false;
        private PrintWriter mBufferOut;
        private BufferedReader mBufferIn;

        public Client(JSObject packet) { this.packet = packet; }

        public void sendMessage(String message) {

        }

        public void stopClient() {

        }

        @Override
        public void run() {

        }
    }

    public static void main(String[] args) {}
}
