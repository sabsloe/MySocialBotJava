
public class SocialBot
{
    String name;
        
    Netzwerk net = new Netzwerk();

    SocialBot(String name_)
    {
        name = name_;
    }
    
    
    public void nachrichtSenden(String stimmung, String grund)
    {
        String nachricht = "{\"name\": \""+ name +"\", \"stimmung\":\"" + stimmung + "\", \"grund\":\"" + grund + "\"}";
        net.post(nachricht); 
    }
}
