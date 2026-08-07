package uk.gov.ons.census.fwmt.common.data.tm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PagingInfo {
  private Integer pageNo;
  private Integer pageSize;
  private Integer pageCount;
  private Integer totalCount;
  private String previous;
  private String next;
}
