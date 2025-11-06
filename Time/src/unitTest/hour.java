package unitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import code.Time;
class hour {

	@Test
	void test() {
		Time time = new Time(6,45,30);
		
		
		int hour = time.getHours();
		
		assertEquals(6, hour);
	}

}
