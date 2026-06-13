import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookingService {

    private List<Train> trainList = new ArrayList<>();

    private List<Ticket> ticketList = new ArrayList<>();

    public BookingService() {
        trainList.add(new Train(101, "Rajdhani Exp", "Delhi", "Nagpur", 100));
        trainList.add(new Train(102, "Duronto Exp", "Delhi", "Mumbai", 60));
        trainList.add(new Train(103, "Shatabdi Exp", "Delhi", "Goa", 90));
        trainList.add(new Train(104, "Tejas Exp", "Delhi", "Paris", 100));
        trainList.add(new Train(105, "Vande Bharat Exp", "Delhi", "Switzerland", 80));
        trainList.add(new Train(106, "Intercity Exp", "Delhi", "Bey of Bengal", 80));
    }

    public List<Train> searchTrain(String source, String destination) {
        List<Train> res = new ArrayList<>();

        for (Train train: trainList){
            if (train.getSource().equalsIgnoreCase(source) && train.getDestination().equalsIgnoreCase(destination)){
                res.add(train);
            }
        }

        return res;
    }

    public Ticket bookTicket(User user, int trainId, int seatCount) {
        for (Train train: trainList){
            if (train.getTrainId()== trainId) {
                if (train.bookSeats(seatCount)) {
                    Ticket ticket = new Ticket(user,train,seatCount);
                    ticketList.add(ticket);
                    return ticket;
                }
                else {
                    System.out.println("No enough Seats available");
                    return null;
                }
            }
        }
        System.out.println("Train Id Not found");
        return null;
    }

    public List<Ticket> getTicketByUser(User user) {
        List<Ticket> res = new ArrayList<>();
        for (Ticket ticket:ticketList){
            if (ticket.getUser().getUsername().equalsIgnoreCase(user.getUsername())){
                res.add(ticket);
            }
        }

        return res;
    }

    public boolean cancelTicket(int ticketId, User user){
        Iterator<Ticket> iterator = ticketList.listIterator();
        while (iterator.hasNext()){
            Ticket ticket = iterator.next();
            if (ticket.getTicketId() == ticketId &&
                    ticket.getUser().getUsername().equalsIgnoreCase(user.getUsername())){
                Train train = ticket.getTrain();
                train.cancelSeats(ticket.getSeatBooked());
                iterator.remove();
                System.out.println("Ticket " + ticketId + " Cancelled");
                return true;
            }
        }

        System.out.println("Ticket not found or does not belong to current user");
        return false;
    }

    public void listAllTrains(){
        System.out.println("List of All trains: ");
        for (Train train: trainList) {
            System.out.println(train);
        }
    }
}
