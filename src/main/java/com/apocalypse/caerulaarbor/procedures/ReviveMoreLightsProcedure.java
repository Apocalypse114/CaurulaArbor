package com.apocalypse.caerulaarbor.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import com.apocalypse.caerulaarbor.network.CaerulaArborModVariables;

public class ReviveMoreLightsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
            double _setval = (entity.getCapability(CaerulaArborModVariables.PLAYER_VARIABLES_CAPABILITY).orElse(new CaerulaArborModVariables.PlayerVariables())).light + 24;
            entity.getCapability(CaerulaArborModVariables.PLAYER_VARIABLES_CAPABILITY).ifPresent(capability -> {
				capability.light = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
        if ((entity.getCapability(CaerulaArborModVariables.PLAYER_VARIABLES_CAPABILITY).orElse(new CaerulaArborModVariables.PlayerVariables())).light > 100) {
			{
				double _setval = 100;
                entity.getCapability(CaerulaArborModVariables.PLAYER_VARIABLES_CAPABILITY).ifPresent(capability -> {
					capability.light = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 3200, 2));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0));
	}
}
