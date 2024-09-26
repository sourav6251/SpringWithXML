package com.XML;

public class ProjectManager {

    public String development;
    public Service service;
    private String projectName;


    public ProjectManager(String development,String projectName){
        this.development=development;
        this.projectName=projectName;
    }
    public void setService(Service service) {
        this.service = service;
    }
    //    public ProjectManager() {}
//
//    // Setter for projectName
//    public void setProjectName(String projectName) {
//        this.projectName = projectName;
//    }



    public void project(){
        System.out.println("Set service..");
        System.out.println("Your Project name is: "+projectName);
        service.teamName();

        if(development.equalsIgnoreCase("appDevelopment")){
            service.appDevelopment();
        }
        else {
            service.webDevelopment();
        }

    }
}
