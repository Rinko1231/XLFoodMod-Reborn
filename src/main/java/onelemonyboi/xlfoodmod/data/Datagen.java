package onelemonyboi.xlfoodmod.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.data.event.GatherDataEvent;

public class Datagen {

    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        PackOutput output = gen.getPackOutput();


        if (event.includeServer()) {

            gen.addProvider(event.includeServer(), new FeaturesConfigGen(output, event.getLookupProvider()));
        }
    }

}