class PhoneProblem {
    String state;

    public void setState(String state) {
        this.state = state;
    }

    public void ring() {
        if (state.equals("Tone"))
            System.out.println("ring tone");
        else if (state.equals("Vibrate"))
            System.out.println("Vibrate continually");
        else if (state.equals("Mute"))
            System.out.println("the tone is muted");
    }

    public void notifications() {
        if (state.equals("Tone"))
            System.out.println("notifications tone");
        else if (state.equals("Vibrate"))
            System.out.println("Vibrate once");
        else if (state.equals("Mute"))
            System.out.println("the notifications is muted");
    }
}
