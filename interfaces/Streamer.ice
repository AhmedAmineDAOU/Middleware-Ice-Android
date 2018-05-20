module player
{
    interface Streamer
    {
        void printString(string s);
        void launchFlux(string url,int duration);
        void stopFlux();
    }
}