package com.gw.projectonemen;
import com.gw.projectonemen.entities.Person;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;



@ApplicationPath("/")
public class ProjectOneMenApplication extends Application{


    Person p = new Person();

}


