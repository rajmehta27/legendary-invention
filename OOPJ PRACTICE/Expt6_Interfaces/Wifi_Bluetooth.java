// Design a Smart Device Control System using interfaces to achieve multiple inheritance in Java:
// 1. Interface WiFiEnabled(provides WiFi functionality)
// connectToWiFi(String network)→Connects to a WiFi network
// disconnectWiFi()→Disconnects from WiFi 

// 2. Interface BluetoothEnabled(provides Bluetooth functionality)
// pairDevice(String deviceName)→Pairs with a Bluetooth device
// unpairDevice()→Unpairs from the Bluetooth device 

// 3. Class SmartSpeaker(implements both WiFiEnabled and BluetoothEnabled)
// Implements WiFi and Bluetooth methods
// Additional method playMusic(String songName)

// 4. Class SmartDeviceDemo(Main class)
// Creates a SmartSpeaker object and performs various operations

public class Wifi_Bluetooth {
    public static void main(String[] args) {
        System.out.println("Smart Device Control System Demo\n");

        SmartSpeaker speaker = new SmartSpeaker();

        // Test WiFi functionality
        System.out.println("Testing WiFi Functionality:");
        speaker.connectToWiFi("Home_Network");
        speaker.playMusic("Summer Hits");
        speaker.disconnectWiFi();

        // Test Bluetooth functionality
        System.out.println("\nTesting Bluetooth Functionality:");
        speaker.pairDevice("iPhone 13");
        speaker.playMusic("Jazz Playlist");
        speaker.unpairDevice();

        // Test without connections
        System.out.println("\nTesting without connections:");
        speaker.playMusic("Error Test");
    }
}

interface WiFiEnabled {
    void connectToWiFi(String network);

    void disconnectWiFi();
}

interface BluetoothEnabled {
    void pairDevice(String deviceName);

    void unpairDevice();
}

class SmartSpeaker implements WiFiEnabled, BluetoothEnabled {
    String currentWiFiNetwork;
    String pairedDevice;
    boolean isWiFiConnected;
    boolean isDevicePaired;

    @Override
    public void connectToWiFi(String network) {
        currentWiFiNetwork = network;
        isWiFiConnected = true;
        System.out.println("Connected to WiFi network: " + network);
    }

    @Override
    public void disconnectWiFi() {

        if (isWiFiConnected) {
            System.out.println("Disconnected from WiFi network: " + currentWiFiNetwork);
            currentWiFiNetwork = null;
            isWiFiConnected = false;
        } else {
            System.out.println("Not connected to any WiFi network");
        }
    }

    @Override
    public void pairDevice(String deviceName) {
        pairedDevice = deviceName;
        isDevicePaired = true;
        System.out.println("Paired with Bluetooth device: " + deviceName);
    }

    @Override
    public void unpairDevice() {
        if (isDevicePaired) {
            System.out.println("Unpaired from Bluetooth device: " + pairedDevice);
            pairedDevice = null;
            isDevicePaired = false;
        } else {
            System.out.println("No device is currently paired");
        }
    }

    public void playMusic(String songName) {
        if (isWiFiConnected || isDevicePaired) {
            System.out.println("Playing: " + songName);
            if (isWiFiConnected) {
                System.out.println("Streaming via WiFi");
            }
            if (isDevicePaired) {
                System.out.println("Connected to: " + pairedDevice);
            }
        } else {
            System.out.println("Error: No active connection available");
        }
    }
}
