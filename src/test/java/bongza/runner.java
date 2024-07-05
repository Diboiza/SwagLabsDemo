package bongza;
import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("bongza/features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "bongza/Steps")
public class runner {
}
