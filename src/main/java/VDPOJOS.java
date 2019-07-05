//import com.mongodb.Block;
//import com.mongodb.client.MongoClient;
//import com.mongodb.MongoClientSettings;
//import com.mongodb.client.MongoClients;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;
//import org.bson.codecs.configuration.CodecRegistry;
//import org.bson.codecs.pojo.PojoCodecProvider;
//
//import java.util.List;
//
//import static com.mongodb.client.model.Filters.eq;
//import static java.util.Arrays.asList;
//import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
//import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
//
//public class VDPOJOS {
//    public static void main(String[] args) {
//        CodecRegistry pojoCodecRegistry = fromRegistries(com.mongodb.MongoClient.getDefaultCodecRegistry(),
//                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
//        MongoClientSettings settings = MongoClientSettings.builder()
//                .codecRegistry(pojoCodecRegistry)
//                .build();
//        MongoClient mongoClient =  MongoClients.create(settings);
//        MongoDatabase database = mongoClient.getDatabase("db1");
//      //  database = database.withCodecRegistry(pojoCodecRegistry);
//        MongoCollection<Person> collection = database.getCollection("col", Person.class);
//
//        Person ada = new Person("Ada Byron", 20, new Address("St James Square", "London", "W1"));
//        collection.insertOne(ada);
//        System.out.println("ok");
////        List<Person> people = asList(
////                new Person("Charles Babbage", 45, new Address("5 Devonshire Street", "London", "W11")),
////                new Person("Alan Turing", 28, new Address("Bletchley Hall", "Bletchley Park", "MK12")),
////                new Person("Timothy Berners-Lee", 61, new Address("Colehill", "Wimborne", null))
////        );
////
////        collection.insertMany(people);
////        Block<Person> printBlock = new Block<Person>() {
////            @Override
////            public void apply(final Person person) {
////                System.out.println(person);
////            }
////        };
////
////        collection.find().forEach(printBlock);
////        System.out.println("ok");
//
////        Person somebody = collection.find(eq("address.city", "Wimborne")).first();
////        System.out.println(somebody.getName());
//    }
//}
