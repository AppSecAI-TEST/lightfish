/*
Copyright 2012 Adam Bien, adam-bien.com

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package org.lightfish.presentation.administration.escalation;


import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import org.lightfish.business.escalation.entity.Notifier;
import org.lightfish.business.escalation.boundary.notification.NotifierStore;

/**
 *
 * @author Rob Veldpaus
 */
@Named
@Stateless
public class EditNotifier{
    @Inject NotifierStore notificationStore;
    private Notifier notification;

    public Notifier getNotification() {
        return notification;
    }

    public void setNotification(Notifier notification) {
        this.notification = notification;
    }

    public String update(){
        notificationStore.save(notification);
        return "/escalation/configuration?faces-redirect=true";
    }
    
}
