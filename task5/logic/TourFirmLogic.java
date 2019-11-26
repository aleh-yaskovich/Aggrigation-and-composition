package by.htp.task5.logic;

import java.util.ArrayList;
import java.util.List;
import by.htp.task5.entity.Tour;
import by.htp.task5.entity.TourFirm;
import by.htp.task5.entity.TypeOfRest;
import by.htp.task5.entity.TypeOfTransport;

public class TourFirmLogic {
	
	// Сортируем по типу отдыха
	public List<Tour> sortByTipeOfRest (TourFirm tourFirm) {
		List<Tour> list = tourFirm.getTourFirm();
		int i = 0;
		Tour tmp = new Tour();
		while (i < list.size()-1) {
			String str1 = list.get(i).getTypeOfRest().getType();
			String str2 = list.get(i+1).getTypeOfRest().getType();
			if (str1.compareTo(str2) > 0) {
				tmp = list.get(i);
				list.set(i, list.get(i+1));
				list.set(i+1, tmp);
				i = 0;
			} else {
				i++;
			}
		}
		return list;
	}
	
	// Сортируем по виду транспорта
	public List<Tour> sortByTipeOfTransport (TourFirm tourFirm) {
		List<Tour> list = tourFirm.getTourFirm();
		int i = 0;
		Tour tmp = new Tour();
		while (i < list.size()-1) {
			String str1 = list.get(i).getTypeOfTransport().getType();
			String str2 = list.get(i+1).getTypeOfTransport().getType();
			if (str1.compareTo(str2) > 0) {
				tmp = list.get(i);
				list.set(i, list.get(i+1));
				list.set(i+1, tmp);
				i = 0;
			} else {
				i++;
			}
		}
		return list;
	}
	
	// Сортируем по количеству дней
	public List<Tour> sortByDuration (TourFirm tourFirm) {
		List<Tour> list = tourFirm.getTourFirm();
		int i = 0;
		Tour tmp = new Tour();
		while (i < list.size()-1) {
			int duration1 = list.get(i).getDuration();
			int duration2 = list.get(i+1).getDuration();
			if (duration1 > duration2) {
				tmp = list.get(i);
				list.set(i, list.get(i+1));
				list.set(i+1, tmp);
				i = 0;
			} else {
				i++;
			}
		}
		return list;
	}
	
	// Определяем минимальное к-во дней
	public int searchMinDuration (TourFirm tourFirm) {
		List<Tour> list = tourFirm.getTourFirm();
		int min = list.get(0).getDuration();
		for (int i = 0; i < list.size(); i++) {
			if (min > list.get(i).getDuration()) {
				min = list.get(i).getDuration();
			}
		}
		return min;
	}
	
	// Определяем максимальное к-во дней
	public int searchMaxDuration (TourFirm tourFirm) {
		List<Tour> list = tourFirm.getTourFirm();
		int max = list.get(0).getDuration();
		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i).getDuration()) {
				max = list.get(i).getDuration();
			}
		}
		return max;
	}
	
	// Поиск по продолжительности тура
	public List<Tour> searchByDuration (TourFirm tourFirm, int min, int max) {
		List<Tour> list = tourFirm.getTourFirm();
		List<Tour> itog = new ArrayList<Tour>();
		for (int i = 0; i < list.size(); i++) {
			int tmp = list.get(i).getDuration();
			if (tmp >= min && tmp <= max) {
				itog.add(list.get(i));
			}
		}
		return itog;
	}
	
	// Поиск по типу отдыха
	public List<Tour> searchByTypeOfRest (TourFirm tourFirm, int number, TypeOfRest[] arr) {
		List<Tour> list = tourFirm.getTourFirm();
		List<Tour> itog = new ArrayList<Tour>();
		String str = arr[number].getType();
		for (int i = 0; i < list.size(); i++) {
			String tmp = list.get(i).getTypeOfRest().getType();
			if (tmp.compareTo(str) == 0) {
				itog.add(list.get(i));
			}
		}
		return itog;
	}
	
	// Поиск по типу транспорта
	public List<Tour> searchByTypeOfTransport (TourFirm tourFirm, int number, TypeOfTransport[] arr) {
		List<Tour> list = tourFirm.getTourFirm();
		List<Tour> itog = new ArrayList<Tour>();
		String str = arr[number].getType();
		for (int i = 0; i < list.size(); i++) {
			String tmp = list.get(i).getTypeOfTransport().getType();
			if (tmp.compareTo(str) == 0) {
				itog.add(list.get(i));
			}
		}
		return itog;
	}
	
}
