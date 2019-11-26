package by.htp.task5.main;

import java.util.Arrays;
import java.util.List;
import by.htp.task5.entity.Tour;
import by.htp.task5.entity.TourFirm;
import by.htp.task5.entity.TypeOfRest;
import by.htp.task5.entity.TypeOfTransport;
import by.htp.task5.logic.TourFirmLogic;
import by.htp.task5.view.TourFirmView;

public class Main {

	public static void main(String[] args) {

		Tour tour1 = new Tour(7, true, TypeOfRest.SEATOUR, TypeOfTransport.BUS);
		Tour tour2 = new Tour(5, true, TypeOfRest.SEATOUR, TypeOfTransport.AIRPLANE);
		Tour tour3 = new Tour(1, false, TypeOfRest.SHOPTOUR, TypeOfTransport.BUS);
		Tour tour4 = new Tour(2, true, TypeOfRest.FESTIVAL, TypeOfTransport.BUS);
		Tour tour5 = new Tour(1, false, TypeOfRest.FESTIVAL, TypeOfTransport.BUS);
		Tour tour6 = new Tour(1, false, TypeOfRest.SPORNEVENT, TypeOfTransport.BUS);
		Tour tour7 = new Tour(3, true, TypeOfRest.SPORNEVENT, TypeOfTransport.AIRPLANE);
		Tour tour8 = new Tour(14, true, TypeOfRest.CRUISE, TypeOfTransport.LINER);
		Tour tour9 = new Tour(7, true, TypeOfRest.CRUISE, TypeOfTransport.LINER);
		Tour tour10 = new Tour(7, true, TypeOfRest.MOUNTTOUR, TypeOfTransport.AIRPLANE);
		Tour tour11 = new Tour(14, true, TypeOfRest.MOUNTTOUR, TypeOfTransport.AIRPLANE);
		Tour tour12 = new Tour(21, true, TypeOfRest.MOUNTTOUR, TypeOfTransport.AIRPLANE);
		Tour tour13 = new Tour(7, true, TypeOfRest.TREATMENT, TypeOfTransport.AIRPLANE);
		Tour tour14 = new Tour(14, true, TypeOfRest.TREATMENT, TypeOfTransport.BUS);
		Tour tour15 = new Tour(21, true, TypeOfRest.TREATMENT, TypeOfTransport.AIRPLANE);
		
		TourFirm tourFirm = new TourFirm();
			tourFirm.getTourFirm().add(tour1);
			tourFirm.getTourFirm().add(tour2);
			tourFirm.getTourFirm().add(tour3);
			tourFirm.getTourFirm().add(tour4);
			tourFirm.getTourFirm().add(tour5);
			tourFirm.getTourFirm().add(tour6);
			tourFirm.getTourFirm().add(tour7);
			tourFirm.getTourFirm().add(tour8);
			tourFirm.getTourFirm().add(tour9);
			tourFirm.getTourFirm().add(tour10);
			tourFirm.getTourFirm().add(tour11);
			tourFirm.getTourFirm().add(tour12);
			tourFirm.getTourFirm().add(tour13);
			tourFirm.getTourFirm().add(tour14);
			tourFirm.getTourFirm().add(tour15);
		
		TourFirmView view = new TourFirmView();
		TourFirmLogic logic = new TourFirmLogic();
		// view.tourFirmView(tourFirm);
		
		// Сортируем по типу отдыха
		List<Tour> sortByTipeOfRest = logic.sortByTipeOfRest(tourFirm);
		tourFirm.setTourFirm(sortByTipeOfRest);
		view.tourFirmView(tourFirm);
		
		// Сортируем по виду транспорта
		List<Tour> sortByTipeOfTransport = logic.sortByTipeOfTransport(tourFirm);
		tourFirm.setTourFirm(sortByTipeOfTransport);
		view.tourFirmView(tourFirm);
		
		// Сортируем по количеству дней
		List<Tour> sortByDuration = logic.sortByDuration(tourFirm);
		tourFirm.setTourFirm(sortByDuration);
		view.tourFirmView(tourFirm);
		
		// Поиск по количеству дней
		int minDuration = logic.searchMinDuration(tourFirm);
		int maxDuration = logic.searchMaxDuration(tourFirm);
		int minDurationUser = view.tourDuration(minDuration, maxDuration);
		int maxDurationUser = view.tourDuration(minDurationUser, maxDuration);
		List<Tour> searchByDuration = logic.searchByDuration(tourFirm, minDurationUser, maxDurationUser);
		view.tourFirmView(searchByDuration);
		
		// Поиск по виду виду отдыха
		TypeOfRest[] searchByTypeOfRest = TypeOfRest.values();
		int number = view.tourRest(searchByTypeOfRest);
		List<Tour> searchTypeOfRest = logic.searchByTypeOfRest(tourFirm, number, searchByTypeOfRest);
		view.tourFirmView(searchTypeOfRest);
		
		// Поиск по виду транспорта
		TypeOfTransport[] searchByTypeOfTransport = TypeOfTransport.values();
		number = view.tourTransport(searchByTypeOfTransport);
		List<Tour> searchTypeOfTransport = logic.searchByTypeOfTransport(tourFirm, number, searchByTypeOfTransport);
		view.tourFirmView(searchTypeOfTransport);
		
	}

}
