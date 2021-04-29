interface MobileAlertState  
{
    void ring();
    void notifications();
}

class ToneState implements MobileAlertState
{
    public void ring ()
    {
        // ring tone logic
        System.out.println( "ring tone" );
    }
    public void notifications ()
    {
        // notification tone logic
        System.out.println( "notifications tone" );
    }
}

class VibrateState implements MobileAlertState
{
    public void ring ()
    {
        // ring vibrate logic
        System.out.println( "Vibrate continually" );
    }
    
    public void notifications ()
    {
        // notification vibrate logic
        System.out.println( "Vibrate Once" );
    }
}

class MuteState implements MobileAlertState
{
    
    public void ring ()
    {
        // ring mute logic
        System.out.println( "the tone is muted" );
    }
    
    public void notifications ()
    {
        // notification mute logic
        System.out.println( "the notification in muted" );
    }
}
class Phone {
    private MobileAlertState currentState;
    void setState (MobileAlertState newState)
    {
        currentState = newState;
    }
    void ring ()
    {
        currentState.ring();
    }
    void notifications ()
    {
        currentState.notifications();
    }
}
class Main
{
    public static void main(String[] args)
    {
        Phone phone = new Phone();
        phone.setState(new ToneState());
        phone.ring();
        phone.notifications();

        phone.setState(new VibrateState());
        phone.ring();
        phone.notifications();

        phone.setState(new MuteState());
        phone.ring();
        phone.notifications();
    }
}