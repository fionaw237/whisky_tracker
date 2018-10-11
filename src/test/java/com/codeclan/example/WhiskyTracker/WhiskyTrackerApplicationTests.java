package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.components.DataLoader;
import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	WhiskyRepository whiskyRepository;

	@Autowired
	DistilleryRepository distilleryRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testsGoHere(){
//		List<Whisky> whiskiesByYear = whiskyRepository.getWhiskiesByYear(1990);
//		List<Distillery> distilleriesByRegion = distilleryRepository.getDistilleryByRegion("Highland");
//		List<Whisky> foundWhiskies = whiskyRepository.getWhiskiesByRegion("Lowland");
//		Distillery distillery1 = new Distillery("Glendronach", "Highland");

//		List<Whisky> whiskiesByDistillery = whiskyRepository.getWhiskyFromDistilleryOfAge(1L, 15);
		List<Distillery> distilleriesWithAge = distilleryRepository.getDistilleryWithWhiskiesOfAge(12);

	}

}
