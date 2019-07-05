import com.mongodb.reactivestreams.client.*;
import org.bson.Document;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class MongoDBWithReactive {
    public static void main(String[] args) throws Throwable {
        MongoClient mongoClient = MongoClients.create();
        MongoDatabase database = mongoClient.getDatabase("db1");
        MongoCollection<Document> collection = database.getCollection("mycol");
//        SubscriberHelpers.ObservableSubscriber subscriber = new SubscriberHelpers.ObservableSubscriber<Success>();
//        collection.drop().subscribe(subscriber);
//        subscriber.await();
//        Document doc = new Document("name", "MongoDB")
//                .append("type", "database")
//                .append("count", 1)
//                .append("info", new Document("x", 500).append("y", 102));
//        collection.insertOne(doc).subscribe(subscriber);
//        subscriber.await();
//
//        Publisher<Success> publisher = collection.insertOne(doc);
//        publisher.subscribe(new Subscriber<Success>() {
//            @Override
//            public void onSubscribe(final Subscription s) {
//                s.request(1);  // <--- Data requested and the insertion will now occur
//            }
//
//            @Override
//            public void onNext(final Success success) {
//                System.out.println("Inserted");
//            }
//
//            @Override
//            public void onError(final Throwable t) {
//                System.out.println("Failed");
//            }
//
//            @Override
//            public void onComplete() {
//                System.out.println("Completed");
//            }
//        });
//        Thread.sleep(1000);
        collection.count()
                .subscribe(new SubscriberHelpers.PrintSubscriber<Long>("total # of documents after inserting "
                        + " 100 small ones (should be 101): %s"));

       // collection.countDocuments().subscribe(i-> System.out.println("a"));
        Thread.sleep(1000);
    }
}
