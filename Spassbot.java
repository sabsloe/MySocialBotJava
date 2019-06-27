
public class Spassbot extends SocialBot
{

    Spassbot(String name)
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
