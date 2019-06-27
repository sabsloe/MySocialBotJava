
public class SpassBot extends SocialBot
{

    SpassBot(String name) 
    {
        super(name);
    }

    void nachrichtSenden()
    {
       
        for (int i = 0; i < 100; i++)
        { 
            super.nachrichtSenden("Mist!","Warum nicht?");
            
        }
    }

}
