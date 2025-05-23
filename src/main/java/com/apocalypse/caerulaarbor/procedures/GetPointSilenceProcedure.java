package com.apocalypse.caerulaarbor.procedures;

import com.apocalypse.caerulaarbor.configuration.CaerulaConfigsConfiguration;
import com.apocalypse.caerulaarbor.network.CaerulaArborModVariables;
import net.minecraft.world.level.LevelAccessor;

public class GetPointSilenceProcedure {
	public static String execute(LevelAccessor world) {
		double rate = 0;
		if (CaerulaArborModVariables.MapVariables.get(world).strategy_silence >= 4) {
			return "\u00A74^&$%!!";
		}
		return Math.round(CaerulaArborModVariables.MapVariables.get(world).evo_point_silence) + "\u00A7c/"
				+ Math.round(Math.pow(CaerulaArborModVariables.MapVariables.get(world).strategy_silence + 1, 3) * (double) CaerulaConfigsConfiguration.COEFFICIENT.get() * 4);
	}
}
