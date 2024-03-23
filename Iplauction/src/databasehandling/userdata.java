package databasehandling;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import screens.Login;
import screens.Registerteam;
import screens.Signup;
import screens.popup;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoClient;
import java.util.ArrayList;
import org.bson.Document;
public class userdata {

    static  String url =userRegister.url;
    static MongoClient mongoClient =  MongoClients.create(url);
    static MongoDatabase db = mongoClient.getDatabase("IPLAuction");
    
public static boolean validate;

    public static void addTeam(ArrayList<String> list)
    {
            
            db.getCollection("IPLTeams");
            MongoCollection<org.bson.Document> collection = db.getCollection("IPLTeams");
            //System.out.println("collection is ready");
            Document docs = new Document();
            docs.put("Teamname",list.get(2));
            docs.put("TeamManagerName",list.get(3) );
            docs.put("TeamID",list.get(4) );
            docs.put("Email", list.get(0));
            docs.put("password",  list.get(1));
            docs.put("Amount",  list.get(5));

            if(!exists(list.get(0)))
            {
                collection.insertOne(docs);
                Createuser(list, "TeamManager");
            }
            else
            {
                popup.popup_sreen("Email is already registered");
            }
            
    }
    public static void Createuser(ArrayList<String> list , String role)
    {
            db.getCollection("Users");
            MongoCollection<org.bson.Document> collection2 = db.getCollection("Users");
            Document docs = new Document();
            docs.put("Email", list.get(0));
            docs.put("password",list.get(1));
            docs.put("Role", role);
            docs.put("ID", list.get(4));
            collection2.insertOne(docs); 
            if(!role.equals("TeamManager"))
            {
            Signup.dispose_frame();  
            popup.popup_sreen("User added  successfully");
            Login.login();
            }
            else 
            {
                
                Registerteam.dispose_frame();
                Registerteam.RegisterTeam();
                popup.popup_sreen("Team added successfully");
            }
            
    }
    public static boolean exists(String email)
    {
        String Email ="";
        db.getCollection("Users");
        MongoCollection<org.bson.Document> collection = db.getCollection("Users");
        BasicDBObject searchQuery = new BasicDBObject();
        searchQuery.put("Email", email);
        MongoCursor<org.bson.Document> cursor = collection.find(searchQuery).iterator();
        
        while (cursor.hasNext()) {
           Document data =  cursor.next();
            Email =(String) data.get("Email"); //return the email
           
        }
        if(!Email.equals(""))
        {
                System.out.println("User exist");
                return true;
        }
        
        return false;
    }
    
}
