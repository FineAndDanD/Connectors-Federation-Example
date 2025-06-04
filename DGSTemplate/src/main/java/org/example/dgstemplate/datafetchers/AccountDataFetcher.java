package org.example.dgstemplate.datafetchers;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.GraphQLContext;
import graphql.schema.DataFetchingEnvironment;
import org.example.dgstemplate.models.Account;
import org.example.dgstemplate.models.AggregatedAccount;
import org.example.dgstemplate.models.LinkAccount;

import java.util.List;

@DgsComponent
public class AccountDataFetcher {

    private List<Account> accounts = List.of(
            new LinkAccount("1"),
            new AggregatedAccount("2"),
            new LinkAccount("3")
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
