///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package it.esc2.earlyWarning.db;
//
//import it.esc2.earlyWarning.pojo.Cve;
//import it.esc2.earlyWarning.pojo.CvssBaseMetrics;
//import it.esc2.earlyWarning.pojo.VulnCvss;
//import it.esc2.earlyWarning.pojo.VulnCwe;
//import it.esc2.earlyWarning.pojo.VulnVulnerableSoftwareList;
//import it.esc2.earlyWarning.repository.ICveRepository;
//import java.util.Arrays;
//import java.util.List;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
///**
// *
// * @author a.mansour
// */
//@Component
//public class DbSeeder implements CommandLineRunner {
//   
//    private ICveRepository cveRepository;
//
//    public DbSeeder(ICveRepository cveRepository) {
//        this.cveRepository = cveRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        // here i can create a new cve
//
//      
////        Cve firstCve = new Cve(null,new VulnCwe("id"), "lastModifiedDate", new VulnVulnerableSoftwareList(Arrays.asList("p1", "p2")), new VulnCvss(
////                        new CvssBaseMetrics("string Cod", "10-7-2018", "integ-impact", "source", 10.D, "authentication", "availabilityImpact", "accessVector", "accessComplexity")), null, "idCve", "summary", "publishedDate", "cveId");
//        
//       
//       
//    }
//
//}
