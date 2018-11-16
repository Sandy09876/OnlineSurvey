
package com.qdu.dao;

import com.qdu.pojo.User;
import com.qdu.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class UserDao {
    //查
    public User findUserBystidspwd(int userId,String spwd){
        Session session=null;
        session=HibernateUtil.getSession();
        Query query=session.createQuery("from User where userId=:userId and userPassword=:spwd");
        query.setInteger("userId", userId);
        query.setString("spwd", spwd);
        List<User> list=(List<User>)query.list();
        if(list.size()!=0)
           return list.get(0);
        if(session!=null)
            session.close();
        
        return null;
    } 
   
    //保存学生注册信息
    public int insert(User user) {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            Transaction tran = session.beginTransaction();
            session.save(user);
            tran.commit();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

 
    
     
    
}
