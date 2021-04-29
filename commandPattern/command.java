interface Icommand {
    void execute();

    void undo();
}

// Command1
class TurnLightOnCommand implements Icommand {
    Light light;

    TurnLightOnCommand(Light l) {
        this.light = l;
    }

    @Override
    public void execute() {
        this.light.turnOn();
    }

    @Override
    public void undo() {
        this.light.turnOff();
    }
}

// command 2
class TurnLightOffCommand implements Icommand {
    Light light;

    TurnLightOffCommand(Light l) {
        this.light = l;
    }

    @Override
    public void execute() {
        this.light.turnOff();
    }

    @Override
    public void undo() {
        this.light.turnOn();
    }
}

// receiver
class Light {
    void turnOn() {
        // turning on the light logic
        System.out.println("turn on lights");
    }

    void turnOff() {
        // turning off the light logic
        System.out.println("turn off lights");
    }
}

// Invoker
class RemoteControl {
    Icommand button1;
    Icommand button2;

    void setButton1(Icommand c) {
        this.button1 = c;
    }

    void setButton2(Icommand c) {
        this.button2 = c;
    }

    void click1() {
        this.button1.execute();
    }

    void click2() {
        this.button2.execute();
    }
}

class MainCommand {
    public static void main(String[] args) {
        Light lamb1 = new Light();
        RemoteControl r = new RemoteControl();
        r.setButton1(new TurnLightOnCommand(lamb1));
        r.click1();
        r.setButton2(new TurnLightOffCommand(lamb1));
        r.click2();
    }
}