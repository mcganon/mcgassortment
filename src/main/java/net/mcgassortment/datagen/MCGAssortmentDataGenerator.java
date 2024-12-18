package net.mcgassortment.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MCGAssortmentDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
			pack.addProvider(MCGBlockTagGenerator::new);
			pack.addProvider(MCGItemTagGenerator::new);
			pack.addProvider(MCGLootTableGenerator::new);
			pack.addProvider(MCGModelGenerator::new);
			pack.addProvider(MCGRecipeGenerator::new);
	}
}
