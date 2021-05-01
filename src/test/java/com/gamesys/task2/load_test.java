package com.gamesys.task2;


import org.jsmart.zerocode.core.domain.LoadWith;
import org.jsmart.zerocode.core.domain.TestMapping;
import org.jsmart.zerocode.jupiter.extension.ParallelLoadExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({ParallelLoadExtension.class})

public class load_test {

	
	@Test
	@LoadWith("load.properties")
	@TestMapping(testClass = request_test.class, testMethod = "getRequest")
	public void testLoad() {
	}
}
