package com.and.middle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// null X => 메모리에 올리는 방법. (==> Spring annotation )

@Component(value = "bean")
public class TestBean {
	public TestBean() {
		System.out.println("@Autowired가 되었다. 나는 null 아니다.");
	}
}
