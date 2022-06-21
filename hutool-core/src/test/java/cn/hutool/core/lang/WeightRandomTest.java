package cn.hutool.core.lang;

import cn.hutool.core.collection.ListUtil;
import org.junit.Assert;
import org.junit.Test;

public class WeightRandomTest {

	@Test
	public void weightRandomTest() {
		final WeightRandom<String> random = WeightRandom.of();
		random.add("A", 10);
		random.add("B", 50);
		random.add("C", 100);

		final String result = random.next();
		Assert.assertTrue(ListUtil.of("A", "B", "C").contains(result));
	}
}
