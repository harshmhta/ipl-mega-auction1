package Auctionhandeling;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import screens.Adminhomepage;
import screens.AuctionDisplay;
import screens.AuctionDisplayteam;
import screens.Myprofile;
import screens.Playerhome;
import screens.TeamHomepage;
import screens.playerAuction;
import screens.playerlist;
import screens.popup;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import org.bson.Document;

public class Get_players {

  static LinkedList<ArrayList<String>> linklist = new LinkedList<ArrayList<String>>();
  static int i = 0 ;
  static int j = 0 ;
    static final String url ="mongodb+srv://Singh:0T4px6E8Of7YIisU@singh.rdxxovq.mongodb.net/?retryWrites=true&w=majority"; 
    static  MongoClient mongoClient =  MongoClients.create(url);
     //Func.print("Connected Successfully!!!!!!!!!");
    static  MongoDatabase db = mongoClient.getDatabase("IPLAuction");
   
    public static void getplayer()
    {
        db.getCollection("playerList");
        MongoCollection<Document> collection = db.getCollection("playerList");

        //Retrieving the documents
        FindIterable<Document> iterDoc = collection.find();
        Iterator<Document> it = iterDoc.iterator();
        while (it.hasNext()) {
          ArrayList<String> list = new ArrayList<String>();
        Document data =  it.next();
       String name=(String)data.get("Name");
       String age=(String)data.get("Age");
       String country=(String)data.get("Country");
       String specialism=(String)data.get("Specialism");
       String batting=(String)data.get("Batting");
       String bowling=(String)data.get("Bowling");
       String matches=(String)data.get("No of Ipl matches");
       String cua=(String)data.get("C/U/A");
       String  bp=(String)data.get("Base Price"); 
       String email =(String)data.get("Email");
       list.add(name);
       list.add(age);
       list.add(country);
       list.add(specialism);
       list.add(batting);
       list.add(bowling);
       list.add(matches);
       list.add(cua);
       list.add(bp); 
       list.add(email);
       linklist.add(list);
        
      }

    }
    public static void get_next()
    {
      
      i = i+1; 
      if(i<linklist.size())
      {
        ArrayList<String> abc= linklist.get(i);
        AuctionDisplay.dispose_frame();
        AuctionDisplay.enter_auction(abc);
      }
      else if(i>=linklist.size())
      {
       
        
        if(i == linklist.size() && unsoldplayerhnadeling.Queue_empty())
        {
          popup.popup_sreen("Done with first Stage");
          try {
            // Delay for 1 seonds
            Thread.sleep(500);   
            }
            catch (InterruptedException ex)
            {
              ex.printStackTrace();
            }
  
            popup.popup_sreen("Starting with unsold players");
            
            try {
              // Delay for 1 seonds
              Thread.sleep(2500);   
              }
              catch (InterruptedException ex)
              {
                ex.printStackTrace();
              }
              unsoldplayerhnadeling.get_unsold();
        }
        else if(i>=linklist.size() && !unsoldplayerhnadeling.Queue_empty())
        {
          unsoldplayerhnadeling.get_unsold();
        }
        else 
        {
          popup.popup_sreen("No player Remains in Unsold List");
        }

        
      }
      
    }


    public static void get_one()
    {
        ArrayList<String> abc= linklist.get(j);
       j = j+1;
       if(j>=linklist.size()){
        j = linklist.size()-1;
        playerlist.player_list(linklist.get(j));
        popup.popup_sreen("No more Players avaliable");
        return;}
       playerlist.player_list(abc);
    }
    public static void get_previous()
    {
       j = j-1; 
       if(j<0)
       {  j = 0 ;
          ArrayList<String> abc= linklist.get(0);
          playerlist.player_list(abc);
          popup.popup_sreen("End of List");
          return;}
           
       else 
       { 
          ArrayList<String> abc= linklist.get(j);
          playerlist.player_list(abc);
       }
       
    }
    public static void get_same_admin()
    {
      if(i>=linklist.size())
      {
       popup.popup_sreen("Auction already Finished");
      }
      else 
      {
        Adminhomepage.dispose_frame();
        ArrayList<String> abc= linklist.get(i);
        AuctionDisplay.enter_auction(abc);
      }
    
    }
    public static void get_same_team(String name)
    {
      if(i>=linklist.size())
      {
       popup.popup_sreen("Auction already Finished");
      }
      else 
      {
        TeamHomepage.dispose_frame();
      ArrayList<String> abc= linklist.get(i);
      AuctionDisplayteam.set_initialamount(abc.get(8));
      AuctionDisplayteam.enter_auction(abc,abc.get(8));}
    
    }


    public static void delete_this()
    { j = j -1; 
      linklist.remove(j);
      get_one();
      try {
        Thread.sleep(500);   
      }
      catch (InterruptedException ex)
      {
          ex.printStackTrace();
      }
      popup.popup_sreen("Player Deleted Successfully");

    }

    public static void getmyprofile(String email)
    {
      // iterate through 
      for (int i = 0; i < linklist.size(); i++) 
      {
        ArrayList<String> abc= linklist.get(i);
        if(abc.get(9).equals(email))
        {
          Myprofile.myprofile(abc);
        
        }

       
      }

    }
    public static void seeAuction(String Email)
      {
        if(i>=linklist.size())
      {
       popup.popup_sreen("Auction already Finished");
      }
      else
       {
        Playerhome.dispose_frame();
        ArrayList<String> abc= linklist.get(i);
        playerAuction auct = new playerAuction(Email);
        auct.enter_auction(abc);
       }
       }

    }