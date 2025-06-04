package org.example.dgstemplate.datafetchers;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsEntityFetcher;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.context.DgsContext;
import graphql.GraphQLContext;
import graphql.schema.DataFetchingEnvironment;
import org.example.dgstemplate.models.Account;

import java.util.List;

@DgsComponent
public class AccountDataFetcher {

    private List<Account> accounts = List.of(
            new Account("1"),
            new Account("2")
    );

    @DgsData(parentType = "Pool")
//    @DgsEntityFetcher(name = "Account")
    public List<Account> accounts(DataFetchingEnvironment dfe) {
//        DgsContext context = DgsContext.from(dfe);
        GraphQLContext context = dfe.getGraphQlContext();

        context.stream().forEach(System.out::println);
        return accounts;
    }
}
