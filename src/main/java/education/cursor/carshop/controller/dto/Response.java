package education.cursor.carshop.controller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Getter
@Setter
@Builder
public class Response {
    private  String message;

    @Singular
    private List<Map<String, Object>> infos;
}
