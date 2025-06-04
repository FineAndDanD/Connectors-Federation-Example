# Connectors Federated Example

This repo is an example of how to compose a connectors schema with a tranditional subgraph schema. It leverages DGS (excuse the odd name, I copy/pasted it from another location) and is a very basic example of how the Apollo Router is able to resolve a child type across graphs.

## Setup

This project leverages Rover, and also requires a GraphOS license to work with connectors v0.2. Ensure you store your API key/ graph ref as env variables before proceeding:

```bash
export APOLLO_KEY=<API-KEY>
export APOLLO_GRAPH_REF=<GRAPH-REF>
```

You will likely have to set your Federation version in Studio to "Federation Next" in your variant settings to be able to use preview features.

After that, ensure you have the latest version of Rover and run the following:

```bash
APOLLO_ROVER_DEV_ROUTER_VERSION=2.3.0-rc.0 rover dev --supergraph-config basic-java-supergraph.yaml
```

Also be sure to run your JS REST API:

```bash
npm start
```

And be sure to get your DGS subgraph up and running as well.

## Notes

You will need Java 21 to be able to run the DGS subgraph.
This repo is meant to be a demonstration and is not a good representation of robust design. The purpose is simply to demonstrate entity resolvers with connectors and how the router is able to leverage both a connector schema with a traditional schema supported by subgraph resolvers.

Important Note: Connector Entity Resolvers as demonstrated in this project are still preview, but will be released soon! Stay tuned.