package school.hei.course.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import school.hei.course.PojaGenerated;

@PojaGenerated
public class BucketConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.s3.bucket", () -> "dummy-bucket");
  }
}
