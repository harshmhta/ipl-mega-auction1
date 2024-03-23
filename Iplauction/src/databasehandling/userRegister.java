//For adding a user and Creating a players profile
package databasehandling;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoClient;
import java.util.ArrayList;
import org.bson.Document;
import screens.*;
public class userRegister
{
       static final String url ="mongodb+srv://Singh:0T4px6E8Of7YIisU@singh.rdxxovq.mongodb.net/?retryWrites=true&w=majority"; 
       static  MongoClient mongoClient =  MongoClients.create(url);
        //Func.print("Connected Successfully!!!!!!!!!");
       static  MongoDatabase db = mongoClient.getDatabase("IPLAuction");
    public static void addplalyer(ArrayList<String> list)
    {
        if(userdata.validate)
            db.getCollection("playerList");
            MongoCollection<org.bson.Document> collection = db.getCollection("playerList");
            Document docs = new Document();
            docs.put("Email", list.get(0));
            docs.put("Password",  list.get(1));
            docs.put("Name",  list.get(2));
            docs.put("Age",list.get(3)  );
            docs.put("Country", list.get(4));
            docs.put("Specialism", list.get(6));
            docs.put("Batting", list.get(7));
            docs.put("Bowling", list.get(8));
            docs.put("No of Ipl matches", list.get(5));
            docs.put("C/U/A",list.get(9));
            docs.put("Base Price",  list.get(10));

            if(!userdata.exists(list.get(0)))
            {
                collection.insertOne(docs);
                userdata.Createuser(list, "Player");
            }
            else
                {popup.popup_sreen("Email is already registered,Enter valid Email");}
            
            Login.login();
    }

   
   
}