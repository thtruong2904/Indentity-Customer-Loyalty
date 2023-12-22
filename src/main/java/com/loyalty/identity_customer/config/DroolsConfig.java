//package com.loyalty.topic1.config;
//
//import org.kie.api.KieServices;
//import org.kie.api.builder.*;
//import org.kie.api.runtime.KieContainer;
//import org.kie.api.runtime.KieSession;
//import org.kie.internal.io.ResourceFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.io.IOException;
//
//@Configuration
//public class DroolsConfig {
//    private KieServices kieServices = KieServices.Factory.get();
//
//    private KieFileSystem getKieFileSystem() throws IOException{
//        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
//        kieFileSystem.write(ResourceFactory.newClassPathResource("rules/label/label.drl"));
//        return kieFileSystem;
//    }
//
//    @Bean
//    public KieContainer getKieContainer() throws IOException{
//        System.out.println("Container created....");
//        getKieRepository();
//        KieBuilder kb = kieServices.newKieBuilder(getKieFileSystem());
//        kb.buildAll();
//        KieModule kieModule = kb.getKieModule();
//        KieContainer kContainer = kieServices.newKieContainer(kieModule.getReleaseId());
//        KieSession defaultKieSession = kContainer.newKieSession();
//        return kContainer;
//    }
//
//    private void getKieRepository() {
//        final KieRepository kieRepository = kieServices.getRepository();
//        kieRepository.addKieModule(new KieModule() {
//            public ReleaseId getReleaseId() {
//                return kieRepository.getDefaultReleaseId();
//            }
//        });
//    }
//
//    @Bean
//    public KieSession getKieSession() throws IOException{
//        System.out.println("session created....");
//        return getKieContainer().newKieSession();
//    }
//}
