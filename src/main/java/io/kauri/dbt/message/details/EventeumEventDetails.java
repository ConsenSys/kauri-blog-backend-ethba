package io.kauri.dbt.message.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.kauri.dbt.message.details.parameter.EventParameter;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;
import java.util.List;

@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventeumEventDetails {

    private String name;

    private String filterId;

    private List<EventParameter> indexedParameters;

    private List<EventParameter> nonIndexedParameters;

    private String transactionHash;

    private BigInteger logIndex;

    private BigInteger blockNumber;

    private String blockHash;

    private String address;
}