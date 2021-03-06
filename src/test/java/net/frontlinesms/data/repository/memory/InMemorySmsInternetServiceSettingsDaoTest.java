/**
 * 
 */
package net.frontlinesms.data.repository.memory;

import net.frontlinesms.data.repository.ReusableSmsInternetServiceSettingsDaoTest;
import net.frontlinesms.data.repository.SmsInternetServiceSettingsDao;
import net.frontlinesms.data.repository.memory.InMemorySmsInternetServiceSettingsDao;

/**
 * Tests for in-memory implementation of {@link SmsInternetServiceSettingsDao}
 * @author Alex
 */
public class InMemorySmsInternetServiceSettingsDaoTest extends ReusableSmsInternetServiceSettingsDaoTest {
	/** Set up the test using the in-memory implementation of the DAO */
	@Override
	protected void setUp() throws Exception {
		super.setDao(new InMemorySmsInternetServiceSettingsDao());
	}
}
