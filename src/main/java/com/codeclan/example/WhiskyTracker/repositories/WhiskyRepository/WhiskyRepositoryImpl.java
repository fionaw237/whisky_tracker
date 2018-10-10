package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;


import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class WhiskyRepositoryImpl implements WhiskyRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Autowired
    DistilleryRepository distilleryRepository;

    @Transactional
    public List<Whisky> getWhiskiesByYear(int year){
        List<Whisky> whiskies = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Whisky.class);
            cr.add(Restrictions.eq("year", year));
            whiskies = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return whiskies;
    }

    // SQL: select * from whiskies where distillery_id =
    // (select id from distilleries where name = requestedName)
//    @Transactional
//    public List<Whisky> getWhiskyFromDistillery(Distillery distillery){
//        List<Whisky> whiskies = null;
//        Session session = entityManager.unwrap(Session.class);
//
//        try {
//            Criteria cr = session.createCriteria(Whisky.class);
//            cr.add(Restrictions.eq("distillery", distillery));
//            whiskies = cr.list();
//        } catch (HibernateException e) {
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//
//        return whiskies;
//    }

    // SQL: select * from whiskies where distillery_id =
    // (select id from distilleries where region = requestedRegion)
//    @Transactional
//    public List<Whisky> getWhiskiesByRegion(String region){
//        List<Whisky> whiskies = null;
//        Session session = entityManager.unwrap(Session.class);
//
//        try {
//            Criteria cr = session.createCriteria(Whisky.class);
//            cr.add(Restrictions.eq("distillery", distilleryRepository.getDistilleryByRegion(region)));
//            cr.createAlias("whiskies", "whisky" );
//            cr.add(Restrictions.eq("id", whisky.get))
//            cr1.add(Restrictions.eq("region", region));
//            List<Distillery> foundDistilleries = cr1.list();
//            Criteria cr2 = session.createCriteria(Whisky.class);
//            cr2.createAlias("distillery");
//            whiskies = cr.list();
//        } catch (HibernateException e) {
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//        return whiskies
//
//    }
}
