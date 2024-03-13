package com.haianh123bg.shopbook;

import com.haianh123bg.shopbook.entity.TheLoai;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShopbookApplicationTests {

	@Test
	void contextLoads() {
		TheLoai theLoai = new TheLoai();
		theLoai.setMaTheLoai(1);
		theLoai.setTenTheLoai("Sách Giáo Khoa");
	}

}
