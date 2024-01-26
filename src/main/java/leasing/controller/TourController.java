package leasing.controller;

import leasing.entity.Tour;
import leasing.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tourController")
public class TourController {
    @Autowired
    TourService tourService;

    @RequestMapping("/getValidTour")
    @ResponseBody
    public List<Tour> getValidTour(){
        return tourService.getValidTour();
    }
}
