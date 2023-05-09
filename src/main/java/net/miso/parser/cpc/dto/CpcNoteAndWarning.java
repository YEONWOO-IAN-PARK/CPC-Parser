package net.miso.parser.cpc.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Data
public class CpcNoteAndWarning {

    private String symbol;
    private int level;
    private String type;
    private int seq;
    private int depth;  // 실제 subnote 참/거짓 및 계층을 알 수 있음. 1 이상이면 그 노트는 subnote에 해당함
    /**
     *  해당 변수는 각각의 CpcNoteAndWarning객체를 웹에 표현할 때, 문장 앞에 붙는 기호들을 구분하기 위해 만들어졌다.
     *  Subnote 뿐 만아니라, 일반적인 <note-paragraph> 요소가 2개 이상일때도 subnoteType는 기본적으로 number이다.
     */
    private String subnoteType;
    private String content;
    private String dateRevised;
}
