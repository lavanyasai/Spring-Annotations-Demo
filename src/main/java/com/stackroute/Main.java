package com.stackroute;

import com.stackroute.domain.ActorConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main
{
    public static void main( String[] args ) {

        //Using ApplicationContext
        AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(ActorConfig.class);
        Movie firstMovie = applicationContext.getBean("firstMovie", Movie.class);
        firstMovie.displayInformation();

        Movie secondMovie = applicationContext.getBean("secondMovie", Movie.class);
        secondMovie.displayInformation();

        applicationContext.close();
    }
}
