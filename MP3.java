public class MP3 extends Gadget 
{
    private int availableMemory;
    
    public MP3(String model, double price, int weight, String size, int availableMemory)
    {
        super(model, price, weight, size);
        this.availableMemory = availableMemory;
    }
    //Access method availableMemory 
    public int getavailableMemory()
    {
        return availableMemory;
    }
    //method download music 
    public void downloadMusic(int memoryRequired)
    {
        if (memoryRequired <= availableMemory)
        {
            availableMemory -= memoryRequired;
            System.out.println("Music downloaded successfully.");}
            else 
            {
                System.out.println("Not enough memory available to download the music.");
            }
        }
        //method to MP3 player details 
        public void display()
        {
            super.display();
            System.out.println("Available Memory: " + availableMemory + "MB");
        }
        public void deleteMusic(int memoryFreed)
        {
            availableMemory += memoryFreed;
            System.out.println("Music deleted successfully.Available memory become greater.");
        }
        public static void main(String[] args)
        {
            MP3 mp3Player = new MP3("Example Model", 50.90,20, "71mm x 137mm x 9mm", 100);
            mp3Player.display();
            mp3Player.downloadMusic(200);
            mp3Player.display(); //shows updated details
            mp3Player.deleteMusic(100);
            mp3Player.display(); //shows updated details after deleting music
        }
}