package dev.evaan;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("ba-heal-codes")
public interface BAHealCodesConfig extends Config
{
	@ConfigItem(
		keyName = "wave4",
		name = "Wave 04",
		description = "Configures which heal code to display in wave 4"
	)
	default Waves.Wave4 wave4()
	{
		return Waves.Wave4.REGULAR;
	}

	@ConfigItem(
			keyName = "wave5",
			name = "Wave 05",
			description = "Configures which heal code to display in wave 5"
	)
	default Waves.Wave5 wave5()
	{
		return Waves.Wave5.REGULAR;
	}

	@ConfigItem(
			keyName = "wave6",
			name = "Wave 06",
			description = "Configures which heal code to display in wave 6"
	)
	default Waves.Wave6 wave6()
	{
		return Waves.Wave6.REGULAR;
	}

	@ConfigItem(
			keyName = "wave7",
			name = "Wave 07",
			description = "Configures which heal code to display in wave 7"
	)
	default Waves.Wave7 wave7()
	{
		return Waves.Wave7.REGULAR;
	}

	@ConfigItem(
			keyName = "wave8",
			name = "Wave 08",
			description = "Configures which heal code to display in wave 8"
	)
	default Waves.Wave8 wave8()
	{
		return Waves.Wave8.REGULAR;
	}

	@ConfigItem(
			keyName = "wave9",
			name = "Wave 09",
			description = "Configures which heal code to display in wave 9"
	)
	default Waves.Wave9 wave9()
	{
		return Waves.Wave9.REGULAR;
	}

	@ConfigItem(
			keyName = "wave10",
			name = "Wave 10",
			description = "Configures which heal code to display in wave 10"
	)
	default Waves.Wave10 wave10()
	{
		return Waves.Wave10.REGULAR;
	}
}
