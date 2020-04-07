package persistence;

import java.util.ArrayList;

import domain.PassengerWagon;
import domain.PassengerWagon;

public interface PassengerWagonDAO {
	public void addPassengerWagon(int amountSeats, boolean silent, double length, boolean toilet, String company, double weight);
	public PassengerWagon getPassengerWagon(int id);
	public boolean deletePassengerWagon(int id);
	public boolean updatePassengerWagon(int id, double length, double weight, int seats, boolean silent, boolean toilet, String company, String status);
	public boolean disconnectWagon(int id);
	public ArrayList<String> getIdByTrain(int trainId);
	boolean connectWagon(int wagonId, int trainId);
}
