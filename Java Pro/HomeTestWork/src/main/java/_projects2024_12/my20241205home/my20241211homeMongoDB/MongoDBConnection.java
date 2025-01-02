package _projects2024_12.my20241205home.my20241211homeMongoDB;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MongoDBConnection {
    private static String getStringToConnect() {
        Path path = Paths.get("I:\\_Starta Institut\\Java Pro\\HomeTestWork\\src\\main\\resources\\pass.log"); // I:\_Starta Institut\Java Pro\HomeTestWork\src\main\resources\pass.log
        String line = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toString()))) {
            line = bufferedReader.readLine();

        } catch (FileNotFoundException e) {
            System.err.println("File Not Found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O Exception: " + e.getMessage());
            e.printStackTrace();
        }
        return line;
    }

    private static final String CONNECTION_STRING = getStringToConnect();

    public static MongoDatabase connectToDatabase(String databaseName) {
        MongoClient client = MongoClients.create(MongoClientSettings.builder()
                .applyConnectionString(new com.mongodb.ConnectionString(CONNECTION_STRING))
                .build());
        return client.getDatabase(databaseName);
    }
}

