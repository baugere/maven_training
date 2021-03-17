package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    @Test
    void adding_3_and_5_should_produce_8() {

        int result = Sample.add(3,5);

        Assertions.assertThat(result)
            .isEqualTo(8);
    }
}
