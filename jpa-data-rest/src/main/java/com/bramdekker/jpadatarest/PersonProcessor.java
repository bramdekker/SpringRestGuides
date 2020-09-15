package com.bramdekker.jpadatarest;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.LinkRelation;
import org.springframework.hateoas.server.RepresentationModelProcessor;

public class PersonProcessor implements RepresentationModelProcessor<EntityModel<Person>> {

    @Override
    public EntityModel<Person> process(EntityModel<Person> model) {
    
        model.removeLinks();
        model.add(Link.of("http://localhost:8080/people").withRel(LinkRelation.of("people")));
    
        return model; 
    }
    
}
