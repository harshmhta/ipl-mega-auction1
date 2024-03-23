package databasehandling;
import org.bson.Document;
import com.mongodb.BasicDBObject;
import com.mongodb.client.*;
import screens.Adminhomepage;
import screens.Login;
import screens.Playerhome;
import screens.TeamHomepage;
import screens.popup;

public class CheckCredentials
{
    
     static  String url =userRegister.url;
     static  MongoClient mongoClient =  MongoClients.create(url);
     static MongoDatabase db = mongoClient.getDatabase("IPLAuction");

    public static void  validate(String email , String password)
    {
        String Email = "";
        String pass = "";
        String Role ="";
        String ID = "";
        db.getCollection("Users");
        MongoCollection<org.bson.Document> collection = db.getCollection("Users");
        BasicDBObject searchQuery = new BasicDBObject();
        searchQuery.put("Email", email);
        MongoCursor<org.bson.Document> cursor = collection.find(searchQuery).iterator();
        
        while (cursor.hasNext()) {
           Document data =  cursor.next();
            Email = (String) data.get("Email"); //return the email
            pass  = (String) data.get("password");
            Role  = (String) data.get("Role");
            ID    = (String) data.get("ID");

        }
        //System.out.println(Email);
        //System.out.println(pass);
        
        if(Email.equals(email) && pass.equals(password))
        {
            Login.dispose_frame();
            if(Role.equals("admin"))
            {
                
                Adminhomepage.Admin_home();
            } 
            
            else if (Role.equals("TeamManager"))
            {
                //get in with the team id;
                TeamHomepage.set_teamid(ID);
                TeamHomepage.Team_home();
            } 
            
            else if (Role.equals("Player")) 
            {
                Playerhome home = new Playerhome(Email);
                home.Player_home();
            }

        }
        else
        {
            popup.popup_sreen("Invalid Credentials");
        }

        
    }
}

