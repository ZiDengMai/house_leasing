package leasing.service;

import leasing.dao.TourMapper;
import leasing.entity.Tour;
import leasing.entity.TourExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TourService {
    @Autowired
    TourMapper tourMapper;
    public List<Tour> getValidTour(){
        TourExample tourExample=new TourExample();
        Date date=new Date();
        tourExample.createCriteria().andDateLessThan(date);
        tourExample.setOrderByClause("date DESC");
        return tourMapper.selectByExample(tourExample);
    }
}
