package run;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "src/test/java/bdd",tags={"@CepComSucesso"},
glue = "classpath:pag",monochrome = true, dryRun = false)

public class AllTests {}
