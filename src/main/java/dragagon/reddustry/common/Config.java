package dragagon.reddustry.common;

import java.util.HashMap;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Config {
	
	public static HashMap<String, Boolean> config_boolean = new HashMap();
	public static HashMap<String, Integer> config_int = new HashMap();
	public static HashMap<String, Double> config_double = new HashMap();
	public static HashMap<String, String> config_string = new HashMap();
	public static HashMap<String, double[]> config_doubleArray = new HashMap();
	public static HashMap<String, int[]> config_intArray = new HashMap();
	public static HashMap<String, String[]> config_stringArray = new HashMap();
	
	static Configuration config;
	public static void preInit(FMLPreInitializationEvent event)
	{
		config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		// All additional config files loads go here.
	}
	
	public static void setBoolean(String key, boolean b)
	{
		config_boolean.put(key, b);
	}
	public static boolean getBoolean(String key)
	{
		Boolean b = config_boolean.get(key);
		return b!=null?b.booleanValue():false;
	}

	public static void setInt(String key, int i)
	{
		config_int.put(key, i);
	}
	public static int getInt(String key)
	{
		Integer i = config_int.get(key);
		return i!=null?i.intValue():0;
	}

	public static void setDouble(String key, double d)
	{
		config_double.put(key, d);
	}
	public static double getDouble(String key)
	{
		Double d = config_double.get(key);
		return d!=null?d.floatValue():0;
	}

	public static void setString(String key, String s)
	{
		config_string.put(key, s);
	}
	public static String getString(String key)
	{
		return config_string.get(key);
	}

	public static void setDoubleArray(String key, double[] dA)
	{
		config_doubleArray.put(key, dA);
	}
	public static double[] getDoubleArray(String key)
	{
		return config_doubleArray.get(key);
	}

	public static void setIntArray(String key, int[] iA)
	{
		config_intArray.put(key, iA);
	}
	public static int[] getIntArray(String key)
	{
		return config_intArray.get(key);
	}

	public static void setStringArray(String key, String[] dA)
	{
		config_stringArray.put(key, dA);
	}
	public static String[] getStringArray(String key)
	{
		return config_stringArray.get(key);
	}
}
