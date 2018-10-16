package com.github.parkerwy;


import org.apache.maven.plugin.testing.MojoRule;
import org.junit.Rule;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GenerateMojoTest {
    @Rule
    public MojoRule rule = new MojoRule() {
        @Override
        protected void before() throws Throwable {
        }

        @Override
        protected void after() {
        }
    };

    /**
     * @throws Exception if any
     */
    @Test
    public void shouldRunGenerateMojo() throws Exception {
        File pom = new File("target/test-classes/project-to-test/");
        assertNotNull(pom);
        assertTrue(pom.exists());

        GenerateMojo generateMojo = (GenerateMojo) rule.lookupConfiguredMojo(pom, "generate");
        assertNotNull(generateMojo);
        generateMojo.execute();
    }

}

