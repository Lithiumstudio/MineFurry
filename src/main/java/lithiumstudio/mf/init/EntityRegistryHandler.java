package lithiumstudio.mf.init;

import lithiumstudio.mf.entities.EntityFurry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import lithiumstudio.mf.MineFurry;

import static lithiumstudio.mf.MineFurry.MODID;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityRegistryHandler
{
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES,

            MODID);


    public static final RegistryObject<EntityType<EntityFurry>> ENTITY_FURRY = ENTITY_TYPES.register("entity_furry",

            () -> EntityType.Builder.of(EntityFurry::new, MobCategory.CREATURE).sized(0.9f,1.6f).setTrackingRange(30)

                    .build(new ResourceLocation("mf:entity_furry").toString()));

}


