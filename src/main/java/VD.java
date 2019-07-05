//import com.mongodb.Block;
//import com.mongodb.client.*;
//import com.mongodb.client.model.Accumulators;
//import com.mongodb.client.model.Aggregates;
//import com.mongodb.client.model.Filters;
//import com.mongodb.client.model.Projections;
//import com.mongodb.client.result.UpdateResult;
//import com.mongodb.reactivestreams.client.Success;
//import org.bson.Document;
//import org.reactivestreams.Publisher;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static com.mongodb.client.model.Filters.*;
//import static com.mongodb.client.model.Updates.inc;
//
//public class VD {
//    public static void main(String[] args) {
//        MongoClient mongoClient = MongoClients.create();
//        MongoDatabase database = mongoClient.getDatabase("db1");
//        MongoCollection<Document> collection = database.getCollection("vd");
////        Document doc = new Document("name", "MongoDB")
////                .append("type", "database")
////                .append("count", 1)
////                .append("versions", Arrays.asList("v3.2", "v3.0", "v2.6"))
////                .append("info", new Document("x", 203).append("y", 102));
////        collection.insertOne(doc);
////        List<Document> documents = new ArrayList<Document>();
////        for (int i = 0; i < 100; i++) {
////            documents.add(new Document("i", i));
////        }
////        collection.insertMany(documents);
////        System.out.println(collection.countDocuments());
////        MongoCursor<Document> cursor = collection.find().iterator();
////        try {
////            while (cursor.hasNext()) {
////                System.out.println(cursor.next().toJson());
////            }
////        } finally {
////            cursor.close();
////        }
//        Block<Document> printBlock = new Block<Document>() {
//            @Override
//            public void apply(final Document document) {
//                System.out.println(document.toJson());
//            }
//        };
//
//       // collection.find(gt("i", 50)).forEach(printBlock);
//       // collection.updateOne(eq("i", 10), new Document("$set", new Document("i", 110)));
////        UpdateResult updateResult = collection.updateMany(lt("i", 100), inc("i", 100));
////        System.out.println(updateResult.getModifiedCount());
////        collection.createIndex(new Document("i", 1));
//
//
////        Document document = new Document("name", "Café Con Leche")
////                .append("contact", new Document("phone", "228-555-0149")
////                        .append("email", "cafeconleche@example.com")
////                        .append("location",Arrays.asList(-73.92502, 40.8279556)))
////                .append("stars", 3)
////                .append("categories", Arrays.asList("Bakery", "Coffee", "Pastries"));
////
////        collection.insertOne(document);
////        Document doc1 = new Document("name", "Amarcord Pizzeria")
////                .append("contact", new Document("phone", "264-555-0193")
////                        .append("email", "amarcord.pizzeria@example.net")
////                        .append("location",Arrays.asList(-73.88502, 40.749556)))
////                .append("stars", 2)
////                .append("categories", Arrays.asList("Pizzeria", "Italian", "Pasta"));
////
////
////        Document doc2 = new Document("name", "Blue Coffee Bar")
////                .append("contact", new Document("phone", "604-555-0102")
////                        .append("email", "bluecoffeebar@example.com")
////                        .append("location",Arrays.asList(-73.97902, 40.8479556)))
////                .append("stars", 5)
////                .append("categories", Arrays.asList("Coffee", "Pastries"));
////        List<Document> documents = new ArrayList<Document>();
////        documents.add(doc1);
////        documents.add(doc2);
////
////        collection.insertMany(documents);
//
////        collection.aggregate(
////                Arrays.asList(
////                       // Aggregates.match(Filters.eq("categories", "Coffee")),
////                        Aggregates.group("$stars", Accumulators.sum("count", 1))
////                )
////        ).forEach(printBlock);
//
////        collection.aggregate(
////                Arrays.asList(
////                        Aggregates.project(
////                                Projections.fields(
////                                        Projections.excludeId(),
////                                        Projections.include("name"),
////                                        Projections.computed(
////                                                "firstCategory",
////                                                new Document("$arrayElemAt", Arrays.asList("$categories", 0))
////                                        )
////                                )
////                        )
////                )
////        ).forEach(printBlock);
//
//
//        Document doc = new Document("name", "MongoDB")
//                .append("type", "database")
//                .append("count", 1)
//                .append("info", new Document("x", 203).append("y", 102));
//        collection.insertOne(doc).subscribe(new OperationSubscriber<Success>());
//    }
//}
