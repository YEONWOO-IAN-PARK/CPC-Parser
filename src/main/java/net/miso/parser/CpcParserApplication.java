package net.miso.parser;

import net.miso.parser.cpc.config.AppConfig;
import net.miso.parser.cpc.convert.CpcService;
import net.miso.parser.cpc.dto.CpcMedia;
import net.miso.parser.cpc.dto.CpcNoteAndWarning;
import net.miso.parser.cpc.dto.CpcTitle;
import net.miso.parser.cpc.dto.CpcTree;
import net.miso.parser.cpc.mapper.CpcMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.bind.JAXBException;
import java.util.List;

@SpringBootApplication
@MapperScan(basePackages = "net.miso.parser.cpc.mapper")
public class CpcParserApplication {

	@Resource(name = "cpcService")
	private static CpcService cpcService;

	public static void main(String[] args) throws JAXBException {
//		SpringApplication.run(CpcParserApplication.class, args);
//
//		ApplicationContext context = new AnnotationConfigApplicationContext(CpcParserApplication.class);
//		String[] beanNames = context.getBeanDefinitionNames();
//		for (String beanName : beanNames) {
//			System.out.println(beanName);
//		}
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		cpcService.convertXmlToJava();
	}
	

}
