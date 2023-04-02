package com.spring.cdc.springhibernateevent.listener;

import org.hibernate.event.spi.PostUpdateEvent;
import org.hibernate.event.spi.PostUpdateEventListener;
import org.hibernate.persister.entity.EntityPersister;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class UpdateListener implements PostUpdateEventListener {
    @Override
    public void onPostUpdate(PostUpdateEvent event) {
        System.out.println("postUpdateEvent is: "+event);
        // Get old state of the object, before update.
        System.out.println("postUpdateEvent is: "+ Arrays.toString(event.getOldState()));
    }

    @Override
    public boolean requiresPostCommitHanding(EntityPersister entityPersister) {
        return false;
    }

}
