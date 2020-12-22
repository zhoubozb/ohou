package com.atguigu;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test {



    private static Properties pro ;
    /*static{
　　InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("upload.properties");
        try {
　　pro= new Properties();
　　pro.load(inputStream);
        } catch (IOException e) {
　　e.printStackTrace();
        }

    }*/

    public static void  main(String [] args){
        String s = "'2017-08-10', '2020-08-18', NULL, '王南', NULL, NULL, NULL, '住宅', '华府骏苑', '0131459', '273.03', '2017-06-19', '10823', '2068500.0', '/apps/webapp/nfs/ai/9d4483425e9142ada5d71c82d756e1b2/structure/P20200818142726049000000000910.png', '9d4483425e9142ada5d71c82d756e1b2', 'C20200719142340048000000006672', '王南', '13761111035', '1', '372929198712230087', '山东省鄄城县陈王街道办事处王建场行政村王建场村166号', '2017.11.07-2037.11.07', '/apps/webapp/nfs/ai/9d4483425e9142ada5d71c82d756e1b2/idcard_front/P20200818142311047000000000764.png', '/apps/webapp/nfs/ai/9d4483425e9142ada5d71c82d756e1b2/idcard_back/P20200818142320049000000000898.png', '10', NULL, NULL, NULL, NULL, NULL, NULL, '生意周转', NULL, '/apps/webapp/nfs/ai/9d4483425e9142ada5d71c82d756e1b2/busLicense/P20200818145516049000000000933.png', NULL, NULL, NULL, '2', '9999', NULL, NULL, NULL, '360', '合肥市蜀山区，国际花都天香苑14号楼204', '/apps/webapp/nfs/ai/9d4483425e9142ada5d71c82d756e1b2/idcard_face/P20200818142311047000000000765.png', NULL, NULL, NULL, NULL";

        String [] arr = s.split(",");
        System.out.println(arr.length+".................");
    }

    public static void readprop(){
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("application-dev.properties");

        try {
            pro = new Properties();
            pro.load(inputStream);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


}
