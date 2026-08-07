package uk.gov.ons.census.fwmt.common.storageutils;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class StorageProtocolResolver {
  @Autowired
  private List<StorageFunctions> resolverList;
  
  private Map<String, StorageFunctions> resolverMap;
  
  @PostConstruct
  void setup() {
    resolverMap= new HashMap<>();
    for (StorageFunctions folderResolver : resolverList) {
      resolverMap.put(folderResolver.getProtocol(), folderResolver);
    }
  }
  
  public StorageFunctions resolve(URI location) {
      String protocol = location.getScheme();
      return resolverMap.get(protocol);
  }
}
