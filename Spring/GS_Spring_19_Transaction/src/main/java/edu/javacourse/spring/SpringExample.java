package edu.javacourse.spring;

import edu.javacourse.spring.model.Region;
import edu.javacourse.spring.service.RegionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

public class SpringExample {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"springExample.xml"});

        RegionService regionService = (RegionService) context.getBean("regionService");

        //test1(regionService);
        //test2(regionService);
        test3(regionService);
        //test4(regionService);



    }

    private static void test1(RegionService regionService) {
        Region spb = new Region("SPb");
        regionService.createRegion(spb);
    }

    private static void test2(RegionService regionService) {
        Region spb = new Region("new Region 221sa44");
        regionService.createRegion(spb);
    }

    // test read-only
    private static void test3(RegionService regionService) {
        regionService.readOnly("cccccccc" + new Random().nextInt(1000));
    }

    private static void test4(RegionService regionService) {
        Region region =  regionService.getRegionByName("cccccccc");
        regionService.deleteRegion(region);

    }

}
