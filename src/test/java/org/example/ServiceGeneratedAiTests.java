package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import org.mockito.Mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven_GivenEvenNumber_ReturnsTrue() {
        // GIVEN an even number
        int input = 4;
        // WHEN isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN the result should be true
        assertTrue(result);
    }

    @Test
    void testIsEven_GivenOddNumber_ReturnsFalse() {
        // GIVEN an odd number
        int input = 5;
        // WHEN isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN the result should be false
        assertFalse(result);
    }

    @Test
    void testHighComplexityMethod_GivenAllPositive() {
        // GIVEN a, b, and c are all positive
        int a = 1;
        int b = 2;
        int c = 3;
        // WHEN highComplexityMethod is called with the inputs
        service.highComplexityMethod(a, b, c);
        // THEN the expected output should be printed
    }

    @Test
    void testHighComplexityMethod_GivenAPositiveBCNegative() {
        // GIVEN a is positive, b and c are negative
        int a = 1;
        int b = -2;
        int c = -3;
        // WHEN highComplexityMethod is called with the inputs
        service.highComplexityMethod(a, b, c);
        // THEN the expected output should be printed
    }

    @Test
    void testHighComplexityMethod_GivenANegativeBCPositive() {
        // GIVEN a is negative, b and c are positive
        int a = -1;
        int b = 2;
        int c = 3;
        // WHEN highComplexityMethod is called with the inputs
        service.highComplexityMethod(a, b, c);
        // THEN the expected output should be printed
    }

    @Test
    void testHighComplexityMethod_GivenAllNegative() {
        // GIVEN a, b, and c are all negative
        int a = -1;
        int b = -2;
        int c = -3;
        // WHEN highComplexityMethod is called with the inputs
        service.highComplexityMethod(a, b, c);
        // THEN the expected output should be printed
    }



}

/*
2025-07-18 15:38:51.807 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-18 15:38:51.811 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generating code...
2025-07-18 15:38:51.811 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package org.example;

public class Service {
    public boolean isEven(int input) {
        return input % 2 == 0;
    }

}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven_GivenEvenNumber_ReturnsTrue() {
        // GIVEN an even number
        int input = 4;
        // WHEN isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN it should return true
        assertTrue(result);
    }

    @Test
    void testIsEven_GivenOddNumber_ReturnsFalse() {
        // GIVEN an odd number
        int input = 7;
        // WHEN isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN it should return false
        assertFalse(result);
    }
}


>> REQUIREMENTS:

1. The response must contain fully functional test code.
2. The response must be in plain text (no code block formatting like '''java ''').
3. Place the generated tests in the SAME PACKAGE as the input JAVA class.
4. Follow this naming convention for the test class: use the original class name and append "GeneratedAiTests".
  - Do not add another "s" if the class name already ends with "s".
  - Do not append "Tests" if the class name ends with "x", "ch", "sh", or "ss".
    Example: `HelloAction` becomes `HelloActionGeneratedAiTests`.
5. Use JUNIT5 for the test framework, MOCKITO for mocking, and ASSERTJ for assertions.
6. Exclude `DisplayName` annotations.
7. Include necessary imports for annotations like `@ExtendWith`.
8. Ensure each test method has at least one assertion.
9. Avoid generating tests for private methods—focus only on public and protected methods.
10. Ensure any modified state in the test is reset before each test with a `@BeforeEach` method.
11. Tests should be independent; no test should rely on the result of another.
12. If no mocks are needed, skip importing mock-related libraries.
13. Organize the test methods using the GIVEN WHEN THEN structure. Each test should begin with a GIVEN section that sets up the necessary preconditions or context, followed by a WHEN section that describes the action being tested, and concluding with a THEN section that specifies the expected outcome. Include comments for each section to clearly indicate their purpose.
14. If error compilation refers to 'reference to assertThat is ambiguous' please do not use org.assertj.core.api.Assertions.assertThat, apart that please use assertEquals(expected, actual) from org.junit.jupiter.api.Assertions.assertEquals
15. Please do not forget about necessary imports
16. Check if the class name matches the requirements, e.g. classWithUnitTests instead of classWithUnitTest
17. If a test fails, check it again to see if it's well written, is assertion correct

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

2025-07-18 15:38:51.811 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-18 15:39:49.217 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 1910, outputTokenCount = 229, totalTokenCount = 2139 }
2025-07-18 15:39:49.217 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
2025-07-18 15:39:49.217 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generated code:
package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven_GivenEvenNumber_ReturnsTrue() {
        // GIVEN an even number
        int input = 4;
        // WHEN isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN it should return true
        assertTrue(result);
    }

    @Test
    void testIsEven_GivenOddNumber_ReturnsFalse() {
        // GIVEN an odd number
        int input = 7;
        // WHEN isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN it should return false
        assertFalse(result);
    }
}




2025-07-18 15:39:49.217 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Refining code...
2025-07-18 15:39:49.217 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
2025-07-18 15:39:59.032 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-18 15:39:59.033 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generating code...
2025-07-18 15:39:59.033 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package org.example;

public class Service {
    public boolean isEven(int input) {
        return input % 2 == 0;
    }

}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven_GivenEvenNumber_ReturnsTrue() {
        // GIVEN an even number
        int input = 4;
        // WHEN isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN it should return true
        assertTrue(result);
    }

    @Test
    void testIsEven_GivenOddNumber_ReturnsFalse() {
        // GIVEN an odd number
        int input = 7;
        // WHEN isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN it should return false
        assertFalse(result);
    }
}


>> REQUIREMENTS:

1. The response must contain fully functional test code.
2. The response must be in plain text (no code block formatting like '''java ''').
3. Place the generated tests in the SAME PACKAGE as the input JAVA class.
4. Follow this naming convention for the test class: use the original class name and append "GeneratedAiTests".
  - Do not add another "s" if the class name already ends with "s".
  - Do not append "Tests" if the class name ends with "x", "ch", "sh", or "ss".
    Example: `HelloAction` becomes `HelloActionGeneratedAiTests`.
5. Use JUNIT5 for the test framework, MOCKITO for mocking, and ASSERTJ for assertions.
6. Exclude `DisplayName` annotations.
7. Include necessary imports for annotations like `@ExtendWith`.
8. Ensure each test method has at least one assertion.
9. Avoid generating tests for private methods—focus only on public and protected methods.
10. Ensure any modified state in the test is reset before each test with a `@BeforeEach` method.
11. Tests should be independent; no test should rely on the result of another.
12. If no mocks are needed, skip importing mock-related libraries.
13. Organize the test methods using the GIVEN WHEN THEN structure. Each test should begin with a GIVEN section that sets up the necessary preconditions or context, followed by a WHEN section that describes the action being tested, and concluding with a THEN section that specifies the expected outcome. Include comments for each section to clearly indicate their purpose.
14. If error compilation refers to 'reference to assertThat is ambiguous' please do not use org.assertj.core.api.Assertions.assertThat, apart that please use assertEquals(expected, actual) from org.junit.jupiter.api.Assertions.assertEquals
15. Please do not forget about necessary imports
16. Check if the class name matches the requirements, e.g. classWithUnitTests instead of classWithUnitTest
17. If a test fails, check it again to see if it's well written, is assertion correct

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

2025-07-18 15:39:59.033 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-18 15:41:47.894 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 3211, outputTokenCount = 229, totalTokenCount = 3440 }
2025-07-18 15:41:47.894 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
2025-07-18 15:41:47.894 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generated code:
package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven_GivenEvenNumber_ReturnsTrue() {
        // GIVEN an even number
        int input = 4;
        // WHEN isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN it should return true
        assertTrue(result);
    }

    @Test
    void testIsEven_GivenOddNumber_ReturnsFalse() {
        // GIVEN an odd number
        int input = 7;
        // WHEN isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN it should return false
        assertFalse(result);
    }

}




2025-07-18 15:41:47.894 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Refining code...
2025-07-18 15:41:47.894 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
2025-07-18 15:41:57.938 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-18 15:41:57.938 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generating code...
2025-07-18 15:41:57.940 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package org.example;

public class Service {
    public boolean isEven(int input) {
        return input % 2 == 0;
    }

}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven_GivenEvenNumber_ReturnsTrue() {
        // GIVEN an even number
        int input = 4;
        // WHEN isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN it should return true
        assertTrue(result);
    }

    @Test
    void testIsEven_GivenOddNumber_ReturnsFalse() {
        // GIVEN an odd number
        int input = 7;
        // WHEN isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN it should return false
        assertFalse(result);
    }

}


>> REQUIREMENTS:

1. The response must contain fully functional test code.
2. The response must be in plain text (no code block formatting like '''java ''').
3. Place the generated tests in the SAME PACKAGE as the input JAVA class.
4. Follow this naming convention for the test class: use the original class name and append "GeneratedAiTests".
  - Do not add another "s" if the class name already ends with "s".
  - Do not append "Tests" if the class name ends with "x", "ch", "sh", or "ss".
    Example: `HelloAction` becomes `HelloActionGeneratedAiTests`.
5. Use JUNIT5 for the test framework, MOCKITO for mocking, and ASSERTJ for assertions.
6. Exclude `DisplayName` annotations.
7. Include necessary imports for annotations like `@ExtendWith`.
8. Ensure each test method has at least one assertion.
9. Avoid generating tests for private methods—focus only on public and protected methods.
10. Ensure any modified state in the test is reset before each test with a `@BeforeEach` method.
11. Tests should be independent; no test should rely on the result of another.
12. If no mocks are needed, skip importing mock-related libraries.
13. Organize the test methods using the GIVEN WHEN THEN structure. Each test should begin with a GIVEN section that sets up the necessary preconditions or context, followed by a WHEN section that describes the action being tested, and concluding with a THEN section that specifies the expected outcome. Include comments for each section to clearly indicate their purpose.
14. If error compilation refers to 'reference to assertThat is ambiguous' please do not use org.assertj.core.api.Assertions.assertThat, apart that please use assertEquals(expected, actual) from org.junit.jupiter.api.Assertions.assertEquals
15. Please do not forget about necessary imports
16. Check if the class name matches the requirements, e.g. classWithUnitTests instead of classWithUnitTest
17. If a test fails, check it again to see if it's well written, is assertion correct

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

2025-07-18 15:41:57.940 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-18 15:43:13.971 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 4514, outputTokenCount = 229, totalTokenCount = 4743 }
2025-07-18 15:43:13.971 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
2025-07-18 15:43:13.972 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generated code:
package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven_GivenEvenNumber_ReturnsTrue() {
        // GIVEN an even number
        int input = 4;
        // WHEN isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN it should return true
        assertTrue(result);
    }

    @Test
    void testIsEven_GivenOddNumber_ReturnsFalse() {
        // GIVEN an odd number
        int input = 7;
        // WHEN isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN it should return false
        assertFalse(result);
    }

}




2025-07-18 15:43:13.972 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Refining code...
2025-07-18 15:43:13.973 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
2025-07-18 15:55:07.292 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-18 15:55:07.298 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generating code...
2025-07-18 15:55:07.299 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package org.example;

public class Service {
    public boolean isEven(int input) {
        return input % 2 == 0;
    }

}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven_GivenEvenNumber_ReturnsTrue() {
        // GIVEN an even number
        int input = 4;
        // WHEN isEven method is called
        boolean result = service.isEven(input);
        // THEN the result should be true
        assertTrue(result);
    }

    @Test
    void testIsEven_GivenOddNumber_ReturnsFalse() {
        // GIVEN an odd number
        int input = 7;
        // WHEN isEven method is called
        boolean result = service.isEven(input);
        // THEN the result should be false
        assertFalse(result);
    }

}


>> REQUIREMENTS:

1. The response must contain fully functional test code.
2. The response must be in plain text (no code block formatting like '''java ''').
3. Place the generated tests in the SAME PACKAGE as the input JAVA class.
4. Follow this naming convention for the test class: use the original class name and append "GeneratedAiTests".
  - Do not add another "s" if the class name already ends with "s".
  - Do not append "Tests" if the class name ends with "x", "ch", "sh", or "ss".
    Example: `HelloAction` becomes `HelloActionGeneratedAiTests`.
5. Use JUNIT5 for the test framework, MOCKITO for mocking, and ASSERTJ for assertions.
6. Exclude `DisplayName` annotations.
7. Include necessary imports for annotations like `@ExtendWith`.
8. Ensure each test method has at least one assertion.
9. Avoid generating tests for private methods—focus only on public and protected methods.
10. Ensure any modified state in the test is reset before each test with a `@BeforeEach` method.
11. Tests should be independent; no test should rely on the result of another.
12. If no mocks are needed, skip importing mock-related libraries.
13. Organize the test methods using the GIVEN WHEN THEN structure. Each test should begin with a GIVEN section that sets up the necessary preconditions or context, followed by a WHEN section that describes the action being tested, and concluding with a THEN section that specifies the expected outcome. Include comments for each section to clearly indicate their purpose.
14. If error compilation refers to 'reference to assertThat is ambiguous' please do not use org.assertj.core.api.Assertions.assertThat, apart that please use assertEquals(expected, actual) from org.junit.jupiter.api.Assertions.assertEquals
15. Please do not forget about necessary imports
16. Check if the class name matches the requirements, e.g. classWithUnitTests instead of classWithUnitTest
17. If a test fails, check it again to see if it's well written, is assertion correct

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

2025-07-18 15:55:07.299 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-18 15:56:27.435 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 1906, outputTokenCount = 226, totalTokenCount = 2132 }
2025-07-18 15:56:27.436 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
2025-07-18 15:56:27.436 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generated code:
package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven_GivenEvenNumber_ReturnsTrue() {
        // GIVEN an even number
        int input = 4;
        // WHEN isEven method is called
        boolean result = service.isEven(input);
        // THEN the result should be true
        assertTrue(result);
    }

    @Test
    void testIsEven_GivenOddNumber_ReturnsFalse() {
        // GIVEN an odd number
        int input = 7;
        // WHEN isEven method is called
        boolean result = service.isEven(input);
        // THEN the result should be false
        assertFalse(result);
    }

}




2025-07-18 15:56:27.436 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Refining code...
2025-07-18 15:56:27.436 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
2025-07-18 15:56:37.324 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-18 15:56:37.325 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generating code...
2025-07-18 15:56:37.325 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package org.example;

public class Service {
    public boolean isEven(int input) {
        return input % 2 == 0;
    }

}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven_GivenEvenNumber_ReturnsTrue() {
        // GIVEN an even number
        int input = 4;
        // WHEN isEven method is called
        boolean result = service.isEven(input);
        // THEN the result should be true
        assertTrue(result);
    }

    @Test
    void testIsEven_GivenOddNumber_ReturnsFalse() {
        // GIVEN an odd number
        int input = 7;
        // WHEN isEven method is called
        boolean result = service.isEven(input);
        // THEN the result should be false
        assertFalse(result);
    }

}


>> REQUIREMENTS:

1. The response must contain fully functional test code.
2. The response must be in plain text (no code block formatting like '''java ''').
3. Place the generated tests in the SAME PACKAGE as the input JAVA class.
4. Follow this naming convention for the test class: use the original class name and append "GeneratedAiTests".
  - Do not add another "s" if the class name already ends with "s".
  - Do not append "Tests" if the class name ends with "x", "ch", "sh", or "ss".
    Example: `HelloAction` becomes `HelloActionGeneratedAiTests`.
5. Use JUNIT5 for the test framework, MOCKITO for mocking, and ASSERTJ for assertions.
6. Exclude `DisplayName` annotations.
7. Include necessary imports for annotations like `@ExtendWith`.
8. Ensure each test method has at least one assertion.
9. Avoid generating tests for private methods—focus only on public and protected methods.
10. Ensure any modified state in the test is reset before each test with a `@BeforeEach` method.
11. Tests should be independent; no test should rely on the result of another.
12. If no mocks are needed, skip importing mock-related libraries.
13. Organize the test methods using the GIVEN WHEN THEN structure. Each test should begin with a GIVEN section that sets up the necessary preconditions or context, followed by a WHEN section that describes the action being tested, and concluding with a THEN section that specifies the expected outcome. Include comments for each section to clearly indicate their purpose.
14. If error compilation refers to 'reference to assertThat is ambiguous' please do not use org.assertj.core.api.Assertions.assertThat, apart that please use assertEquals(expected, actual) from org.junit.jupiter.api.Assertions.assertEquals
15. Please do not forget about necessary imports
16. Check if the class name matches the requirements, e.g. classWithUnitTests instead of classWithUnitTest
17. If a test fails, check it again to see if it's well written, is assertion correct

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

2025-07-18 15:56:37.325 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-18 15:58:17.433 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 3203, outputTokenCount = 226, totalTokenCount = 3429 }
2025-07-18 15:58:17.433 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
2025-07-18 15:58:17.433 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generated code:
package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven_GivenEvenNumber_ReturnsTrue() {
        // GIVEN an even number
        int input = 4;
        // WHEN isEven method is called
        boolean result = service.isEven(input);
        // THEN the result should be true
        assertTrue(result);
    }

    @Test
    void testIsEven_GivenOddNumber_ReturnsFalse() {
        // GIVEN an odd number
        int input = 7;
        // WHEN isEven method is called
        boolean result = service.isEven(input);
        // THEN the result should be false
        assertFalse(result);
    }

}




2025-07-18 15:58:17.433 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Refining code...
2025-07-18 15:58:17.433 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
2025-07-18 15:58:27.313 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-18 15:58:27.315 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generating code...
2025-07-18 15:58:27.315 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package org.example;

public class Service {
    public boolean isEven(int input) {
        return input % 2 == 0;
    }

}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven_GivenEvenNumber_ReturnsTrue() {
        // GIVEN an even number
        int input = 4;
        // WHEN isEven method is called
        boolean result = service.isEven(input);
        // THEN the result should be true
        assertTrue(result);
    }

    @Test
    void testIsEven_GivenOddNumber_ReturnsFalse() {
        // GIVEN an odd number
        int input = 7;
        // WHEN isEven method is called
        boolean result = service.isEven(input);
        // THEN the result should be false
        assertFalse(result);
    }

}


>> REQUIREMENTS:

1. The response must contain fully functional test code.
2. The response must be in plain text (no code block formatting like '''java ''').
3. Place the generated tests in the SAME PACKAGE as the input JAVA class.
4. Follow this naming convention for the test class: use the original class name and append "GeneratedAiTests".
  - Do not add another "s" if the class name already ends with "s".
  - Do not append "Tests" if the class name ends with "x", "ch", "sh", or "ss".
    Example: `HelloAction` becomes `HelloActionGeneratedAiTests`.
5. Use JUNIT5 for the test framework, MOCKITO for mocking, and ASSERTJ for assertions.
6. Exclude `DisplayName` annotations.
7. Include necessary imports for annotations like `@ExtendWith`.
8. Ensure each test method has at least one assertion.
9. Avoid generating tests for private methods—focus only on public and protected methods.
10. Ensure any modified state in the test is reset before each test with a `@BeforeEach` method.
11. Tests should be independent; no test should rely on the result of another.
12. If no mocks are needed, skip importing mock-related libraries.
13. Organize the test methods using the GIVEN WHEN THEN structure. Each test should begin with a GIVEN section that sets up the necessary preconditions or context, followed by a WHEN section that describes the action being tested, and concluding with a THEN section that specifies the expected outcome. Include comments for each section to clearly indicate their purpose.
14. If error compilation refers to 'reference to assertThat is ambiguous' please do not use org.assertj.core.api.Assertions.assertThat, apart that please use assertEquals(expected, actual) from org.junit.jupiter.api.Assertions.assertEquals
15. Please do not forget about necessary imports
16. Check if the class name matches the requirements, e.g. classWithUnitTests instead of classWithUnitTest
17. If a test fails, check it again to see if it's well written, is assertion correct

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

2025-07-18 15:58:27.315 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-18 16:00:07.659 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 4500, outputTokenCount = 226, totalTokenCount = 4726 }
2025-07-18 16:00:07.659 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
2025-07-18 16:00:07.659 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generated code:
package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven_GivenEvenNumber_ReturnsTrue() {
        // GIVEN an even number
        int input = 4;
        // WHEN isEven method is called
        boolean result = service.isEven(input);
        // THEN the result should be true
        assertTrue(result);
    }

    @Test
    void testIsEven_GivenOddNumber_ReturnsFalse() {
        // GIVEN an odd number
        int input = 7;
        // WHEN isEven method is called
        boolean result = service.isEven(input);
        // THEN the result should be false
        assertFalse(result);
    }

}




2025-07-18 16:00:07.659 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Refining code...
2025-07-18 16:00:07.659 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
2025-07-18 16:34:53.154 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-18 16:34:53.158 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generating code...
2025-07-18 16:34:53.158 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package org.example;

public class Service {
    public boolean isEven(int input) {
        return input % 2 == 0;
    }

}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import org.mockito.Mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void isEven_GivenZero_ReturnsTrue() {
        // GIVEN
        int input = 0;
        // WHEN
        boolean result = service.isEven(input);
        // THEN
        assertTrue(result);
    }

    @Test
    void isEven_GivenTwo_ReturnsTrue() {
        // GIVEN
        int input = 2;
        // WHEN
        boolean result = service.isEven(input);
        // THEN
        assertTrue(result);
    }

    @Test
    void isEven_GivenOne_ReturnsFalse() {
        // GIVEN
        int input = 1;
        // WHEN
        boolean result = service.isEven(input);
        // THEN
        assertFalse(result);
    }
}


>> REQUIREMENTS:

1. The response must contain fully functional test code.
2. The response must be in plain text (no code block formatting like '''java ''').
3. Place the generated tests in the SAME PACKAGE as the input JAVA class.
4. Follow this naming convention for the test class: use the original class name and append "GeneratedAiTests".
  - Do not add another "s" if the class name already ends with "s".
  - Do not append "Tests" if the class name ends with "x", "ch", "sh", or "ss".
    Example: `HelloAction` becomes `HelloActionGeneratedAiTests`.
5. Use JUNIT5 for the test framework, MOCKITO for mocking, and ASSERTJ for assertions.
6. Exclude `DisplayName` annotations.
7. Include necessary imports for annotations like `@ExtendWith`.
8. Ensure each test method has at least one assertion.
9. Avoid generating tests for private methods—focus only on public and protected methods.
10. Ensure any modified state in the test is reset before each test with a `@BeforeEach` method.
11. Tests should be independent; no test should rely on the result of another.
12. If no mocks are needed, skip importing mock-related libraries.
13. Organize the test methods using the GIVEN WHEN THEN structure. Each test should begin with a GIVEN section that sets up the necessary preconditions or context, followed by a WHEN section that describes the action being tested, and concluding with a THEN section that specifies the expected outcome. Include comments for each section to clearly indicate their purpose.
14. If error compilation refers to 'reference to assertThat is ambiguous' please do not use org.assertj.core.api.Assertions.assertThat, apart that please use assertEquals(expected, actual) from org.junit.jupiter.api.Assertions.assertEquals
15. Please do not forget about necessary imports
16. Check if the class name matches the requirements, e.g. classWithUnitTests instead of classWithUnitTest
17. If a test fails, check it again to see if it's well written, is assertion correct

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

2025-07-18 16:34:53.158 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-18 16:43:13.501 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:36)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Building a prompt for fixing unit tests issue...
2025-07-18 16:43:13.504 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generating code...
2025-07-18 16:43:13.504 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Using prompt:

There is an error in the previously generated test class.

>> ERROR:

[ERROR] COMPILATION ERROR : 
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[32,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[32,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[33,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[33,13] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[34,24] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[34,25] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[34,31] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[39,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[39,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[40,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[40,13] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[41,25] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[41,26] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[41,32] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[46,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[46,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[47,21] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[48,26] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[48,95] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[53,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[53,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[54,21] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[55,26] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[55,95] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[60,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[60,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[61,21] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[62,26] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[62,99] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[67,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[67,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[68,21] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[69,26] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[69,99] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[74,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[74,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[75,21] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[76,26] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[76,99] ';' expected
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.11.0:testCompile (default-testCompile) on project dummy-java-project: Compilation failure: Compilation failure: 
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[32,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[32,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[33,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[33,13] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[34,24] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[34,25] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[34,31] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[39,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[39,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[40,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[40,13] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[41,25] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[41,26] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[41,32] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[46,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[46,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[47,21] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[48,26] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[48,95] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[53,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[53,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[54,21] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[55,26] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[55,95] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[60,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[60,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[61,21] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[62,26] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[62,99] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[67,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[67,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[68,21] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[69,26] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[69,99] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[74,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[74,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[75,21] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[76,26] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[76,99] ';' expected
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException


# TASK: Correct the error in the test class.

# Instructions:
1. Focus on the specific error given.
2. Ensure that the corrected code passes and assertions are valid.
3. Keep unrelated parts of the test unchanged.
4. Follow existing project standards, including naming and formatting.

2025-07-18 16:43:13.504 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-18 16:44:54.596 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 7525, outputTokenCount = 569, totalTokenCount = 8094 }
2025-07-18 16:44:54.596 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
2025-07-18 16:44:54.597 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generated code:
```java
package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven() {
        GIVEN int input = 4;
        WHEN boolean result = service.isEven(input);
        THEN assertTrue(result);
    }

    @Test
    void testIsEvenNegative() {
        GIVEN int input = -5;
        WHEN boolean result = service.isEven(input);
        THEN assertFalse(result);
    }

    @Test
    void testHighComplexityMethodPositive() {
        GIVEN int a = 1, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals("a is positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveA() {
        GIVEN int a = 0, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals("a is positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNegativeA() {
        GIVEN int a = -1, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals("a is non-positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveB() {
        GIVEN int a = 1, b = 0, c = 3;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals("a is positive\nb is non-positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveC() {
        GIVEN int a = 1, b = 2, c = 0;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals("a is positive\nb is positive\nc is non-positive", System.out.toString());
    }

}



```
2025-07-18 16:44:54.597 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Refining code...
2025-07-18 16:44:54.597 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
2025-07-18 16:46:11.778 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:33)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Building a prompt with explanation how to fix issue...
2025-07-18 16:46:11.780 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generating code...
2025-07-18 16:46:11.780 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Using prompt:

There is this issue with code and how to fix it, provide only code, no other explanations:

Optional[Add semicolons at the end of each statement starting from line 32.  



]

In this code:

package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven() {
        GIVEN int input = 4;
        WHEN boolean result = service.isEven(input);
        THEN assertTrue(result);
    }

    @Test
    void testIsEvenNegative() {
        GIVEN int input = -5;
        WHEN boolean result = service.isEven(input);
        THEN assertFalse(result);
    }

    @Test
    void testHighComplexityMethodPositive() {
        GIVEN int a = 1, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals("a is positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveA() {
        GIVEN int a = 0, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals("a is positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNegativeA() {
        GIVEN int a = -1, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals("a is non-positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveB() {
        GIVEN int a = 1, b = 0, c = 3;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals("a is positive\nb is non-positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveC() {
        GIVEN int a = 1, b = 2, c = 0;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals("a is positive\nb is positive\nc is non-positive", System.out.toString());
    }

}


# Instructions:
1. Focus on the specific error given.
2. Ensure that the corrected code passes and assertions are valid.
3. Keep unrelated parts of the test unchanged.
4. Follow existing project standards, including naming and formatting.
5. Give output as a plain text

2025-07-18 16:46:11.780 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-18 16:48:27.047 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 7883, outputTokenCount = 745, totalTokenCount = 8628 }
2025-07-18 16:48:27.047 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
2025-07-18 16:48:27.047 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generated code:
```java
package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven() {
        GIVEN int input = 4;
        WHEN boolean result = service.isEven(input);
        THEN assertTrue(result);
    }

    @Test
    void testIsEvenNegative() {
        GIVEN int input = -5;
        WHEN boolean result = service.isEven(input);
        THEN assertFalse(result);
    }

    @Test
    void testHighComplexityMethodPositive() {
        GIVEN int a = 1, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals("a is positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveA() {
        GIVEN int a = 0, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals("a is positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNegativeA() {
        GIVEN int a = -1, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals("a is non-positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveB() {
        GIVEN int a = 1, b = 0, c = 3;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals("a is positive\nb is non-positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveC() {
        GIVEN int a = 1, b = 2, c = 0;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals("a is positive\nb is positive\nc is non-positive", System.out.toString());
    }

}
```
2025-07-18 16:48:27.049 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Refining code...
2025-07-18 16:48:27.049 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
2025-07-18 16:48:29.100 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:33)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Building a prompt with explanation how to fix issue...
2025-07-18 16:48:29.102 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generating code...
2025-07-18 16:48:29.102 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Using prompt:

There is this issue with code and how to fix it, provide only code, no other explanations:

Optional[Add semicolons at the end of each statement starting from line 32.  



]

In this code:

package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven() {
        GIVEN int input = 4;
        WHEN boolean result = service.isEven(input);
        THEN assertTrue(result);
    }

    @Test
    void testIsEvenNegative() {
        GIVEN int input = -5;
        WHEN boolean result = service.isEven(input);
        THEN assertFalse(result);
    }

    @Test
    void testHighComplexityMethodPositive() {
        GIVEN int a = 1, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals("a is positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveA() {
        GIVEN int a = 0, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals("a is positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNegativeA() {
        GIVEN int a = -1, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals("a is non-positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveB() {
        GIVEN int a = 1, b = 0, c = 3;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals("a is positive\nb is non-positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveC() {
        GIVEN int a = 1, b = 2, c = 0;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals("a is positive\nb is positive\nc is non-positive", System.out.toString());
    }

}

# Instructions:
1. Focus on the specific error given.
2. Ensure that the corrected code passes and assertions are valid.
3. Keep unrelated parts of the test unchanged.
4. Follow existing project standards, including naming and formatting.
5. Give output as a plain text

2025-07-18 16:48:29.103 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-18 16:49:57.042 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 3049, outputTokenCount = 750, totalTokenCount = 3799 }
2025-07-18 16:49:57.043 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
2025-07-18 16:49:57.043 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generated code:
```java
package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven() {
        GIVEN int input = 4;
        WHEN boolean result = service.isEven(input);
        THEN assertTrue(result);
    }

    @Test
    void testIsEvenNegative() {
        GIVEN int input = -5;
        WHEN boolean result = service.isEven(input);
        THEN assertFalse(result);
    }

    @Test
    void testHighComplexityMethodPositive() {
        GIVEN int a = 1, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c); 
        THEN assertEquals("a is positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveA() {
        GIVEN int a = 0, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c); 
        THEN assertEquals("a is positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNegativeA() {
        GIVEN int a = -1, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c); 
        THEN assertEquals("a is non-positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveB() {
        GIVEN int a = 1, b = 0, c = 3;
        WHEN service.highComplexityMethod(a, b, c); 
        THEN assertEquals("a is positive\nb is non-positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveC() {
        GIVEN int a = 1, b = 2, c = 0;
        WHEN service.highComplexityMethod(a, b, c); 
        THEN assertEquals("a is positive\nb is positive\nc is non-positive", System.out.toString());
    }

}
```
2025-07-18 16:49:57.043 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Refining code...
2025-07-18 16:49:57.044 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
2025-07-18 16:49:59.066 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:33)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Building a prompt with explanation how to fix issue...
2025-07-18 16:49:59.066 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generating code...
2025-07-18 16:49:59.066 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Using prompt:

There is this issue with code and how to fix it, provide only code, no other explanations:

Optional[Add semicolons at the end of each statement starting from line 32.  



]

In this code:

package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven() {
        GIVEN int input = 4;
        WHEN boolean result = service.isEven(input);
        THEN assertTrue(result);
    }

    @Test
    void testIsEvenNegative() {
        GIVEN int input = -5;
        WHEN boolean result = service.isEven(input);
        THEN assertFalse(result);
    }

    @Test
    void testHighComplexityMethodPositive() {
        GIVEN int a = 1, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c); 
        THEN assertEquals("a is positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveA() {
        GIVEN int a = 0, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c); 
        THEN assertEquals("a is positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNegativeA() {
        GIVEN int a = -1, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c); 
        THEN assertEquals("a is non-positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveB() {
        GIVEN int a = 1, b = 0, c = 3;
        WHEN service.highComplexityMethod(a, b, c); 
        THEN assertEquals("a is positive\nb is non-positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveC() {
        GIVEN int a = 1, b = 2, c = 0;
        WHEN service.highComplexityMethod(a, b, c); 
        THEN assertEquals("a is positive\nb is positive\nc is non-positive", System.out.toString());
    }

}

# Instructions:
1. Focus on the specific error given.
2. Ensure that the corrected code passes and assertions are valid.
3. Keep unrelated parts of the test unchanged.
4. Follow existing project standards, including naming and formatting.
5. Give output as a plain text

2025-07-18 16:49:59.066 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-18 16:51:27.965 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 4663, outputTokenCount = 750, totalTokenCount = 5413 }
2025-07-18 16:51:27.965 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
2025-07-18 16:51:27.965 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generated code:
```java
package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven() {
        GIVEN int input = 4;
        WHEN boolean result = service.isEven(input);
        THEN assertTrue(result);
    }

    @Test
    void testIsEvenNegative() {
        GIVEN int input = -5;
        WHEN boolean result = service.isEven(input);
        THEN assertFalse(result);
    }

    @Test
    void testHighComplexityMethodPositive() {
        GIVEN int a = 1, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c); 
        THEN assertEquals("a is positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveA() {
        GIVEN int a = 0, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c); 
        THEN assertEquals("a is positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNegativeA() {
        GIVEN int a = -1, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c); 
        THEN assertEquals("a is non-positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveB() {
        GIVEN int a = 1, b = 0, c = 3;
        WHEN service.highComplexityMethod(a, b, c); 
        THEN assertEquals("a is positive\nb is non-positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveC() {
        GIVEN int a = 1, b = 2, c = 0;
        WHEN service.highComplexityMethod(a, b, c); 
        THEN assertEquals("a is positive\nb is positive\nc is non-positive", System.out.toString());
    }

}
```
2025-07-18 16:51:27.965 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Refining code...
2025-07-18 16:51:27.965 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
2025-07-18 16:55:10.001 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-18 16:55:10.002 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:34)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Building a prompt for fixing unit tests issue...
2025-07-18 16:55:10.002 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generating code...
2025-07-18 16:55:10.002 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package org.example;

public class Service {
    public boolean isEven(int input) {
        return input % 2 == 0;
    }

    public void highComplexityMethod(int a, int b, int c) {
        if (a == 0) {
            System.out.println("a is positive");
            if (b > 0) {
                System.out.println("b is positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            } else {
                System.out.println("b is non-positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            }
        } else if (a < 0) {
            System.out.println("a is non-positive");
            if (b > 0) {
                System.out.println("b is positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            } else {
                System.out.println("b is non-positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            }
        } else {
            System.out.println("a is non-positive");
            if (b > 0) {
                System.out.println("b is positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            } else {
                System.out.println("b is non-positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            }
        }
    }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven() {
        GIVEN int input = 4;
        WHEN boolean result = service.isEven(input);
        THEN assertTrue(result);
    }

    @Test
    void testIsEvenNegative() {
        GIVEN int input = -5;
        WHEN boolean result = service.isEven(input);
        THEN assertFalse(result);
    }

    @Test
    void testHighComplexityMethodPositive() {
        GIVEN int a = 1, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c); 
        THEN assertEquals("a is positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveA() {
        GIVEN int a = 0, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c); 
        THEN assertEquals("a is positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNegativeA() {
        GIVEN int a = -1, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c); 
        THEN assertEquals("a is non-positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveB() {
        GIVEN int a = 1, b = 0, c = 3;
        WHEN service.highComplexityMethod(a, b, c); 
        THEN assertEquals("a is positive\nb is non-positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveC() {
        GIVEN int a = 1, b = 2, c = 0;
        WHEN service.highComplexityMethod(a, b, c); 
        THEN assertEquals("a is positive\nb is positive\nc is non-positive", System.out.toString());
    }

}

>> REQUIREMENTS:

1. The response must contain fully functional test code.
2. The response must be in plain text (no code block formatting like '''java ''').
3. Place the generated tests in the SAME PACKAGE as the input JAVA class.
4. Follow this naming convention for the test class: use the original class name and append "GeneratedAiTests".
  - Do not add another "s" if the class name already ends with "s".
  - Do not append "Tests" if the class name ends with "x", "ch", "sh", or "ss".
    Example: `HelloAction` becomes `HelloActionGeneratedAiTests`.
5. Use JUNIT5 for the test framework, MOCKITO for mocking, and ASSERTJ for assertions.
6. Exclude `DisplayName` annotations.
7. Include necessary imports for annotations like `@ExtendWith`.
8. Ensure each test method has at least one assertion.
9. Avoid generating tests for private methods—focus only on public and protected methods.
10. Ensure any modified state in the test is reset before each test with a `@BeforeEach` method.
11. Tests should be independent; no test should rely on the result of another.
12. If no mocks are needed, skip importing mock-related libraries.
13. Organize the test methods using the GIVEN WHEN THEN structure. Each test should begin with a GIVEN section that sets up the necessary preconditions or context, followed by a WHEN section that describes the action being tested, and concluding with a THEN section that specifies the expected outcome. Include comments for each section to clearly indicate their purpose.
14. If error compilation refers to 'reference to assertThat is ambiguous' please do not use org.assertj.core.api.Assertions.assertThat, apart that please use assertEquals(expected, actual) from org.junit.jupiter.api.Assertions.assertEquals
15. Please do not forget about necessary imports
16. Check if the class name matches the requirements, e.g. classWithUnitTests instead of classWithUnitTest
17. If a test fails, check it again to see if it's well written, is assertion correct

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

Correct the following error:

[ERROR] COMPILATION ERROR : 
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[32,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[32,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[33,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[33,13] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[34,24] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[34,25] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[34,31] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[39,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[39,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[40,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[40,13] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[41,25] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[41,26] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[41,32] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[46,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[46,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[47,21] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[48,26] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[48,95] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[53,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[53,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[54,21] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[55,26] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[55,95] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[60,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[60,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[61,21] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[62,26] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[62,99] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[67,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[67,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[68,21] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[69,26] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[69,99] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[74,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[74,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[75,21] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[76,26] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[76,99] ';' expected
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.11.0:testCompile (default-testCompile) on project dummy-java-project: Compilation failure: Compilation failure: 
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[32,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[32,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[33,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[33,13] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[34,24] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[34,25] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[34,31] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[39,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[39,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[40,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[40,13] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[41,25] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[41,26] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[41,32] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[46,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[46,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[47,21] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[48,26] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[48,95] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[53,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[53,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[54,21] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[55,26] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[55,95] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[60,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[60,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[61,21] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[62,26] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[62,99] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[67,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[67,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[68,21] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[69,26] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[69,99] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[74,9] not a statement
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[74,14] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[75,21] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[76,26] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[76,99] ';' expected
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException


# REQUIREMENTS:
1. Respond with the corrected class code.
2. Do not provide explanations or comments.

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

2025-07-18 16:55:10.003 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-18 16:57:08.479 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 7812, outputTokenCount = 690, totalTokenCount = 8502 }
2025-07-18 16:57:08.479 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
2025-07-18 16:57:08.479 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generated code:
```java
package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ServiceGeneratedAiTests {
    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven() {
        int input = 4;
        boolean result = service.isEven(input);
        assertTrue(result);
    }

    @Test
    void testIsEvenNegative() {
        int input = -5;
        boolean result = service.isEven(input);
        assertFalse(result);
    }

    @Test
    void testHighComplexityMethodPositive() {
        int a = 1, b = 2, c = 3;
        service.highComplexityMethod(a, b, c);
        assertEquals("a is positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveA() {
        int a = 0, b = 2, c = 3;
        service.highComplexityMethod(a, b, c);
        assertEquals("a is positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNegativeA() {
        int a = -1, b = 2, c = 3;
        service.highComplexityMethod(a, b, c);
        assertEquals("a is non-positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveB() {
        int a = 1, b = 0, c = 3;
        service.highComplexityMethod(a, b, c);
        assertEquals("a is positive\nb is non-positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNegativeB() {
        int a = 1, b = -2, c = 3;
        service.highComplexityMethod(a, b, c);
        assertEquals("a is positive\nb is non-positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveC() {
        int a = 1, b = 2, c = 0;
        service.highComplexityMethod(a, b, c);
        assertEquals("a is positive\nb is positive\nc is non-positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNegativeC() {
        int a = 1, b = 2, c = -3;
        service.highComplexityMethod(a, b, c);
        assertEquals("a is positive\nb is positive\nc is non-positive", System.out.toString());
    }


}



```
2025-07-18 16:57:08.481 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Refining code...
2025-07-18 16:57:08.481 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
2025-07-18 16:57:14.186 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-18 16:57:14.187 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:34)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Building a prompt for fixing unit tests issue...
2025-07-18 16:57:14.187 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generating code...
2025-07-18 16:57:14.187 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package org.example;

public class Service {
    public boolean isEven(int input) {
        return input % 2 == 0;
    }

    public void highComplexityMethod(int a, int b, int c) {
        if (a == 0) {
            System.out.println("a is positive");
            if (b > 0) {
                System.out.println("b is positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            } else {
                System.out.println("b is non-positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            }
        } else if (a < 0) {
            System.out.println("a is non-positive");
            if (b > 0) {
                System.out.println("b is positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            } else {
                System.out.println("b is non-positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            }
        } else {
            System.out.println("a is non-positive");
            if (b > 0) {
                System.out.println("b is positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            } else {
                System.out.println("b is non-positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            }
        }
    }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ServiceGeneratedAiTests {
    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven() {
        int input = 4;
        boolean result = service.isEven(input);
        assertTrue(result);
    }

    @Test
    void testIsEvenNegative() {
        int input = -5;
        boolean result = service.isEven(input);
        assertFalse(result);
    }

    @Test
    void testHighComplexityMethodPositive() {
        int a = 1, b = 2, c = 3;
        service.highComplexityMethod(a, b, c);
        assertEquals("a is positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveA() {
        int a = 0, b = 2, c = 3;
        service.highComplexityMethod(a, b, c);
        assertEquals("a is positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNegativeA() {
        int a = -1, b = 2, c = 3;
        service.highComplexityMethod(a, b, c);
        assertEquals("a is non-positive\nb is positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveB() {
        int a = 1, b = 0, c = 3;
        service.highComplexityMethod(a, b, c);
        assertEquals("a is positive\nb is non-positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNegativeB() {
        int a = 1, b = -2, c = 3;
        service.highComplexityMethod(a, b, c);
        assertEquals("a is positive\nb is non-positive\nc is positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNonPositiveC() {
        int a = 1, b = 2, c = 0;
        service.highComplexityMethod(a, b, c);
        assertEquals("a is positive\nb is positive\nc is non-positive", System.out.toString());
    }

    @Test
    void testHighComplexityMethodNegativeC() {
        int a = 1, b = 2, c = -3;
        service.highComplexityMethod(a, b, c);
        assertEquals("a is positive\nb is positive\nc is non-positive", System.out.toString());
    }


}


>> REQUIREMENTS:

1. The response must contain fully functional test code.
2. The response must be in plain text (no code block formatting like '''java ''').
3. Place the generated tests in the SAME PACKAGE as the input JAVA class.
4. Follow this naming convention for the test class: use the original class name and append "GeneratedAiTests".
  - Do not add another "s" if the class name already ends with "s".
  - Do not append "Tests" if the class name ends with "x", "ch", "sh", or "ss".
    Example: `HelloAction` becomes `HelloActionGeneratedAiTests`.
5. Use JUNIT5 for the test framework, MOCKITO for mocking, and ASSERTJ for assertions.
6. Exclude `DisplayName` annotations.
7. Include necessary imports for annotations like `@ExtendWith`.
8. Ensure each test method has at least one assertion.
9. Avoid generating tests for private methods—focus only on public and protected methods.
10. Ensure any modified state in the test is reset before each test with a `@BeforeEach` method.
11. Tests should be independent; no test should rely on the result of another.
12. If no mocks are needed, skip importing mock-related libraries.
13. Organize the test methods using the GIVEN WHEN THEN structure. Each test should begin with a GIVEN section that sets up the necessary preconditions or context, followed by a WHEN section that describes the action being tested, and concluding with a THEN section that specifies the expected outcome. Include comments for each section to clearly indicate their purpose.
14. If error compilation refers to 'reference to assertThat is ambiguous' please do not use org.assertj.core.api.Assertions.assertThat, apart that please use assertEquals(expected, actual) from org.junit.jupiter.api.Assertions.assertEquals
15. Please do not forget about necessary imports
16. Check if the class name matches the requirements, e.g. classWithUnitTests instead of classWithUnitTest
17. If a test fails, check it again to see if it's well written, is assertion correct

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

Correct the following error:

[ERROR] Tests run: 9, Failures: 7, Errors: 0, Skipped: 0, Time elapsed: 0.056 s <<< FAILURE! - in org.example.ServiceGeneratedAiTests
[ERROR] org.example.ServiceGeneratedAiTests.testHighComplexityMethodNonPositiveA  Time elapsed: 0.004 s  <<< FAILURE!
[ERROR] org.example.ServiceGeneratedAiTests.testHighComplexityMethodNonPositiveB  Time elapsed: 0.001 s  <<< FAILURE!
[ERROR] org.example.ServiceGeneratedAiTests.testHighComplexityMethodNonPositiveC  Time elapsed: 0.001 s  <<< FAILURE!
[ERROR] org.example.ServiceGeneratedAiTests.testHighComplexityMethodNegativeA  Time elapsed: 0 s  <<< FAILURE!
[ERROR] org.example.ServiceGeneratedAiTests.testHighComplexityMethodNegativeB  Time elapsed: 0.001 s  <<< FAILURE!
[ERROR] org.example.ServiceGeneratedAiTests.testHighComplexityMethodNegativeC  Time elapsed: 0.002 s  <<< FAILURE!
[ERROR] org.example.ServiceGeneratedAiTests.testHighComplexityMethodPositive  Time elapsed: 0.002 s  <<< FAILURE!
[ERROR] Failures: 
[ERROR]   ServiceGeneratedAiTests.testHighComplexityMethodNegativeA:61 expected: <a is non-positive
[ERROR]   ServiceGeneratedAiTests.testHighComplexityMethodNegativeB:75 expected: <a is positive
[ERROR]   ServiceGeneratedAiTests.testHighComplexityMethodNegativeC:89 expected: <a is positive
[ERROR]   ServiceGeneratedAiTests.testHighComplexityMethodNonPositiveA:54 expected: <a is positive
[ERROR]   ServiceGeneratedAiTests.testHighComplexityMethodNonPositiveB:68 expected: <a is positive
[ERROR]   ServiceGeneratedAiTests.testHighComplexityMethodNonPositiveC:82 expected: <a is positive
[ERROR]   ServiceGeneratedAiTests.testHighComplexityMethodPositive:47 expected: <a is positive
[ERROR] Tests run: 9, Failures: 7, Errors: 0, Skipped: 0
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:3.0.0:test (default-test) on project dummy-java-project: There are test failures.
[ERROR] 
[ERROR] Please refer to C:\Users\j_4k\AppData\Local\Temp\codeai-test-2220769367873468239\target\surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException


# REQUIREMENTS:
1. Respond with the corrected class code.
2. Do not provide explanations or comments.

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

2025-07-18 16:57:14.187 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-18 16:58:33.337 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 3618, outputTokenCount = 525, totalTokenCount = 4143 }
2025-07-18 16:58:33.337 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
2025-07-18 16:58:33.337 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generated code:
package org.example;

public class Service {
    public boolean isEven(int input) {
        return input % 2 == 0;
    }

    public void highComplexityMethod(int a, int b, int c) {
        if (a == 0) {
            System.out.println("a is positive");
            if (b > 0) {
                System.out.println("b is positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            } else {
                System.out.println("b is non-positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            }
        } else if (a < 0) {
            System.out.println("a is non-positive");
            if (b > 0) {
                System.out.println("b is positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            } else {
                System.out.println("b is non-positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            }
        } else {
            System.out.println("a is positive");
            if (b > 0) {
                System.out.println("b is positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            } else {
                System.out.println("b is non-positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            }
        }
    }
}



```
2025-07-18 16:58:33.337 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Refining code...
2025-07-18 16:58:33.339 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
2025-07-18 16:58:37.739 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-18 16:58:37.739 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:34)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Building a prompt for fixing unit tests issue...
2025-07-18 16:58:37.739 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generating code...
2025-07-18 16:58:37.739 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package org.example;

public class Service {
    public boolean isEven(int input) {
        return input % 2 == 0;
    }

    public void highComplexityMethod(int a, int b, int c) {
        if (a == 0) {
            System.out.println("a is positive");
            if (b > 0) {
                System.out.println("b is positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            } else {
                System.out.println("b is non-positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            }
        } else if (a < 0) {
            System.out.println("a is non-positive");
            if (b > 0) {
                System.out.println("b is positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            } else {
                System.out.println("b is non-positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            }
        } else {
            System.out.println("a is non-positive");
            if (b > 0) {
                System.out.println("b is positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            } else {
                System.out.println("b is non-positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            }
        }
    }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;

public class Service {
    public boolean isEven(int input) {
        return input % 2 == 0;
    }

    public void highComplexityMethod(int a, int b, int c) {
        if (a == 0) {
            System.out.println("a is positive");
            if (b > 0) {
                System.out.println("b is positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            } else {
                System.out.println("b is non-positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            }
        } else if (a < 0) {
            System.out.println("a is non-positive");
            if (b > 0) {
                System.out.println("b is positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            } else {
                System.out.println("b is non-positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            }
        } else {
            System.out.println("a is positive");
            if (b > 0) {
                System.out.println("b is positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            } else {
                System.out.println("b is non-positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            }
        }
    }
}


>> REQUIREMENTS:

1. The response must contain fully functional test code.
2. The response must be in plain text (no code block formatting like '''java ''').
3. Place the generated tests in the SAME PACKAGE as the input JAVA class.
4. Follow this naming convention for the test class: use the original class name and append "GeneratedAiTests".
  - Do not add another "s" if the class name already ends with "s".
  - Do not append "Tests" if the class name ends with "x", "ch", "sh", or "ss".
    Example: `HelloAction` becomes `HelloActionGeneratedAiTests`.
5. Use JUNIT5 for the test framework, MOCKITO for mocking, and ASSERTJ for assertions.
6. Exclude `DisplayName` annotations.
7. Include necessary imports for annotations like `@ExtendWith`.
8. Ensure each test method has at least one assertion.
9. Avoid generating tests for private methods—focus only on public and protected methods.
10. Ensure any modified state in the test is reset before each test with a `@BeforeEach` method.
11. Tests should be independent; no test should rely on the result of another.
12. If no mocks are needed, skip importing mock-related libraries.
13. Organize the test methods using the GIVEN WHEN THEN structure. Each test should begin with a GIVEN section that sets up the necessary preconditions or context, followed by a WHEN section that describes the action being tested, and concluding with a THEN section that specifies the expected outcome. Include comments for each section to clearly indicate their purpose.
14. If error compilation refers to 'reference to assertThat is ambiguous' please do not use org.assertj.core.api.Assertions.assertThat, apart that please use assertEquals(expected, actual) from org.junit.jupiter.api.Assertions.assertEquals
15. Please do not forget about necessary imports
16. Check if the class name matches the requirements, e.g. classWithUnitTests instead of classWithUnitTest
17. If a test fails, check it again to see if it's well written, is assertion correct

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

Correct the following error:

[ERROR] COMPILATION ERROR : 
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[19,8] class Service is public, should be declared in a file named Service.java
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.11.0:testCompile (default-testCompile) on project dummy-java-project: Compilation failure
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-2220769367873468239/src/test/java/org/example/ServiceGeneratedAiTests.java:[19,8] class Service is public, should be declared in a file named Service.java
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException


# REQUIREMENTS:
1. Respond with the corrected class code.
2. Do not provide explanations or comments.

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

2025-07-18 16:58:37.739 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-18 17:00:16.640 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 6462, outputTokenCount = 525, totalTokenCount = 6987 }
2025-07-18 17:00:16.640 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
2025-07-18 17:00:16.640 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Generated code:
package org.example;

public class Service {
    public boolean isEven(int input) {
        return input % 2 == 0;
    }

    public void highComplexityMethod(int a, int b, int c) {
        if (a == 0) {
            System.out.println("a is positive");
            if (b > 0) {
                System.out.println("b is positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            } else {
                System.out.println("b is non-positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            }
        } else if (a < 0) {
            System.out.println("a is non-positive");
            if (b > 0) {
                System.out.println("b is positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            } else {
                System.out.println("b is non-positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            }
        } else {
            System.out.println("a is positive");
            if (b > 0) {
                System.out.println("b is positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            } else {
                System.out.println("b is non-positive");
                if (c > 0) {
                    System.out.println("c is positive");
                } else {
                    System.out.println("c is non-positive");
                }
            }
        }
    }
}



```
2025-07-18 17:00:16.640 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Refining code...
2025-07-18 17:00:16.642 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=org.example.ServiceGeneratedAiTests.java}] - Done
*/
