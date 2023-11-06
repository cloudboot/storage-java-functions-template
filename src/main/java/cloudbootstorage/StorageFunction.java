package cloudbootstorage;

import com.google.cloud.functions.CloudEventsFunction;
import io.cloudevents.CloudEvent;
import java.util.logging.Logger;

public class StorageFunction implements CloudEventsFunction {
  private static final Logger logger = Logger.getLogger(StorageFunction.class.getName());

  @Override
  public void accept(CloudEvent event) {
    logger.info("Cloud Event data: " + new String(event.getData().toBytes()));
  }
}
