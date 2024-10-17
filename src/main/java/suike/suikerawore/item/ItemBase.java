package suike.suikerawore.item;

import java.util.List;
import java.util.ArrayList;

import suike.suikerawore.SuiKe;
import suike.suikerawore.expand.Examine;

import mezz.jei.api.JEIPlugin;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;

import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class ItemBase extends Item {
//物品
    public static final List<Item> ITEMS = new ArrayList<>();

    /*金*/public static final Item RAW_GOLD = new ItemBase("raw_gold", true);
    /*铁*/public static final Item RAW_IRON = new ItemBase("raw_iron", true);
    /*铜*/public static final Item RAW_COPPER = new ItemBase("raw_copper", true);
    /*锡*/public static final Item RAW_TIN = new ItemBase("raw_tin", true);
    /*锌*/public static final Item RAW_ZINC = new ItemBase("raw_zinc", true);
    /*铅*/public static final Item RAW_LEAD = new ItemBase("raw_lead", true);
    /*银*/public static final Item RAW_SILVER = new ItemBase("raw_silver", true);
    /*钴*/public static final Item RAW_COBALT = new ItemBase("raw_cobalt", true);
    /*锇*/public static final Item RAW_OSMIUM = new ItemBase("raw_osmium", true);
    /*镍*/public static final Item RAW_NICKEL = new ItemBase("raw_nickel", true);
    /*铱*/public static final Item RAW_IRIDIUM = new ItemBase("raw_iridium", true);
    /*铀*/public static final Item RAW_URANIUM = new ItemBase("raw_uranium", true);
    /*镓*/public static final Item RAW_GALLIUM = new ItemBase("raw_gallium", true);
    /*钛*/public static final Item RAW_TITANIUM = new ItemBase("raw_titanium", true);
    /*铂*/public static final Item RAW_PLATINUM = new ItemBase("raw_platinum", true);
    /*钨*/public static final Item RAW_TUNGSTEN = new ItemBase("raw_tungsten", true);
    /*铝*/public static final Item RAW_ALUMINIUM = new ItemBase("raw_aluminium", true);
    /*镁*/public static final Item RAW_MAGNESIUM = new ItemBase("raw_magnesium", true);
    /*锂*/public static final Item RAW_LITHIUM = new ItemBase("raw_lithium", true);
    /*钍*/public static final Item RAW_THORIUM = new ItemBase("raw_thorium", true);
    /*硼*/public static final Item RAW_BORON = new ItemBase("raw_boron", true);
    /*钒*/public static final Item RAW_VANADIUM = new ItemBase("raw_vanadium", true);
    /*镉*/public static final Item RAW_CADMIUM = new ItemBase("raw_cadmium", true);
    /*锰*/public static final Item RAW_MANGANESE = new ItemBase("raw_manganese", true);
    /*锗*/public static final Item RAW_GERMANIUM = new ItemBase("raw_germanium", true);
    /*铬*/public static final Item RAW_CHROMIUM = new ItemBase("raw_chromium", true);
    /*砷*/public static final Item RAW_ARSENIC = new ItemBase("raw_arsenic", true);

    /*更多粗矿*/
    /*阿迪特*/public static final Item RAW_ARDITE = new ItemBase("raw_ardite", Examine.TCID);
    /* 晶蓝 */public static final Item RAW_CERULEAN = new ItemBase("raw_cerulean", Examine.TheAurorianID);
    /*皎月石*/public static final Item RAW_MOONSTONE = new ItemBase("raw_moonstone", Examine.TheAurorianID);
    /*炽炎铁*/public static final Item RAW_OCTINE = new ItemBase("raw_octine", Examine.TheBetweenlandsID);
    /*赛摩铜*/public static final Item RAW_SYRMORITE = new ItemBase("raw_syrmorite", Examine.TheBetweenlandsID);
    /* 朱砂 */public static final Item RAW_CINNABAR = new ItemBase("raw_cinnabar", Examine.thaumcraftID);
    /*软碲铜*/public static final Item RAW_VULCANITE = new ItemBase("raw_vulcanite", Examine.vulcaniteID);
    /* 裂金 */public static final Item RAW_CHASMIUM = new ItemBase("raw_chasmium", Examine.MaelstromID);
    /*玫瑰金*/public static final Item RAW_ROSEGOLD = new ItemBase("raw_rosegold", Examine.虚拟人生);

    /*锭*/
    /*铜*/public static final Item INGOT_COPPER = new ItemBase("ingot_copper", true);
    /*锡*/public static final Item INGOT_TIN = new ItemBase("ingot_tin", true);
    /*锌*/public static final Item INGOT_ZINC = new ItemBase("ingot_zinc", true);
    /*铅*/public static final Item INGOT_LEAD = new ItemBase("ingot_lead", true);
    /*银*/public static final Item INGOT_SILVER = new ItemBase("ingot_silver", true);
    /*钴*/public static final Item INGOT_COBALT = new ItemBase("ingot_cobalt", true);
    /*锇*/public static final Item INGOT_OSMIUM = new ItemBase("ingot_osmium", true);
    /*镍*/public static final Item INGOT_NICKEL = new ItemBase("ingot_nickel", true);
    /*铱*/public static final Item INGOT_IRIDIUM = new ItemBase("ingot_iridium", true);
    /*铀*/public static final Item INGOT_URANIUM = new ItemBase("ingot_uranium", true);
    /*镓*/public static final Item INGOT_GALLIUM = new ItemBase("ingot_gallium", true);
    /*钛*/public static final Item INGOT_TITANIUM = new ItemBase("ingot_titanium", true);
    /*铂*/public static final Item INGOT_PLATINUM = new ItemBase("ingot_platinum", true);
    /*钨*/public static final Item INGOT_TUNGSTEN = new ItemBase("ingot_tungsten", true);
    /*铝*/public static final Item INGOT_ALUMINIUM = new ItemBase("ingot_aluminium", true);
    /*镁*/public static final Item INGOT_MAGNESIUM = new ItemBase("ingot_magnesium", true);
    /*锂*/public static final Item INGOT_LITHIUM = new ItemBase("ingot_lithium", true);
    /*钍*/public static final Item INGOT_THORIUM = new ItemBase("ingot_thorium", true);
    /*硼*/public static final Item INGOT_BORON = new ItemBase("ingot_boron", true);
    /*钒*/public static final Item INGOT_VANADIUM = new ItemBase("ingot_vanadium", true);
    /*镉*/public static final Item INGOT_CADMIUM = new ItemBase("ingot_cadmium", true);
    /*锰*/public static final Item INGOT_MANGANESE = new ItemBase("ingot_manganese", true);
    /*锗*/public static final Item INGOT_GERMANIUM = new ItemBase("ingot_germanium", true);
    /*铬*/public static final Item INGOT_CHROMIUM = new ItemBase("ingot_chromium", true);
    /*砷*/public static final Item INGOT_ARSENIC = new ItemBase("ingot_arsenic", true);

    /*铝粒*/public static final Item NUGGET_ALUMINIUM = new ItemBase("nugget_aluminium", true);

//构造函数
    public ItemBase(String name, boolean a) {
        if (a) {
            /*设置物品名*/setRegistryName(name);
            /*设置物品名key*/setUnlocalizedName(name + "_" + SuiKe.MODID);

            /*添加到ITEMS列表*/ITEMS.add(this);
        }
    }

//物品状态
    public boolean oreDictRaw = true;//首次添加矿词Raw

//注册物品
    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.registerAll(ITEMS.toArray(new Item[0]));
    }
    //注册模型
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for (Item item : ITEMS) {
            if (item instanceof ItemBase) {
                ((ItemBase) item).registerModels();
            }
        }
    }
    public void registerModels() {
        SuiKe.proxy.registerItemRenderer(this, 0, "inventory");
    }

//隐藏物品
    public static List<Item> itemsToRemove = new ArrayList<>();//物品移除列表
    public static void removeItem() {
        for (Item item : ITEMS) {
            /*获取物品名*/String itemName = item.getRegistryName().toString();
            /*用"_"分割物品名*/String[] parts = itemName.split("_");
            /*获取最后一部分*/itemName = parts[parts.length - 1].trim();
            /*通过物品名获取矿词后缀*/String type = itemName.substring(0, 1).toUpperCase() + itemName.substring(1);

            if (parts[0].trim().equals("suikerawore:nugget")) {
                //为粒时物品添加到物品移除列表
                itemsToRemove.add(item);
                continue;
            }

            /*矿词前缀*/String[] prefixes = {"ore", "ingot", "dust", "shard", "crushed", "crushedPurified", "cluster"};
            /*是否删除物品*/boolean removeItem = true;

            for (String prefix : prefixes) {
                /*矿词获取ItemStack*/ItemStack oreItemStack = oreStack(prefix + type);
                /*获取ItemStack物品名*/String oreItemStackName = oreItemStack.getItem().getRegistryName().toString();

                if (isValidItemStack(oreItemStack) && !oreItemStackName.startsWith("suikerawore")) {
                //找到有效的ItemStack
                    removeItem = false;
                    break;
                }
            }

            if (removeItem) {
                /*添加到物品移除列表*/itemsToRemove.add(item);
            }
        }

        /*从物品列表移除物品*/ITEMS.removeAll(itemsToRemove);

        if (!Examine.JEIID) {
            itemsToRemove.clear();
        }
    }
    @JEIPlugin
    public static class rawOreJEIPlugin implements IModPlugin {
        @Override
        public void register(IModRegistry registry) {
            //保存JEI帮助器
            IJeiHelpers jeiHelpers = registry.getJeiHelpers();

            if (jeiHelpers != null) {
                for (Item item : itemsToRemove) {
                    ItemStack itemStack = new ItemStack(item);
                    /*添加到JEI物品黑名单*/jeiHelpers.getItemBlacklist().addItemToBlacklist(itemStack);
                }
            }

            itemsToRemove.clear();
        }
    }

//矿词获取ItemStack
    public static ItemStack oreStack(String outputOD) {
        return oreStack(outputOD, 1);
    }
    public static ItemStack oreStack(String outputOD, int amount) {
        //获取对应的矿词列表
        NonNullList<ItemStack> outputList = OreDictionary.getOres(outputOD);

        if (!outputList.isEmpty()) {
            ItemStack outputStack = outputList.get(0).copy();
            outputStack.setCount(amount);//设置数量

            return outputStack;
        }

        return ItemStack.EMPTY;//返回空的ItemStack
    }

//检查ItemStack
    public static boolean isValidItemStack(ItemStack... stack) {
        for (ItemStack item : stack) {
            String stackString = item.toString().replaceAll("^\\d+x", "");
            if (stackString.equals("item.null@0") ||
                stackString.equals("tile.air@0") ||
                stackString.equals("item.@0") ||
                stackString.equals("tile.@0") ||
                stackString.equals("item.") ||
                stackString.equals("tile.")) {
                return false;//无效返回false
            }
        }
        return true;//有效返回true
    }
}