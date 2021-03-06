package com.peramdy.dao.impl.read;

import com.peramdy.dao.read.StudentDao;
import com.peramdy.dto.StudentDto;
import com.peramdy.utils.MapUtil;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by peramdy on 2017/8/21.
 */
@Repository("studentDaoRead")
public class StudentDaoImpl implements StudentDao {


    @PersistenceContext(unitName = "entityManagerFactoryRead")
    private EntityManager entityManager;

    public StudentDto queryStudent(Integer userId) {


        Query query = entityManager.createNativeQuery("SELECT s.id AS id, s.stuName AS Name ,c.id AS classId ,c.className AS className FROM student s LEFT JOIN class c ON c.id = s.classId WHERE s.id = :userId");
        query.setParameter("userId", userId);
        query.unwrap(org.hibernate.SQLQuery.class)
                .setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        List<Map<String, Object>> mapList = query.getResultList();
        if (mapList == null || mapList.size() < 1)
            return null;
        List<StudentDto> dtoList = new ArrayList<StudentDto>();
        for (Map<String, Object> map : mapList) {
            try {
                StudentDto stuDto = (StudentDto) MapUtil.mapToBean(map, StudentDto.class);
                dtoList.add(stuDto);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return dtoList.get(0);
    }

}
