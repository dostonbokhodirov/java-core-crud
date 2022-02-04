package dto;

import lombok.*;

/**
 * @author Doston Bokhodirov, Fri 2:31 AM. 2/4/2022
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GenericDto implements BaseGenericDto {
    private Long id;
}
