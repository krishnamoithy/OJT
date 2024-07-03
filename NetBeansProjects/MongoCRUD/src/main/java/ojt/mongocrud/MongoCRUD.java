/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ojt.mongocrud;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;

/**
 *
 * @author krishnamoorthy   
 */
public class MongoCRUD {
    
    //connection details
    private static final String CONNECTION_STRING="mongodb://localhost:27017";
    private static final String DATABASE_NAME="Nsti";
    private static final String COLLECTION_NAME="StudDetails";
    
    public static void createStud(String studid,String studname,String studcourse){
        try(MongoClient mc = MongoClients.create(CONNECTION_STRING)){
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
            
            Document stud = new Document("studid",studid).append("studname",studname).append("studcourse",studcourse);
            
            col.insertOne(stud);
            System.out.println("Student details created: "+stud.toJson());
        }
    }
    
    public static void readStud(){
        try(MongoClient mc = MongoClients.create(CONNECTION_STRING)){
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
            
            FindIterable<Document> studs = col.find();
                
        System.out.println("Stud details: ");
        for(Document obj:studs){
            System.out.println(obj.toJson());
        }
    }
    }
    
    public static void updateStud(String _id, String studid){
        try(MongoClient mc = MongoClients.create(CONNECTION_STRING)){
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
            
            col.updateOne(Filters.eq("studid",studid),Updates.set("Studname",studname));
            System.out.println("Student ID updated: ");
    }
    }
    
    public static void deleteStud(String studname){
        try(MongoClient mc = MongoClients.create(CONNECTION_STRING)){
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
            
            col.deleteOne(Filters.eq("studname",studname));
            System.out.println("Student detail deleted");
        }
    }
    public static void main(String[] args) {
//        System.out.println("Hello World!");
            //createStud("1","KRISHNA","JAVA");
            //updatestud("1","moorthy");
            readStud();
//            updateStud("ObjectId('66839abd6a4cc6359df6ce42')", "1");
//            deleteStud();
    }
}