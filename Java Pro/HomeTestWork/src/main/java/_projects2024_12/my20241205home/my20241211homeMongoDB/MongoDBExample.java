package _projects2024_12.my20241205home.my20241211homeMongoDB;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDBExample {
    public static void main(String[] args) {
        MongoDatabase database = MongoDBConnection.connectToDatabase("testdb");
        MongoCollection<Document> collection = database.getCollection("testCollection");

        // Чтение данных
        for (Document doc : collection.find()) {
            System.out.println(doc.toJson());
        }

        // Вставка документа
        Document newDocument = new Document("name", "John Doe")
                .append("age", 29)
                .append("status", "active");
        collection.insertOne(newDocument);

        // Обновление документа
        collection.updateOne(new Document("name", "John Doe"),
                new Document("$set", new Document("age", 30)));

        // Удаление документа
//        collection.deleteOne(new Document("name", "John Doe"));
    }
}

