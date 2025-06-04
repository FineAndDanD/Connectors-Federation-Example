package org.example.dgstemplate.datafetchers;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsQuery;
import org.example.dgstemplate.models.Pool;

import java.util.List;

@DgsComponent
public class PoolDataFetcher {

    private final List<Pool> pools = List.of(
            new Pool("1", null)
    );

    @DgsData(parentType = "Relationship")
    public List<Pool> pools() {
        return pools;
    }
}
