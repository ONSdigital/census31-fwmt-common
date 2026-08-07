package uk.gov.ons.census.fwmt.common.data.tm;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FetchResponse {
  @JsonProperty(required = true) private List<Case> results;
  @JsonProperty(required = true) private PagingInfo paging;
  private FetchCriteria criteria;
}
