package net.miso.parser.cpc.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Data
public class CpcTitle {

    private String symbol;
    private int level;
    private String title;
    private String dateRevised;
}
