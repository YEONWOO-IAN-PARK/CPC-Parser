package net.miso.parser.cpc.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class CpcMedia {

    private String symbol;
    private int level;
    private int id;
    private String fileName;
    private String storePath;
    private String type;

}
