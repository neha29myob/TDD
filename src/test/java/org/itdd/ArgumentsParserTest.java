package org.itdd;

import org.junit.Test;

import static org.assertj.core.api.StrictAssertions.assertThat;

/*

 A simpler version of http://codingdojo.org/kata/Args/

 If a program is called with these arguments:

   -l -p 8080 -d /usr/logs

 then:

   - "l" indicates logging and is a boolean flag whose value will be True if present False if not
   - "p" indicates port flag which has an integer value
   - "d" (directory) flag has a string value

 they have default values:

   - False for a boolean
   - 0 for a number
   - "" for a string

 */
public class ArgumentsParserTest {
    @Test
    public void whenNoArgumentThenReturnDefaults() {
        ArgumentParser argumentParser = new ArgumentParser();
        String[] result = argumentParser.parse("");

        assertThat(Boolean.parseBoolean(result[0])).isEqualTo(false);
        assertThat(Integer.parseInt(result[1])).isEqualTo(0);
        assertThat(result[2]).isEqualTo("");
    }

    @Test
    public void whenLoggingThenReturnTrue() {
        ArgumentParser argumentParser = new ArgumentParser();
        String[] result = argumentParser.parse("-l");

        assertThat(Boolean.parseBoolean(result[0])).isEqualTo(true);
        assertThat(Integer.parseInt(result[1])).isEqualTo(0);
        assertThat(result[2]).isEqualTo("");
    }

    @Test
    public void whenPortThenReturnPortNumber() {
        ArgumentParser argumentParser = new ArgumentParser();
        String[] result = argumentParser.parse("-p 8080");

        assertThat(Boolean.parseBoolean(result[0])).isEqualTo(false);
        assertThat(Integer.parseInt(result[1])).isEqualTo(8080);
        assertThat(result[2]).isEqualTo("");
    }

    @Test
    public void whenDirectoryThenReturnName() {
        ArgumentParser argumentParser = new ArgumentParser();
        String[] result = argumentParser.parse("-d usr/logs");

        assertThat(Boolean.parseBoolean(result[0])).isEqualTo(false);
        assertThat(Integer.parseInt(result[1])).isEqualTo(0);
        assertThat(result[2]).isEqualTo("usr/logs");
    }

    @Test
    public void whenPortAndDirectoryThenReturnPortNumberAndName() {
        ArgumentParser argumentParser = new ArgumentParser();
        String[] result = argumentParser.parse("-p 8080 -d test");

        assertThat(Boolean.parseBoolean(result[0])).isEqualTo(false);
        assertThat(Integer.parseInt(result[1])).isEqualTo(8080);
        assertThat(result[2]).isEqualTo("test");
    }

    @Test
    public void whenLoggingAndDirectoryThenReturnTrueAndName() {
        ArgumentParser argumentParser = new ArgumentParser();
        String[] result = argumentParser.parse("-l -d test");

        assertThat(Boolean.parseBoolean(result[0])).isEqualTo(true);
        assertThat(Integer.parseInt(result[1])).isEqualTo(0);
        assertThat(result[2]).isEqualTo("test");
    }

    @Test
    public void whenLoggingAndPortThenReturnTrueAndPortNumber() {
        ArgumentParser argumentParser = new ArgumentParser();
        String[] result = argumentParser.parse("-l -p 8080");

        assertThat(Boolean.parseBoolean(result[0])).isEqualTo(true);
        assertThat(Integer.parseInt(result[1])).isEqualTo(8080);
        assertThat(result[2]).isEqualTo("");
    }

    @Test
    public void whenLoggingAndPortAndDirectoryThenReturnTrueAndPortNumberAndName() {
        ArgumentParser argumentParser = new ArgumentParser();
        String[] result = argumentParser.parse("-l -p 8080 -d test");

        assertThat(Boolean.parseBoolean(result[0])).isEqualTo(true);
        assertThat(Integer.parseInt(result[1])).isEqualTo(8080);
        assertThat(result[2]).isEqualTo("test");
    }

    @Test
    public void whenArgumentsAreOutOfOrderThenReturnInExpectedOrder() {
        ArgumentParser argumentParser = new ArgumentParser();
        String[] result = argumentParser.parse("-d test -p 8080 -l");

        assertThat(Boolean.parseBoolean(result[0])).isEqualTo(true);
        assertThat(Integer.parseInt(result[1])).isEqualTo(8080);
        assertThat(result[2]).isEqualTo("test");
    }

}
