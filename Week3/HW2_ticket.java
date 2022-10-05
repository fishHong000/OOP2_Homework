import java.util.concurrent.ThreadLocalRandom;

public class HW2_ticket {
    public static void main(String[] args) {
        ticketMachine t1 = new ticketMachine("Machine A");
        ticketMachine t2 = new ticketMachine("Machine B");
        ticketMachine t3 = new ticketMachine("Machine C");
        ticketMachine t4 = new ticketMachine("Machine D");
    }
}

class ticketMachine implements Runnable {
    
    static int tickets = 10000;
    int tTicket;
    Thread t;
    static int getNumber;
    
    ticketMachine(String name) {
        tTicket = 0;
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
        while (takeTicket(this)) {
        }
        System.out.println(t.getName() + " totally sold " + tTicket + " tickets.");
    }

    private synchronized static boolean takeTicket(ticketMachine machine) {

        if (tickets > 3) {
            getNumber = ThreadLocalRandom.current().nextInt(1, 5);
            tickets = tickets - getNumber;
            machine.tTicket = machine.tTicket + getNumber;
            return true;
            
        } else if (tickets == 3) {
            getNumber = ThreadLocalRandom.current().nextInt(1, 4);
            tickets = tickets - getNumber;
            machine.tTicket = machine.tTicket + getNumber;
            return true;
            
        } else if (tickets == 2) {
            getNumber = ThreadLocalRandom.current().nextInt(1, 3);
            tickets = tickets - getNumber;
            machine.tTicket = machine.tTicket + getNumber;
            return true;
            
        } else if (tickets == 1) {
            getNumber = ThreadLocalRandom.current().nextInt(1, 2);
            tickets = tickets - getNumber;
            machine.tTicket = machine.tTicket + getNumber;
            return true;
            
        } else {
            return false;
        }
    }
}
