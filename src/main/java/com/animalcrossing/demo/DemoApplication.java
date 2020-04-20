package com.animalcrossing.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Array;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner initData(BugsRepository bugsRepository, FishRepository fishRepository){

		return (args) -> {


			//bugs
			Bugs agriasButterfly  = new Bugs("Agrias_Butterfly",
					Arrays.asList( "April", "May", "June", "July", "August", "September"),
					Arrays.asList("January", "February", "September", "October", "November", "December"),
					"Flying",
					"Rare",
					3000.00,
					"8:00-17:00");

			bugsRepository.save(agriasButterfly);
			Bugs ant = new Bugs ("Ant",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Rotten turnips or fruits",
					"Common",
					80.00,
					"All day");
			bugsRepository.save(ant);
			Bugs atlasMoth = new Bugs ("Atlas_Moth",
					Arrays.asList("April", "May", "June", "July", "August", "September"),
					Arrays.asList("January", "February", "March", "October", "November", "December"),
					"Trees",
					"Rare",
					3000.00,
					"19:00-4:00");
			bugsRepository.save(atlasMoth);
			Bugs bagWorm = new Bugs ("Bagworm",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Shaking Trees",
					"Uncommon",
					600.00,
					"All day");
			bugsRepository.save(bagWorm);
			Bugs bandedDragonfly = new Bugs ("Banded_Dragonfly",
					Arrays.asList("May", "June", "July", "August", "September", "October"),
					Arrays.asList("January", "February", "March", "April", "November", "December"),
					"Flying",
					"Rare",
					4500.00,
					"8:00-17:00");
			bugsRepository.save(bandedDragonfly);
			Bugs bellCricket = new Bugs ("Bell_Cricket",
					Arrays.asList("March", "April"),
					Arrays.asList( "September", "October"),
					"On the ground",
					"Uncommon",
					430.00,
					"17:00-8:00");
			bugsRepository.save(bellCricket);
			Bugs blueWeevilBeetle = new Bugs ("Blue_Weevil_Beetle",
					Arrays.asList("July", "August"),
					Arrays.asList( "July", "August"),
					"On Palm Trees",
					"Common",
					800.00,
					"All day");
			bugsRepository.save(blueWeevilBeetle);
			Bugs brownCicada = new Bugs("Brown_Cicada",
					Arrays.asList("July", "August"),
					Arrays.asList("July", "August"),
					"Trees",
					"Common",
					200.00,
					"8:00-17:00");
			bugsRepository.save(brownCicada);
			Bugs centipede = new Bugs("Centipede",
					Arrays.asList( "January", "February", "March", "April", "May", "June", "September", "October", "November", "December"),
					Arrays.asList(  "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Hitting rocks",
					"Rare",
					430.00,
					"16:00-23:00");
			bugsRepository.save(centipede);
			Bugs cicadaShell = new Bugs("Cicada_Shell",
					Arrays.asList("July", "August"),
					Arrays.asList("July", "August"),
					"Trees",
					"Common",
					10.00,
					"All day");
			bugsRepository.save(cicadaShell);
			Bugs citrusLongHornedBeetle = new Bugs ("Citrus_Long-horned_Beetle",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"On Tree Stumps",
					"Rare",
					350.00,
					"All day");
			bugsRepository.save(citrusLongHornedBeetle);
			Bugs  commonBluebottle = new Bugs ("Common_Bluebottle",
					Arrays.asList("April", "May", "June", "July", "August", "September"),
					Arrays.asList("April", "May", "June", "July", "August", "September"),
					"Flying",
					"Common",
					300.00,
					"4:00-19:00");
			bugsRepository.save(commonBluebottle);
			Bugs commonButterfly = new Bugs("Common_Butterfly",
					Arrays.asList("January", "February", "March", "April", "May", "June", "September", "October", "November", "December"),
					Arrays.asList("March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Flying",
					"Common",
					160.00,
					"4:00-19:00");
			bugsRepository.save(commonButterfly);
			Bugs cricket = new Bugs ("Cricket",
					Arrays.asList("September", "October", "November"),
					Arrays.asList( "March", "April", "May"),
					"On the ground",
					"Common",
					130.00,
					"17:00-8:00");
			bugsRepository.save(cricket);
			Bugs cyclommatusStag = new Bugs ("Cyclommatus_Stag",
					Arrays.asList("July", "August"),
					Arrays.asList("July", "August"),
					"On Palm Trees",
					"Rare",
					8000.00,
					"17:00-8:00");
			bugsRepository.save(cyclommatusStag);
			Bugs damselfly= new Bugs ("Damselfly",
					Arrays.asList("January", "February", "November", "December"),
					Arrays.asList("January", "February", "November", "December"),
					"Flying",
					"Uncommon",
					500.00,
					"All day");
			bugsRepository.save(damselfly);
			Bugs darnerDragonfly = new Bugs ("Darner_Dragonfly",
					Arrays.asList("April", "May", "June", "July", "August", "September", "October"),
					Arrays.asList("January", "February", "March", "April", "October", "November", "December"),
					"Flying",
					"Common",
					230.00,
					"8:00-17:00");
			bugsRepository.save(darnerDragonfly);
			Bugs divingBeetle = new Bugs ("Diving_Beetle",
					Arrays.asList("May", "June", "July", "August", "September"),
					Arrays.asList("January", "February", "March","November", "December"),
					"on Ponds and Rivers",
					"Uncommon",
					500.00,
					"8:00-19:00");
			bugsRepository.save(divingBeetle);
			Bugs droneBeetle = new Bugs ("Drone_Beetle",
					Arrays.asList("June", "July", "August"),
					Arrays.asList("June", "July", "August"),
					"On Trees",
					"Common",
					200.00,
					"All day");
			bugsRepository.save(droneBeetle);
			Bugs dungBeetle = new Bugs ("Dung_Beetle",
					Arrays.asList("June", "July", "August"),
					Arrays.asList("January", "February", "December"),
					"Rolling Snowballs",
					"Uncommon",
					3000.00,
					"All day");
			bugsRepository.save(dungBeetle);
			Bugs earthBoringDungBeetle = new Bugs ("Earth-boring_Dung_Beetle",
					Arrays.asList("July", "August", "September"),
					Arrays.asList("January", "February", "March"),
					"On the ground",
					"Common",
					300.00,
					"All day");
			bugsRepository.save(earthBoringDungBeetle);
			Bugs emperorButterfly= new Bugs ("Emperor_Butterfly",
					Arrays.asList("January", "February", "March",  "June", "July", "August", "September", "December"),
					Arrays.asList("January", "February", "March",  "June", "July", "August", "September", "December"),
					"Flying",
					"Uncommon",
					4000.00,
					"17:00-8:00");
			bugsRepository.save(emperorButterfly);
			Bugs eveningCicada = new Bugs("Evening_Cicada",
					Arrays.asList("July", "August"),
					Arrays.asList("July", "August"),
					"Trees",
					"Common",
					550.00,
					"4:00-8:00 & 16:00-19:00");
			bugsRepository.save(eveningCicada);
			Bugs firefly = new Bugs ("Firefly",
					Collections.singletonList("June"),
					Collections.singletonList("June"),
					"Flying",
					"Common",
					300.00,
					"19:00-4:00");
			bugsRepository.save(firefly);
			Bugs flea = new Bugs ("Flea",
					Arrays.asList("April", "May", "June", "July", "August", "September", "October", "November"),
					Arrays.asList("January", "February", "March", "April", "May", "October", "November", "December"),
					"Villager's Heads",
					"Rare",
					70.00,
					"All day");
			bugsRepository.save(flea);
			Bugs fly = new Bugs ("Fly",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"On trash",
					"Common",
					60.00,
					"All day");
			bugsRepository.save(fly);
			Bugs giantCicada = new Bugs("Giant_Cicada",
					Arrays.asList("July", "August"),
					Arrays.asList("July", "August"),
					"On Trees",
					"Uncommon",
					500.00,
					"8:00-17:00");
			bugsRepository.save(giantCicada);
			Bugs giantStag = new Bugs ("Giant_Stag",
					Arrays.asList("July", "August"),
					Arrays.asList("July", "August"),
					"On Tree",
					"Very Rare",
					1000.00,
					"23:00-8:00");
			bugsRepository.save(giantStag);
			Bugs giantWaterBug = new Bugs ("Giant_Water_Bug",
					Arrays.asList("January", "February", "March",  "October", "November", "December"),
					Arrays.asList("April", "May", "June", "July", "August", "September"),
					"On Ponds and Rivers",
					"Rare",
					2000.00,
					"19:00-8:00");
			bugsRepository.save(giantWaterBug);
			Bugs giraffeStag = new Bugs ("Giraffe_Stag",
					Arrays.asList("July", "August"),
					Arrays.asList("July", "August"),
					"On Coconut Trees",
					"Very Rare",
					12000.00,
					"17:00-8:00");
			bugsRepository.save(giraffeStag);
			Bugs goldenStag = new Bugs ("Golden_Stag",
					Arrays.asList("June", "July"),
					Arrays.asList("June", "July"),
					"On Trees",
					"Very Rare",
					11520.00,
					"17:00-8:00");
			bugsRepository.save(goldenStag);
			Bugs goliathBeetle = new Bugs ("Goliath_Beetle",
					Arrays.asList("June", "July", "August", "September"),
					Arrays.asList("January", "February", "March","December"),
					"On Palm Trees",
					"Rare",
					8000.00,
					"17:00-8:00");
			bugsRepository.save(goliathBeetle);
			Bugs grasshopper = new Bugs ("Grasshopper",
					Arrays.asList("July", "August", "September"),
					Arrays.asList("January", "February", "March"),
					"On the Ground",
					"Common",
					160.00,
					"8:00-17:00");
			bugsRepository.save(grasshopper);
			Bugs greatPurpleEmperor = new Bugs ("Great_Purple_Emperor",
					Arrays.asList("May", "June", "July", "August"),
					Arrays.asList("May", "June", "July", "August"),
					"Flying",
					"Rare",
					3000.00,
					"4:00-19:00");
			bugsRepository.save( greatPurpleEmperor);
			Bugs hermitCrab = new Bugs("Hermit_Crab",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Beach (shells)",
					"Common",
					1000.00,
					"19:00-8:00");
			bugsRepository.save(hermitCrab);
			Bugs honeybee = new Bugs("Honeybee",
					Arrays.asList("March", "April", "May", "June", "July"),
					Arrays.asList("January", "September", "October", "November", "December"),
					"On Flowers",
					"Common",
					200.00,
					"8:00-17:00");
			bugsRepository.save(honeybee);
			Bugs hornedAtlas = new Bugs("Horned_Atlas",
					Arrays.asList("July", "August"),
					Arrays.asList("July", "August"),
					"On Trees",
					"Rare",
					8000.00,
					"17:00-8:00");
			bugsRepository.save(hornedAtlas);
			Bugs hornedDynastid = new Bugs("Horned_Dynastid",
					Arrays.asList("July", "August"),
					Arrays.asList("July", "August"),
					"On Trees",
					"Uncommon",
					1350.00,
					"17:00-8:00");
			bugsRepository.save(hornedDynastid);
			Bugs hornedElephant = new Bugs("Horned_Elephant",
					Arrays.asList("July", "August"),
					Arrays.asList("July", "August"),
					"On Trees",
					"Very Rare",
					8000.00,
					"17:00-8:00");
			bugsRepository.save(hornedElephant);
			Bugs hornedHercules = new Bugs("Horned_Hercules",
					Arrays.asList("July", "August"),
					Arrays.asList("July", "August"),
					"On Trees",
					"Very Rare",
					12000.00,
					"17:00-8:00");
			bugsRepository.save(hornedHercules);
			Bugs jewelBeetle= new Bugs("Jewel_Beetle",
					Arrays.asList("April", "May", "June", "July", "August"),
					Arrays.asList("April", "May", "June", "July", "August"),
					"On Tree Stumps",
					"Uncommon",
					2400.00,
					"All day");
			bugsRepository.save(jewelBeetle);
			Bugs ladybug = new Bugs("Ladybug",
					Arrays.asList("March", "April", "May", "June",  "October"),
					Arrays.asList("April", "September", "October", "November", "December"),
					"On Flowers",
					"Common",
					200.00,
					"8:00-17:00");
			bugsRepository.save(ladybug );
			Bugs longLocust = new Bugs("Long_Locust",
					Arrays.asList("April", "May", "June", "July", "August", "September", "October", "November"),
					Arrays.asList("January", "February", "March", "April", "May", "October", "November", "December"),
					"On the Ground",
					"Common",
					200.00,
					"8:00-19:00");
			bugsRepository.save(longLocust);
			Bugs madagascanSunsetMoth= new Bugs("Madagascan_Sunset_Moth",
					Arrays.asList("April", "May", "June", "July", "August"),
					Arrays.asList("January", "February", "March","October", "November", "December"),
					"Flying",
					"Uncommon",
					2500.00,
					"8:00-16:00");
			bugsRepository.save(madagascanSunsetMoth);
			Bugs manFacedStinkBug = new Bugs("Man-Faced_Stinkbug",
					Arrays.asList("February", "March","April", "May", "June", "July", "August", "September", "October"),
					Arrays.asList("January", "February", "March", "April","September", "October", "November", "December"),
					"On Flowers",
					"Common",
					1000.00,
					"19:00-8:00");
			bugsRepository.save(manFacedStinkBug);
			Bugs mantis = new Bugs("Mantis",
					Arrays.asList("March","April", "May", "June", "July", "August", "September", "October", "November"),
					Arrays.asList("January", "February", "March", "April", "May","September", "October", "November", "December"),
					"Flowers",
					"Common",
					430.00,
					"8:00-17:00");
			bugsRepository.save(mantis);
			Bugs migratoryLocust = new Bugs("Migratory_Locust",
					Arrays.asList("August", "September", "October", "November"),
					Arrays.asList("February", "March", "April", "May"),
					"On the Ground",
					"Common",
					600.00,
					"8:00-19:00");
			bugsRepository.save(migratoryLocust);
			Bugs miyamaStag = new Bugs("Miyama_Stag",
					Arrays.asList("July", "August"),
					Arrays.asList( "July", "August"),
					"On Trees",
					"Common",
					1000.00,
					"All Day");
			bugsRepository.save(miyamaStag);
			Bugs moleCricket = new Bugs("Mole_Cricket",
					Arrays.asList("January", "February", "March", "April", "May", "November", "December"),
					Arrays.asList( "May", "June", "July", "August", "September", "October", "November"),
					"Underground",
					"Common",
					500.00,
					"All Day");
			bugsRepository.save(moleCricket);
			Bugs monarchButterfly = new Bugs("Monarch_Butterfly",
					Arrays.asList("September", "October", "November"),
					Arrays.asList("March", "April", "May"),
					"Flying",
					"Common",
					140.00,
					"4:00-17:00");
			bugsRepository.save(monarchButterfly);
			Bugs mosquito = new Bugs("Mosquito",
					Arrays.asList("June", "July", "August", "September"),
					Arrays.asList("January", "February", "March","December"),
					"Flying",
					"Common",
					130.00,
					"17:00-4:00");
			bugsRepository.save(mosquito);
			Bugs moth = new Bugs("Moth",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Flying by Light",
					"Common",
					130.00,
					"19:00-4:00");
			bugsRepository.save(moth);
			Bugs orchidMantis = new Bugs("Orchid_Mantis",
					Arrays.asList( "March", "April", "May", "June", "July", "August", "September", "October", "November"),
					Arrays.asList("January", "February", "March", "April", "May", "September", "October", "November", "December"),
					"On Flowers (White)",
					"Uncommon",
					2400.00,
					"8:00-17:00");
			bugsRepository.save(orchidMantis);
			Bugs paperKiteButterfly = new Bugs("Paper_Kite_Butterfly",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Flying",
					"Uncommon",
					1000.00,
					"8:00-19:00");
			bugsRepository.save(paperKiteButterfly);
			Bugs pillBug= new Bugs("Pill_Bug",
					Arrays.asList("January", "February", "March", "April", "May", "June", "September", "October", "November", "December"),
					Arrays.asList( "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Hitting Rocks",
					"Common",
					250.00,
					"11:00-4:00");
			bugsRepository.save(pillBug);
			Bugs pondskater = new Bugs("Pondskater",
					Arrays.asList("May", "June", "July", "August", "September"),
					Arrays.asList("January", "February", "March", "November", "December"),
					"On Ponds and Rivers",
					"Uncommon",
					130.00,
					"8:00-19:00");
			bugsRepository.save(pondskater);
			Bugs queenAlexandraBirdwing = new Bugs("Queen_Alexandra's_Birdwing",
					Arrays.asList( "May", "June", "July", "August", "September"),
					Arrays.asList("January", "February", "March", "November", "December"),
					"Flying",
					"Rare",
					4000.00,
					"8:00-16:00");
			bugsRepository.save(queenAlexandraBirdwing);
			Bugs rainbowStag = new Bugs("Rainbow_Stag",
					Arrays.asList( "June", "July", "August", "September"),
					Arrays.asList("January", "February", "March", "December"),
					"On Trees",
					"Rare",
					6000.00,
					"19:00-8:00");
			bugsRepository.save(rainbowStag);
			Bugs rajahBrookeBirdwing = new Bugs("Rajah_Brooke's_Birdwing",
					Arrays.asList("January", "February", "April", "May", "June", "July", "August", "September", "December"),
					Arrays.asList("January", "February", "March",  "June", "July", "August", "October", "November", "December"),
					"Flying",
					"Rare",
					2500.00,
					"8:00-17:00");
			bugsRepository.save(rajahBrookeBirdwing);
			Bugs redDragonfly = new Bugs("Red_Dragonfly",
					Arrays.asList( "September", "October"),
					Arrays.asList("March", "April"),
					"Flying",
					"Common",
					180.00,
					"8:00-19:00");
			bugsRepository.save(redDragonfly);
			Bugs riceGrasshopper = new Bugs("Rice_Grasshopper",
					Arrays.asList( "August", "September", "October", "November"),
					Arrays.asList( "February", "March", "April", "May"),
					"On the Ground",
					"Uncommon",
					160.00,
					"8:00-19:00");
			bugsRepository.save(riceGrasshopper);
			Bugs robustCicada = new Bugs("Robust_Cicada",
					Arrays.asList("July", "August"),
					Arrays.asList( "July", "August"),
					"On Trees",
					"Common",
					300.00,
					"8:00-17:00");
			bugsRepository.save(robustCicada);
			Bugs rosaliaBatesiBeetle = new Bugs("Rosalia_Batesi_Beetle",
					Arrays.asList( "May", "June", "July", "August", "September"),
					Arrays.asList("January", "February", "March","November", "December"),
					"On Tree Stumps",
					"Rare",
					3000.00,
					"All Day");
			bugsRepository.save(rosaliaBatesiBeetle);
			Bugs sawStag = new Bugs("Saw_Stag",
					Arrays.asList("July", "August"),
					Arrays.asList("July", "August"),
					"On Trees",
					"Uncommon",
					2000.00,
					"All Day");
			bugsRepository.save(sawStag);
			Bugs scarabBeetle = new Bugs("Scarab_Beetle",
					Arrays.asList( "July", "August"),
					Arrays.asList( "July", "August"),
					"On Trees",
					"Very Rare",
					10000.00,
					"11:00-8:00");
			bugsRepository.save(scarabBeetle);
			Bugs scorpion = new Bugs("Scorpion",
					Arrays.asList("May", "June", "July", "August", "September", "October"),
					Arrays.asList("January", "February", "March", "April","November", "December"),
					"On the Ground",
					"Rare",
					8000.00,
					"19:00-4:00");
			bugsRepository.save(scorpion);
			Bugs snail = new Bugs("Snail",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"On rocks (raining)",
					"Common",
					250.00,
					"All day");
			bugsRepository.save(snail);
			Bugs spider = new Bugs("Spider",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Shaking trees",
					"Uncommon",
					600.00,
					"19:00-8:00");
			bugsRepository.save(spider);
			Bugs stinkbug = new Bugs("Stinkbug",
					Arrays.asList("March", "April", "May", "June", "July", "August", "September", "October"),
					Arrays.asList("January", "February", "March", "April","September", "October", "November", "December"),
					"Flowers)",
					"Common",
					120.00,
					"All day");
			bugsRepository.save(stinkbug);
			Bugs tarantula = new Bugs("Tarantula",
					Arrays.asList("January", "February", "March", "April","November", "December"),
					Arrays.asList("May", "June", "July", "August", "September", "October"),
					"On the Ground",
					"Rare",
					8000.00,
					"19:00-4:00");
			bugsRepository.save(tarantula);
			Bugs tigerBeetle = new Bugs("Tiger_Beetle",
					Arrays.asList( "February", "March", "April", "May", "June", "July", "August", "September", "October"),
					Arrays.asList("January", "February", "March", "April", "August", "September", "October", "November", "December"),
					"On the Ground",
					"Common",
					1500.00,
					"All Day");
			bugsRepository.save(tigerBeetle);
			Bugs tigerButterfly= new Bugs("Tiger_Butterfly",
					Arrays.asList( "March", "April", "May", "June", "July", "August", "September"),
					Arrays.asList("January", "February", "March", "September", "October", "November", "December"),
					"Flying",
					"Common",
					240.00,
					"4:00-19:00");
			bugsRepository.save(tigerButterfly);
			Bugs violinBeetle = new Bugs("Violin_Beetle",
					Arrays.asList("May", "June","September", "October", "November"),
					Arrays.asList( "March", "April", "May", "November", "December"),
					"On tree Stumps",
					"Uncommon",
					450.00,
					"All Day");
			bugsRepository.save(violinBeetle);
			Bugs walkerCicada = new Bugs("Walker_Cicada",
					Arrays.asList( "August", "September"),
					Arrays.asList("February", "March"),
					"On Trees",
					"Uncommon",
					400.00,
					"8:00-17:00");
			bugsRepository.save(walkerCicada);
			Bugs walkingLeaf = new Bugs("Walking_Leaf",
					Arrays.asList( "July", "August", "September"),
					Arrays.asList("January", "February", "March"),
					"Under Trees (disguised as leafs)",
					"Uncommon",
					600.00,
					"All Day");
			bugsRepository.save(walkingLeaf);
			Bugs walkingStick = new Bugs("Walking_Stick",
					Arrays.asList( "July", "August", "September", "October", "November"),
					Arrays.asList("January", "February", "March", "April", "May"),
					"On Trees",
					"Uncommon",
					600.00,
					"4:00-8:00 & 17:00-19:00");
			bugsRepository.save(walkingStick);
			Bugs wasp = new Bugs("Wasp",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Shaking trees",
					"Uncommon",
					2500.00,
					"All day");
			bugsRepository.save(wasp);
			Bugs wharfRoach = new Bugs("Wharf_Roach",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"On Beach Rocks",
					"Common",
					200.00,
					"All Day");
			bugsRepository.save(wharfRoach);
			Bugs yellowButterfly = new Bugs("Yellow_Butterfly",
					Arrays.asList( "March", "April", "May", "June", "September", "October"),
					Arrays.asList( "March", "April","September", "October", "November", "December"),
					"Flying",
					"Common",
					160.00,
					"4:00-19:00");
			bugsRepository.save(yellowButterfly);




			//fishes
			Fish anchovy = new Fish ("Anchovy",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Small",
					"Sea",
					200.00,
					"4:00-21:00",
					"Uncommon"
			);
			fishRepository.save(anchovy);
			Fish  angelfish = new Fish ("Angelfish",
					Arrays.asList("May", "June", "July", "August", "September", "October"),
					Arrays.asList("January", "February", "March", "April","November", "December"),
					"Small",
					"River",
					3000.00,
					"4:00-21:00",
					"Uncommon"
			);
			fishRepository.save(angelfish);
			Fish arapaima = new Fish ("Arapaima",
					Arrays.asList("June", "July", "August", "September"),
					Arrays.asList("January", "February", "March","December"),
					"Large",
					"River",
					10000.00,
					"16:00-9:00",
					"Rare"
			);
			fishRepository.save(arapaima);
			Fish arowana = new Fish ("Arowana",
					Arrays.asList("June", "July", "August", "September"),
					Arrays.asList("January", "February", "March","December"),
					"Big",
					"River",
					10000.00,
					"4:00-21:00",
					"Rare"
			);
			fishRepository.save(arowana);
			Fish barredKnifejaw = new Fish ("Barred_Knifejaw",
					Arrays.asList("March", "April", "May", "June", "July", "August", "September", "October", "November"),
					Arrays.asList("January", "February", "March", "April", "May", "September", "October", "November", "December"),
					"Normal",
					"Sea",
					5000.00,
					"All Day",
					"Rare"
			);
			fishRepository.save(barredKnifejaw);
			Fish barreleye = new Fish ("Barreleye",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Small",
					"Sea",
					15000.00,
					"21:00-4:00",
					"Very Rare"
			);
			fishRepository.save(barreleye);
			Fish betta = new Fish ("Betta",
					Arrays.asList("May", "June", "July", "August", "September", "October"),
					Arrays.asList("January", "February", "March", "April", "November", "December"),
					"Small",
					"River",
					2500.00,
					"9:00-16:00",
					"Uncommon"
			);
			fishRepository.save(betta);
			Fish bitterling = new Fish ("Bitterling",
					Arrays.asList("January", "February", "March","November", "December"),
					Arrays.asList( "May", "June", "July", "August", "September"),
					"Very Small",
					"River",
					900.00,
					"All Day",
					"Common"
			);
			fishRepository.save(bitterling);
			Fish blackBass = new Fish ("Black_Bass",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Big",
					"River",
					400.00,
					"All Day",
					"Common"
			);
			fishRepository.save(blackBass);
			Fish blowfish = new Fish ("Blowfish",
					Arrays.asList("January", "February", "November", "December"),
					Arrays.asList("May", "June", "July", "August"),
					"Normal",
					"Sea",
					5000.00,
					"4:00-21:00",
					"Rare"
			);
			fishRepository.save(blowfish);
			Fish blueMarlin = new Fish ("Blue_Marlin",
					Arrays.asList("January", "February", "March", "April", "July", "August", "October", "November", "December"),
					Arrays.asList("January", "February", "March",  "May", "June", "July", "August", "September", "October"),
					"Large",
					"Pier",
					10000.00,
					"All Day",
					"Very Rare"
			);
			fishRepository.save(blueMarlin);
			Fish bluegill = new Fish ("Bluegill",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Small",
					"River",
					180.00,
					"9:00-16:00",
					"Common"
			);
			fishRepository.save(bluegill);
			Fish butterflyFish = new Fish ("Butterfly_Fish",
					Arrays.asList("April", "May", "June", "July", "August", "September"),
					Arrays.asList("January", "February", "March", "October", "November", "December"),
					"Small",
					"Sea",
					1000.00,
					"All Day",
					"Uncommon"
			);
			fishRepository.save(butterflyFish);
			Fish carp = new Fish ("Carp",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Big",
					"Pond",
					300.00,
					"All Day",
					"Common"
			);
			fishRepository.save(carp);
			Fish catfish = new Fish ("Catfish",
					Arrays.asList("May", "June", "July", "August", "September", "October"),
					Arrays.asList("January", "February", "March", "April", "November", "December"),
					"Big",
					"Pond",
					800.00,
					"16:00-9:00",
					"Common"
			);
			fishRepository.save(catfish);
			Fish char1 = new Fish ("Char",
					Arrays.asList("March", "April", "May", "June",  "September", "October", "November"),
					Arrays.asList( "March", "April", "May",  "September", "October", "November", "December"),
					"Normal",
					"River (Clifftop)",
					3800.00,
					"16:00-9:00",
					"Uncommon"
			);
			fishRepository.save(char1);
			Fish cherrySalmon = new Fish ("Cherry_Salmon",
					Arrays.asList("March", "April", "May", "June",  "September", "October", "November"),
					Arrays.asList( "March", "April", "May",  "September", "October", "November", "December"),
					"Normal",
					"River (Clifftop) & Pond",
					1000.00,
					"16:00-9:00",
					"Uncommon"
			);
			fishRepository.save(cherrySalmon);

			Fish clownFish = new Fish ("Clown_Fish",

					Arrays.asList("April", "May", "June", "July", "August", "September"),
					Arrays.asList("January", "February", "March", "October", "November", "December"),
					"Very Small",
					"Sea",
					650.00,
					"All Day",
					"Uncommon"
			);
			fishRepository.save(clownFish);
			Fish coelacanth= new Fish ("Coelacanth",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Large",
					"Sea (raining)",
					15000.00,
					"All Day",
					"Very Rare"
			);
			fishRepository.save(coelacanth);
			Fish crawfish = new Fish ("Crawfish",
					Arrays.asList("April", "May", "June", "July", "August", "September"),
					Arrays.asList("January", "February", "March", "October", "November", "December"),
					"Small",
					"Pond",
					200.00,
					"All Day",
					"Common"
			);
			fishRepository.save(crawfish);
			Fish crucianCarp = new Fish ("Crucian_Carp",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Small",
					"River",
					160.00,
					"All Day",
					"Common"
			);
			fishRepository.save(crucianCarp);
			Fish dab = new Fish ("Dab",
					Arrays.asList("January", "February", "March", "April", "October", "November", "December"),
					Arrays.asList("April", "May", "June", "July", "August", "September", "October"),
					"Normal",
					"Sea",
					300.00,
					"All Day",
					"Common"
			);
			fishRepository.save(dab);
			Fish dace = new Fish ("Dace",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Normal",
					"River",
					240.00,
					"16:00-9:00",
					"Common"
			);
			fishRepository.save(dace);
			Fish dorado = new Fish ("Dorado",
					Arrays.asList("June", "July", "August", "September"),
					Arrays.asList("January", "February", "March","December"),
					"Very Big",
					"River",
					15000.00,
					"4:00-21:00",
					"Very Rare"
			);
			fishRepository.save(dorado);
			Fish footballFish = new Fish ("Football_Fish",
					Arrays.asList("January", "February", "March", "November", "December"),
					Arrays.asList("May", "June", "July", "August", "September"),
					"Big",
					"Sea",
					2500.00,
					"16:00-9:00",
					"Uncommon"
			);
			fishRepository.save(footballFish);
			Fish freshwaterGoby = new Fish ("Freshwater_Goby",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Small",
					"River",
					400.00,
					"16:00-9:00",
					"Uncommon"
			);
			fishRepository.save(freshwaterGoby);
			Fish frog = new Fish ("Frog",
					Arrays.asList( "May", "June", "July", "August"),
					Arrays.asList("January", "February","November", "December"),
					"Small",
					"Pond",
					120.00,
					"All Day",
					"Common"
			);
			fishRepository.save(frog);
			Fish gar = new Fish ("Gar",
					Arrays.asList("June", "July", "August", "September"),
					Arrays.asList("January", "February", "March", "December"),
					"Large",
					"Pond",
					6000.00,
					"16:00-9:00",
					"Rare"
			);
			fishRepository.save(gar);
			Fish giantSnakehead = new Fish ("Giant_Snakehead",
					Arrays.asList("June", "July", "August"),
					Arrays.asList("January", "February","December"),
					"Very Big",
					"Pond",
					5500.00,
					"9:00-16:00",
					"Rare"
			);
			fishRepository.save(giantSnakehead);
			Fish giantTrevally = new Fish ("Giant_Trevally",
					Arrays.asList("June", "July", "August", "September", "October"),
					Arrays.asList("January", "February", "March", "April", "November", "December"),
					"Very Big",
					"Pier",
					4500.00,
					"All Day",
					"Rare"
			);
			fishRepository.save(giantTrevally);
			Fish goldenTrout = new Fish ("Golden_Trout",
					Arrays.asList("March", "April", "May", "September", "October", "November"),
					Arrays.asList("January", "February", "June", "July", "August", "November", "December"),
					"Normal",
					"River (Clifftop)",
					15000.00,
					"16:00-9:00",
					"Very Rare"
			);
			fishRepository.save(goldenTrout);
			Fish goldfish = new Fish ("Goldfish",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Very Small",
					"Pond",
					1300.00,
					"All Day",
					"Rare"
			);
			fishRepository.save(goldfish);
			Fish greatWhiteShark = new Fish ("Great_White_Shark",
					Arrays.asList("June", "July", "August", "September"),
					Arrays.asList("January", "February", "March", "December"),
					"Large (Fin)",
					"Sea",
					15000.00,
					"16:00-9:00",
					"Very Rare"
			);
			fishRepository.save(greatWhiteShark);
			Fish guppy = new Fish ("Guppy",
					Arrays.asList( "April", "May", "June", "July", "August", "September", "October", "November"),
					Arrays.asList("January", "February", "March", "April", "May","October", "November", "December"),
					"Very Small",
					"River",
					1300.00,
					"9:00-16:00",
					"Rare"
			);
			fishRepository.save(guppy);
			Fish hammerheadShark = new Fish ("Hammerhead_Shark",
					Arrays.asList("June", "July", "August", "September"),
					Arrays.asList("January", "February", "March",  "December"),
					"Large (Fin)",
					"Sea",
					8000.00,
					"16:00-9:00",
					"Very Rare"
			);
			fishRepository.save(hammerheadShark);
			Fish horseMackerel= new Fish ("Horse_Mackerel",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Small",
					"Sea",
					150.00,
					"All Day",
					"Common"
			);
			fishRepository.save(horseMackerel);
			Fish killifish = new Fish ("Killifish",
					Arrays.asList( "April", "May", "June", "July", "August"),
					Arrays.asList("January", "February", "October", "November", "December"),
					"Very Small",
					"Pond",
					300.00,
					"9:00-16:00",
					"Uncommon"
			);
			fishRepository.save(killifish);
			Fish kingSalmon = new Fish ("King_Salmon",
					Collections.singletonList("September"),
					Collections.singletonList("March"),
					"Large",
					"River (Mouth)",
					1800.00,
					"All Day",
					"Rare"
			);
			fishRepository.save(kingSalmon);
			Fish koi = new Fish ("Koi",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Big",
					"Pond",
					4000.00,
					"16:00-9:00",
					"Rare"
			);
			fishRepository.save(koi);
			Fish loach = new Fish ("Loach",
					Arrays.asList("March", "April", "May"),
					Arrays.asList("September", "October", "November"),
					"Small",
					"River",
					400.00,
					"All Day",
					"Common"
			);
			fishRepository.save(loach);
			Fish mahiMahi= new Fish ("Mahi-mahi",
					Arrays.asList("May", "June", "July", "August", "September", "October"),
					Arrays.asList("January", "February", "March", "April", "November", "December"),
					"Big",
					"Pier",
					6000.00,
					"All day",
					"Rare"
			);
			fishRepository.save(mahiMahi);
			Fish mittenCrab = new Fish ("Mitten_Crab",
					Arrays.asList("September", "October", "November"),
					Arrays.asList( "March", "April", "May"),
					"Small",
					"River",
					2000.00,
					"16:00-9:00",
					"Rare"
			);
			fishRepository.save(mittenCrab);
			Fish morayEel = new Fish ("Moray_Eel",
					Arrays.asList("August", "September", "October"),
					Arrays.asList("February", "March", "April"),
					"Narrow",
					"Sea",
					2000.00,
					"All Day",
					"Uncommon"
			);
			fishRepository.save(morayEel);
			Fish napoleonFish = new Fish ("Napoleon_Fish",
					Arrays.asList( "July", "August"),
					Arrays.asList("January", "February"),
					"Large",
					"Sea",
					10000.00,
					"4:00-21:00",
					"Very Rare"
			);
			fishRepository.save(napoleonFish);
			Fish neonTetra = new Fish ("Neon_Tetra",
					Arrays.asList("April", "May", "June", "July", "August", "September", "October", "November"),
					Arrays.asList("January", "February", "March", "April", "May", "October", "November", "December"),
					"Very Small",
					"River",
					500.00,
					"9:00-16:00",
					"Uncommon"
			);
			fishRepository.save(neonTetra);
			Fish nibbleFish = new Fish ("Nibble_Fish",
					Arrays.asList( "May", "June", "July", "August", "September"),
					Arrays.asList("January", "February", "March", "November", "December"),
					"Small",
					"River",
					1500.00,
					"9:00-16:00",
					"Rare"
			);
			fishRepository.save(nibbleFish);
			Fish oarfish = new Fish ("Oarfish",
					Arrays.asList("January", "February", "March", "April", "May", "December"),
					Arrays.asList("June", "July", "August", "September", "October", "November"),
					"Large",
					"Sea",
					9000.00,
					"All Day",
					"Very Rare"
			);
			fishRepository.save(oarfish);
			Fish oceanSunfish = new Fish ("Ocean_Sunfish",
					Arrays.asList("July", "August", "September"),
					Arrays.asList("January", "February", "March"),
					"Large (Fin)",
					"Sea",
					4000.00,
					"4:00-21:00",
					"Rare"
			);
			fishRepository.save(oceanSunfish);
			Fish oliveFlounder = new Fish ("Olive_Flounder",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Very Big",
					"Sea",
					800.00,
					"All Day",
					"Uncommon"
			);
			fishRepository.save(oliveFlounder);
			Fish paleChub = new Fish ("Pale_Chub",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Very Small",
					"River",
					200.00,
					"9:00-16:00",
					"Common"
			);
			fishRepository.save(paleChub);
			Fish pike = new Fish ("Pike",
					Arrays.asList("September", "October", "November", "December"),
					Arrays.asList( "March", "April", "May", "June"),
					"Very Big",
					"River",
					1800.00,
					"All Day",
					"Uncommon"
			);
			fishRepository.save(pike);
			Fish piranha = new Fish ("Piranha",
					Arrays.asList( "June", "July", "August", "September"),
					Arrays.asList("January", "February", "March", "December"),
					"Small",
					"River",
					2500.00,
					"9:00-16:00 & 21:00-4:00",
					"Rare"
			);
			fishRepository.save(piranha);
			Fish pondSmelt = new Fish ("Pond_Smelt",
					Arrays.asList("January", "February", "December"),
					Arrays.asList( "June", "July", "August"),
					"Small",
					"River",
					500.00,
					"All Day",
					"Common"
			);
			fishRepository.save(pondSmelt);
			Fish popEyedGoldfish = new Fish ("Pop-eyed_Goldfish",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Very Small",
					"Pond",
					1300.00,
					"9:00-16:00",
					"Rare"
			);
			fishRepository.save(popEyedGoldfish);
			Fish pufferFish = new Fish ("Puffer_Fish",
					Arrays.asList( "July", "August", "September"),
					Arrays.asList("January", "February", "March"),
					"Normal",
					"Sea",
					250.00,
					"All Day",
					"Uncommon"
			);
			fishRepository.save(pufferFish);
			Fish rainbowFish = new Fish ("Rainbow_Fish",
					Arrays.asList("May", "June", "July", "August", "September", "October"),
					Arrays.asList("January", "February", "March", "April","November", "December"),
					"Very Small",
					"River",
					800.00,
					"9:00-16:00",
					"Uncommon"
			);
			fishRepository.save(rainbowFish);
			Fish ranchuGoldfish = new Fish ("Ranchu_Goldfish",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Small",
					"Pond",
					4500.00,
					"9:00-16:00",
					"Rare"
			);
			fishRepository.save(ranchuGoldfish);
			Fish ray = new Fish ("Ray",
					Arrays.asList("August", "September", "October", "November"),
					Arrays.asList( "February", "March", "April", "May"),
					"Very Big",
					"Sea",
					3000.00,
					"4:00-21:00",
					"Uncommon"
			);
			fishRepository.save(ray);
			Fish redSnapper = new Fish ("Red_Snapper",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Normal",
					"Sea",
					3000.00,
					"9:00-16:00",
					"Uncommon"
			);
			fishRepository.save(redSnapper);
			Fish ribbonEel = new Fish ("Ribbon_Eel",
					Arrays.asList( "June", "July", "August", "September", "October"),
					Arrays.asList("January", "February", "March", "April","December"),
					"Narrow",
					"Sea",
					600.00,
					"All Day",
					"Uncommon"
			);
			fishRepository.save(ribbonEel);
			Fish saddledBichir = new Fish ("Saddled_Bichir",
					Arrays.asList("June", "July", "August", "September"),
					Arrays.asList("January", "February", "March", "December"),
					"Big",
					"River",
					4000.00,
					"21:00-4:00",
					"Rare"
			);
			fishRepository.save(saddledBichir);
			Fish salmon = new Fish ("Salmon",
					Collections.singletonList("September"),
					Collections.singletonList("March"),
					"Big",
					"River (Mouth)",
					700.00,
					"All Day",
					"Common"
			);
			fishRepository.save(salmon);
			Fish sawShark = new Fish ("Saw_Shark",
					Arrays.asList( "June", "July", "August", "September"),
					Arrays.asList("January", "February", "March", "December"),
					"Large (Fin)",
					"Sea",
					12000.00,
					"16:00-9:00",
					"Very Rare"
			);
			fishRepository.save(sawShark);
			Fish seaBass = new Fish ("Sea_Bass",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
					"Very Big",
					"Sea",
					400.00,
					"All Day",
					"Common"
			);
			fishRepository.save(seaBass);
			Fish seaButterfly = new Fish ("Sea_Butterfly",
					Arrays.asList("January", "February", "March", "December"),
					Arrays.asList( "June", "July", "August", "September"),
					"Very Small",
					"Sea",
					1000.00,
					"All Day",
					"Uncommon"
			);
			fishRepository.save(seaButterfly);
			Fish seaHorse = new Fish ("Sea_Horse",
					Arrays.asList("April", "May", "June", "July", "August", "September", "October", "November"),
					Arrays.asList("January", "February", "March", "April", "May", "October", "November", "December"),
					"Very Small",
					"Sea",
					1100.00,
					"All Day",
					"Uncommon"
			);
			fishRepository.save(seaHorse);
			Fish snappingTurtle = new Fish ("Snapping_Turtle",
					Arrays.asList("April", "May", "June", "July", "August", "September", "October"),
					Arrays.asList("January", "February", "March", "April", "October", "November", "December"),
					"Very Big",
					"River",
					5000.00,
					"21:00-4:00",
					"Rare"
			);
			fishRepository.save(snappingTurtle);
			Fish softShelledTurtle = new Fish ("Soft-shelled_Turtle",
					Arrays.asList( "August", "September"),
					Arrays.asList( "February", "March"),
					"Big",
					"River",
					3750.00,
					"16:00-9:00",
					"Rare"
			);
			fishRepository.save(softShelledTurtle);
			Fish squid = new Fish ("Squid",
					Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "December"),
					Arrays.asList("January", "February", "June", "July", "August", "September", "October", "November", "December"),
					"Normal",
					"Sea",
					500.00,
					"All Day",
					"Common"
			);
			fishRepository.save(squid);
			Fish stringfish = new Fish ("Stringfish",
					Arrays.asList("January", "February", "March", "December"),
					Arrays.asList( "June", "July", "August", "September"),
					"Very Big",
					"River (Clifftop)",
					15000.00,
					"16:00-9:00",
					"Very Rare"
			);
			fishRepository.save(stringfish);
			Fish sturgeon = new Fish ("Sturgeon",
					Arrays.asList("January", "February", "March", "September", "October", "November", "December"),
					Arrays.asList( "March", "April", "May", "June", "July", "August", "September"),
					"Large",
					"River (Mouth)",
					10000.00,
					"All Day",
					"Very Rare"
			);
			fishRepository.save(sturgeon);
			Fish suckerfish = new Fish ("Suckerfish",
					Arrays.asList( "June", "July", "August", "September"),
					Arrays.asList("January", "February", "March", "December"),
					"Big (Fin)",
					"Sea",
					1500.00,
					"All Day",
					"Uncommon"
			);
			fishRepository.save(suckerfish);
			Fish surgeonFish = new Fish ("Surgeon_Fish",
					Arrays.asList( "April", "May", "June", "July", "August", "September"),
					Arrays.asList("January", "February", "March","October", "November", "December"),
					"Small",
					"Sea",
					1000.00,
					"All Day",
					"Uncommon"
			);
			fishRepository.save(surgeonFish);
			Fish sweetFish = new Fish ("Sweetfish",
					Arrays.asList( "July", "August", "September"),
					Arrays.asList("January", "February", "March"),
					"Normal",
					"River",
					900.00,
					"All Day",
					"Common"
			);
			fishRepository.save(sweetFish);
			Fish tadpole = new Fish ("Tadpole",
					Arrays.asList("March", "April", "May", "June", "July"),
					Arrays.asList("January", "September", "October", "November", "December"),
					"Very Small",
					"Pond",
					100.00,
					"All Day",
					"Common"
			);
			fishRepository.save(tadpole);
			Fish tilapia = new Fish ("Tilapia",
					Arrays.asList("June", "July", "August", "September", "October"),
					Arrays.asList("January", "February", "March", "April",  "December"),
					"Normal",
					"River",
					800.00,
					"All Day",
					"Uncommon"
			);
			fishRepository.save(tilapia);
			Fish tuna = new Fish ("Tuna",
					Arrays.asList("January", "February", "March", "April", "November", "December"),
					Arrays.asList( "May", "June", "July", "August", "September", "October"),
					"Large",
					"Pier",
					7000.00,
					"All Day",
					"Very Rare"
			);
			fishRepository.save(tuna);
			Fish whaleShark = new Fish ("Whale_Shark",
					Arrays.asList( "June", "July", "August", "September" ),
					Arrays.asList("January", "February", "March", "December"),
					"Large (Fin)",
					"Sea",
					13000.00,
					"All Day",
					"Very Rare"
			);
			fishRepository.save(whaleShark);
			Fish yellowPerch = new Fish ("Yellow_Perch",
					Arrays.asList("January", "February", "March", "October", "November", "December"),
					Arrays.asList( "April", "May", "June", "July", "August", "September"),
					"Normal",
					"River",
					300.00,
					"All Day",
					"Common"
			);
			fishRepository.save(yellowPerch);
			Fish zebraTurkeyFish = new Fish ("Zebra_Turkeyfish",
					Arrays.asList("April", "May", "June", "July", "August", "September", "October", "November"),
					Arrays.asList("January", "February", "March", "April", "May", "October", "November", "December"),
					"Normal",
					"Sea",
					500.00,
					"All Day",
					"Common"
			);
			fishRepository.save(zebraTurkeyFish);

		};

	}
}
