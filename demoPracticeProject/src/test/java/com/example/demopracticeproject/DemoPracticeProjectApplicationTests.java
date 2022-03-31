package com.example.demopracticeproject;

import com.example.demopracticeproject.Entity.News;
import com.example.demopracticeproject.mapper.NewsMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class DemoPracticeProjectApplicationTests {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private NewsMapper newsMapper;
    /*
    @Test
    void contextLoads() throws SQLException {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from user");
//打印结果
        while(resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String address = resultSet.getString(3);
            System.out.println("id:" + id + " name:" + name + " address:" + address);
        }
     */
    @Test
    void testNewsMapper(){
        News news=newsMapper.getNewsById(1);
        System.out.println(news.toString());
    }

}
