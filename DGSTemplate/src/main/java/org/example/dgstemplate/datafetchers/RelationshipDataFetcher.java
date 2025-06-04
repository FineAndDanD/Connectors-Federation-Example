package org.example.dgstemplate.datafetchers;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import org.example.dgstemplate.models.Relationship;

@DgsComponent
public class RelationshipDataFetcher {

    private final Relationship relationship = new Relationship("1", null);

    @DgsQuery
    public Relationship relationship() {
        return relationship;
    }
}
