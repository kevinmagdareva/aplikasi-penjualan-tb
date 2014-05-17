package net.smktarunabhakti.penjualan;

import net.smktarunabhakti.penjualan.domain.Barang;
import net.smktarunabhakti.penjualan.service.AppService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    private static  ApplicationContext appCtx;
    private static AppService appService;
    public static void main( String[] args )
    {
        appCtx = new ClassPathXmlApplicationContext(
        "classpath:net/smktarunabhakti/penjualan/"
        + "applicationContext.xml");
        appService = (AppService)appCtx.getBean("appService");
        saveBarang();
    }
    public static void saveBarang(){
        Barang b = new Barang();
        b.setKodeBarang("Jono");
        b.setNamaBarang("Juned");
        
        appService.simpanBarang(b);
    }
}
