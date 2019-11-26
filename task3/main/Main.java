package by.htp.task3.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.task3.entity.City;
import by.htp.task3.entity.District;
import by.htp.task3.entity.Region;
import by.htp.task3.entity.State;
import by.htp.task3.logic.RegionLogic;
import by.htp.task3.logic.StateLogic;
import by.htp.task3.view.StateView;

public class Main {

	public static void main(String[] args) {

		City brest = new City("Brest");
		City baranovichi = new City("Baranovichi");
		City pinsk = new City("Pinsk");
		City vitebsk = new City("Vitebsk");
		City polotsk = new City("Polotsk");
		City orsha = new City("Orsha");
		City gomel = new City("Gomel");
		City mozyr = new City("Mozyr");
		City rechitsa = new City("Rechitsa");
		City grodno = new City("Grodno");
		City lida = new City("Lida");
		City novogrudok = new City("Novogrudok");
		City minsk = new City("Minsk");
		City soligorsk = new City("Soligorsk");
		City molodechno = new City("Molodechno");
		City borisov = new City("Borisov");
		City mogilev = new City("Mogilev");
		City bobrujsk = new City("Bobrujsk");
		City rogochev = new City("Rogochev");
		
		District brestDistrict = new District("Brest District", 2875, brest);
		District baranovichiDistrict = new District("Baranovichi District", 3112, baranovichi);
		District pinskDistrict = new District("Pinsk District", 3261, pinsk);
		District vitebskDistrict = new District("Vitebsk District", 2998, vitebsk);
		District polotskDistrict = new District("Polotsk District", 2890, polotsk);
		District orshaDistrict = new District("Orsha District", 2546, orsha);
		District gomelDistrict = new District("Gomel District", 2753, gomel);
		District mozyrDistrict = new District("Mozyr District", 3005, mozyr);
		District rechitsaDistrict = new District("Rechitsa District", 3100, rechitsa);
		District grodnoDistrict = new District("Grodno District", 2521, grodno);
		District lidaDistrict = new District("Lida District", 2378, lida);
		District novogrudokDistrict = new District("Novogrudok District", 2967, novogrudok);
		District minskDistrict = new District("Minsk District", 2457, minsk);
		District soligorskDistrict = new District("Soligorsk District", 3087, soligorsk);
		District molodechnoDistrict = new District("Molodechno District", 2996, molodechno);
		District borisovDistrict = new District("Borisov District", 2877, borisov);
		District mogilevDistrict = new District("Mogilev District", 3002, mogilev);
		District bobrujskDistrict = new District("Bobrujsk District", 2567, bobrujsk);
		District rogochevDistrict = new District("Rogochev District", 2998, rogochev);
		
		List<District> brestReg = new ArrayList();
			brestReg.add(brestDistrict);
			brestReg.add(baranovichiDistrict);
			brestReg.add(pinskDistrict);
		List<District> vitebskReg = new ArrayList();
			vitebskReg.add(vitebskDistrict);
			vitebskReg.add(polotskDistrict);
			vitebskReg.add(orshaDistrict);
		List<District> gomelReg = new ArrayList();
			gomelReg.add(gomelDistrict);
			gomelReg.add(mozyrDistrict);
			gomelReg.add(rechitsaDistrict);
		List<District> grodnoReg = new ArrayList();
			grodnoReg.add(grodnoDistrict);
			grodnoReg.add(lidaDistrict);
			grodnoReg.add(novogrudokDistrict);
		List<District> minskReg = new ArrayList();
			minskReg.add(minskDistrict);
			minskReg.add(soligorskDistrict);
			minskReg.add(molodechnoDistrict);
			minskReg.add(borisovDistrict);
		List<District> mogilevReg = new ArrayList();
			mogilevReg.add(mogilevDistrict);
			mogilevReg.add(bobrujskDistrict);
			mogilevReg.add(rogochevDistrict);
		
		Region brestRegion = new Region("Brest Region", 0, brest, brestReg);
		Region vitebskRegion = new Region("Vitebsk Region", 0, vitebsk, vitebskReg);
		Region gomelRegion = new Region("Gomel Region", 0, gomel, gomelReg);
		Region grodnoRegion = new Region("Grodno Region", 0, grodno, grodnoReg);
		Region minskRegion = new Region("Minsk Region", 0, minsk, minskReg);
		Region mogilevRegion = new Region("Mogilev Region", 0, mogilev, mogilevReg);
		
		RegionLogic regLogic = new RegionLogic();
			brestRegion.setAreaRegion(regLogic.calculateAreaRegion(brestRegion.getDistrics()));
			vitebskRegion.setAreaRegion(regLogic.calculateAreaRegion(vitebskRegion.getDistrics()));
			gomelRegion.setAreaRegion(regLogic.calculateAreaRegion(gomelRegion.getDistrics()));
			grodnoRegion.setAreaRegion(regLogic.calculateAreaRegion(grodnoRegion.getDistrics()));
			minskRegion.setAreaRegion(regLogic.calculateAreaRegion(minskRegion.getDistrics()));
			mogilevRegion.setAreaRegion(regLogic.calculateAreaRegion(mogilevRegion.getDistrics()));
		
		List<Region> regions = new ArrayList();
			regions.add(brestRegion);
			regions.add(vitebskRegion);
			regions.add(gomelRegion);
			regions.add(grodnoRegion);
			regions.add(minskRegion);
			regions.add(mogilevRegion);
		
		State belarus = new State("Belarus", 0, minsk, regions);
		
		StateLogic stateLogic = new StateLogic();
		belarus.setAreaState(stateLogic.calculateAreaState(belarus.getRegions()));
		
		// выводим столицу на консоль
		StateView stateView = new StateView();
		stateView.viewCapital(belarus);
		
		// выводим количество областей
		stateView.viewCountRegions(belarus);
		
		// выводим площадь государства
		stateView.viewStateArea(belarus);
		
		// выводим областные центры
		stateView.viewCenterRegion(belarus);

	}

}
