package com.kickwithhibernate.generatorclassesinhibernate.nativegenerator;

import com.kickwithhibernate.dao.BaseDAO;
import util.HibernateUtil;

/**
 * Created by bhushan on 9/3/17.
 */
public class NativeTest {
    public static void main(String[] args) {
        createData();
        HibernateUtil.shutdown();
    }

    private static void createData() {
        BaseDAO<NativeGenerator, Long> baseDAO = new BaseDAO<NativeGenerator, Long>();
        for (int i = 0; i < 5; i++) {
            baseDAO.save(new NativeGenerator());
        }
    }
}
