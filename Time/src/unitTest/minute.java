package unitTest;

import static org.junit.jupiter.api.Assertions.*;
import code.Time;
import org.junit.jupiter.api.Test;

class minute {

	@Test
	void test() {
Time time = new Time(6,45,30);
		
		
		int minute = time.getMinutes();
		
		assertEquals(45, minute);
	}

}
