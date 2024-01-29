import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MyCollectionsTests {

    @Test
    public void testAddAll() {
        // Arrange
        List<String> list = new ArrayList<>();
        
        // Act
        list.addAll(Arrays.asList("item1", "item2", "item3"));
        
        // Assert
        assertThat(list).contains("item1", "item2", "item3");
    }

    @Test
    public void testSort() {
        // Arrange
        List<String> list = new ArrayList<>(Arrays.asList("c", "a", "b"));
        
        // Act
        Collections.sort(list);
        
        // Assert
        assertThat(list).containsExactly("a", "b", "c");
    }

    @Test
    public void testBinarySearch() {
        // Arrange
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        
        // Act
        int result = Collections.binarySearch(list, "b");
        
        // Assert
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void testCopy() {
        // Arrange
        List<String> dest = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> src = new ArrayList<>(Arrays.asList("x", "y", "z"));
        
        // Act
        Collections.copy(dest, src);
        
        // Assert
        assertThat(dest).containsExactly("x", "y", "z");
    }

    @Test
    public void testDisjoint() {
        // Arrange
        List<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> list2 = new ArrayList<>(Arrays.asList("x", "y", "z"));
        
        // Act
        boolean result = Collections.disjoint(list1, list2);
        
        // Assert
        assertThat(result).isTrue();
    }
}