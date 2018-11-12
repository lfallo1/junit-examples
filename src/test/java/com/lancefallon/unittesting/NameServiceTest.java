package com.lancefallon.unittesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
class NameServiceTest {

    private static final String TEST_STRING = "TEST_STRING";

    @Mock
    StringHelper stringHelper;

    @InjectMocks
    NameService nameService;

    @Test
    void greet() {
        String name = "Lance";
        Mockito.when(this.stringHelper.toUpper(Mockito.anyString())).thenReturn(TEST_STRING);
        String result = this.nameService.greet(name);
        assertEquals("Hello, " + TEST_STRING, result);
    }
}