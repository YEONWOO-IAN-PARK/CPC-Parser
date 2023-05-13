package net.miso.parser.cpc.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Data
public class CpcTree {

    private String parentSymbol;
    private String symbol;
    private int parentLevel;
    private int level;
    private String sortKey;
    private String breakdownCode;
    private String notAllocatable;
    private String additionalOnly;
    private String definitionExists;
    private String dateRevised;
    private String status;
}
